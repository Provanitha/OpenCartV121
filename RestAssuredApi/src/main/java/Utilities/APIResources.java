package Utilities;

public enum APIResources {
	
	//enum is special class in java which has collection of constants and methods
	

		LoginAPI("/api/ecom/auth/login"),
		AddProductAPI("/api/ecom/product/add-product"),
		CreateOrderAPI("/api/ecom/order/create-order") ,
		ViewOrderDetailsAPI("/api/ecom/order/get-orders-details"),
		DeleteProductAPI("/api/ecom/product/delete-product"),
		AddBookAPI("/Library/Addbook.php");

		
		private String resource;
		APIResources(String resource){
			this.resource=resource;
		}
		public String getResource() {
			return resource;
		}

		
		

}
