package API_TestCases;


import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.List;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.API_Testing.Listeners.BaseClass;
import com.API_Testing.Listeners.ExtentTestManager;
import com.github.javafaker.Faker;
import com.relevantcodes.extentreports.LogStatus;

import POJO_Classes.AddProductResponse;
import POJO_Classes.CreateOrderResponse;
import POJO_Classes.DeleteProductResponse;
import POJO_Classes.ViewOrderResponse;
import Utilities.APIResources;
import Utilities.LoginPage;
import Utilities.TestDataBuild;
import Utilities.Utils;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ProductOrder extends BaseClass {

	LoginPage loginPage = new LoginPage();
	TestDataBuild testData = new TestDataBuild();
	Utils util = new Utils();

	public static String productID;
	public static String order_Id;
	public static String prod_Order_Id;
	public static String productName;
	public static String productDescription;
	public static String productPrice;

	@Test
	public void a_validateCreateProduct() throws Exception {
		productName = new Faker().company().name();
		productDescription = new Faker().company().industry();
		productPrice = Integer.toString(new Faker().number().numberBetween(10000, 90000));
		loginPage.generateToken();
		RequestSpecification req_CreateProd = given().spec(util.requestSpecification())
				.header("Authorization", LoginPage.token).param("productName", productName)
				.param("productAddedBy", LoginPage.userID).param("productCategory", "Mobile")
				.param("productSubCategory", "Samsung").param("productPrice", productPrice)
				.param("productDescription", productDescription).param("productFor", "Human")
				.multiPart("productImage", new File(
						"C:\\WebApplication\\API Automation\\TestNG_RestAssuredFramework\\Resources\\Samsung.png"));
		Response resp_CreateProd = req_CreateProd.when().post(APIResources.valueOf("AddProductAPI").getResource())
				.then().extract().response();
		Reporter.log("Response is "+resp_CreateProd.asString(), true);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Response is "+resp_CreateProd.asString());
		Assert.assertEquals(resp_CreateProd.getStatusCode(), 201);
		AddProductResponse addProductResponse = resp_CreateProd.as(AddProductResponse.class);
		productID = addProductResponse.getProductId();
		Assert.assertEquals(addProductResponse.getMessage(), "Product Added Successfully");
	}

	@Test
	public void b_validateCreateOrder() throws Exception {
		RequestSpecification req_CreateOrder = given().spec(util.requestSpecification())
				.header("Authorization", LoginPage.token).contentType(ContentType.JSON)
				.body(testData.createOrderPayload(productID));
		Response resp_CreateOrder = req_CreateOrder.when().post(APIResources.valueOf("CreateOrderAPI").getResource())
				.then().extract().response();
		Reporter.log("Response is "+resp_CreateOrder.asString(), true);

		ExtentTestManager.getTest().log(LogStatus.INFO, "Response is "+resp_CreateOrder.asString());
		Assert.assertEquals(resp_CreateOrder.getStatusCode(), 201);
		CreateOrderResponse createOrderResponse = resp_CreateOrder.as(CreateOrderResponse.class);
		List<String> orderID = createOrderResponse.getOrders();
		order_Id = orderID.get(0);
		List<String> productOrderID = createOrderResponse.getProductOrderId();
		prod_Order_Id = productOrderID.get(0);
		Assert.assertEquals(createOrderResponse.getMessage(), "Order Placed Successfully");
	}

	@Test
	public void c_validateViewOrderDetails() throws Exception {

		RequestSpecification req_ViewOrder = given().queryParam("id", order_Id).spec(util.requestSpecification())
				.header("Authorization", LoginPage.token);
		Response resp_ViewOrder = req_ViewOrder.when().get(APIResources.valueOf("ViewOrderDetailsAPI").getResource())
				.then().extract().response();
		Reporter.log("Response is "+resp_ViewOrder.asString(), true);

		ExtentTestManager.getTest().log(LogStatus.INFO, "Response is "+resp_ViewOrder.asString());
		ViewOrderResponse viewOrderResponse = resp_ViewOrder.as(ViewOrderResponse.class);
		Assert.assertEquals(resp_ViewOrder.getStatusCode(), 200);
		Assert.assertEquals(viewOrderResponse.getData().get_id(), order_Id);
		Assert.assertEquals(viewOrderResponse.getData().getOrderBy(), util.getGlobalValues("userName"));
		Assert.assertEquals(viewOrderResponse.getData().getProductOrderedId(), prod_Order_Id);
		Assert.assertEquals(viewOrderResponse.getData().getProductName(), productName);
		Assert.assertEquals(viewOrderResponse.getData().getProductDescription(), productDescription);
		Assert.assertEquals(viewOrderResponse.getData().getOrderPrice(), productPrice);
		Assert.assertEquals(viewOrderResponse.getData().getCountry(), "India");
		Assert.assertEquals(viewOrderResponse.getMessage(), "Orders fetched for customer Successfully");
	}

	@Test
	public void d_validateDeleteAddedProduct() throws Exception {
		RequestSpecification req_DeleteProduct = given().pathParam("productId", productID).spec(util.requestSpecification())
				.header("Authorization", LoginPage.token);
		Response resp_DeleteProduct = req_DeleteProduct.when()
				.delete(APIResources.valueOf("DeleteProductAPI").getResource() + "/{productId}").then().extract()
				.response();
		Reporter.log("Response is "+resp_DeleteProduct.asString(), true);

		ExtentTestManager.getTest().log(LogStatus.INFO, "Response is "+resp_DeleteProduct.asString());
		DeleteProductResponse deleteProductResponse = resp_DeleteProduct.as(DeleteProductResponse.class);
		Assert.assertEquals(resp_DeleteProduct.getStatusCode(), 200);
		Assert.assertEquals(deleteProductResponse.getMessage(), "Product Deleted Successfully");
	}
}
