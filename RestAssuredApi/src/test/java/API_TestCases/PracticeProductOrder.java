package API_TestCases;



import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.API_Testing.Listeners.APIExtentManager;
import com.API_Testing.Listeners.BaseClass;
import com.API_Testing.Listeners.BaseTest;
import com.github.javafaker.Faker;
import POJO_Classes.AddProductResponse;
import POJO_Classes.CreateOrderResponse;
import POJO_Classes.DeleteProductResponse;
import POJO_Classes.ViewOrderResponse;
import Utilities.APIResources;
import Utilities.EnumHelper;
import Utilities.LogUtils;
import Utilities.LoginPage;
import Utilities.TestDataBuild;
import Utilities.Utils;
import io.restassured.response.Response;

public class PracticeProductOrder extends  BaseTest{
	
	
	LoginPage loginPage = new LoginPage();
	TestDataBuild testData = new TestDataBuild();
	Utils util = new Utils();

	public static String productID;
	public static String order_Id;
	public static String prod_Order_Id;
	public static String productName;
	public static String productDescription;
	public static String productPrice;
	

	@BeforeMethod
	public void beforeTest(Method m) throws Exception {
		APIExtentManager.apitest = APIExtentManager.apiextent.startTest(m.getName());
		new LogUtils().log().info("\n" + "**************** STARTING TEST: " + m.getName() + "*****************" + "\n");
		System.setProperty("-Djsse.enableSNIExtension", "false");
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod(Method m) {
		new LogUtils().log().info("\n" + "****************** END TEST: " + m.getName() + "********************" + "\n");
	}


	@Test
	public void a_addingProduct() throws Exception {
		   productName = new Faker().address().firstName();
		   productDescription = new Faker().company().industry();
	       productPrice = Integer.toString(new Faker().number().numberBetween(10000, 90000));
		   loginPage.generateToken();
	    
		   LinkedHashMap<String, String> header = new LinkedHashMap<String,String>();
	       header.put("Authorization", LoginPage.token);
	       LinkedHashMap<String, String> mul = new LinkedHashMap<String,String>();
	       mul.put("productImage", "C:\\WebApplication\\API Automation\\TestNG_RestAssuredFramework\\Resources\\Samsung.png");
	       LinkedHashMap<String, String> body = new LinkedHashMap<String,String>();
	       body.put("productName", productName);
	       body.put("productAddedBy", LoginPage.userID);
	       body.put("productCategory", "Mobile");
	       body.put("productSubCategory", "Samsung");
	       body.put("productPrice", productPrice);
	       body.put("productDescription", productDescription);
	       body.put("productFor", "Human");
	       Response response = util.requestWithHeaderAndFormDataBodyWithMultiPart(header, body, mul, EnumHelper.HTTP_Method.POST, APIResources.valueOf("AddProductAPI").getResource());
	

	      System.out.println(response.getStatusCode());
	      AddProductResponse res = response.as(AddProductResponse.class);
	      System.out.println(res.getMessage());
	      System.out.println(res.getProductId());
	      productID=res.getProductId();

	}
	
	@Test
	public void b_creatingOrder() throws Exception {

	       LinkedHashMap<String, String> header = new LinkedHashMap<String,String>();
	       header.put("Authorization", LoginPage.token);
	       header.put("Content-Type", "application/json");
	       Response response = util.requestWithHeaderAndJsonBody(header, testData.createOrderPayload(productID), EnumHelper.HTTP_Method.POST, APIResources.valueOf("CreateOrderAPI").getResource());

		   CreateOrderResponse createOrderResponse = response.as(CreateOrderResponse.class);
		   List<String> orderID = createOrderResponse.getOrders();
		   order_Id = orderID.get(0);
		   System.out.println(order_Id);
		   List<String> productOrderID = createOrderResponse.getProductOrderId();
		   prod_Order_Id = productOrderID.get(0);
		   System.out.println(prod_Order_Id);

		
		
	}
	
	@Test
	public void c_viewOrderDetails() throws Exception {

	       LinkedHashMap<String, String> header = new LinkedHashMap<String,String>();
	       header.put("Authorization", LoginPage.token);
	       LinkedHashMap<String, String> querryParam = new LinkedHashMap<String,String>();
	       querryParam.put("id", order_Id);
  
           Response response = util.requestWithHeaderAndParameter(2, header, querryParam, EnumHelper.HTTP_Method.GET, APIResources.valueOf("ViewOrderDetailsAPI").getResource());
   		   ViewOrderResponse viewOrderResponse = response.as(ViewOrderResponse.class);
   		 
   		   Assert.assertEquals(response.getStatusCode(), 200);
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
	public void d_deleteAddedProduct() throws Exception {

	       LinkedHashMap<String, String> header = new LinkedHashMap<String,String>();
	       header.put("Authorization", LoginPage.token);
	       LinkedHashMap<String, String> pathParam = new LinkedHashMap<String,String>();
	       pathParam.put("productId", productID);
			String key = null;
			for (Map.Entry<String, String> mp : pathParam.entrySet()) {
				key = mp.getKey();
				break;
			}

           Response response = util.requestWithHeaderAndParameter(1, header, pathParam, EnumHelper.HTTP_Method.DELETE, APIResources.valueOf("DeleteProductAPI").getResource() + "/{"+key+"}");
           
   		   DeleteProductResponse deleteProductResponse = response.as(DeleteProductResponse.class);
   		   Assert.assertEquals(response.getStatusCode(), 200);
   		   Assert.assertEquals(deleteProductResponse.getMessage(), "Product Deleted Successfully");
       
	
	}       

}
