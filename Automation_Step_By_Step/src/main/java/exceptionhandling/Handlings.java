package exceptionhandling;

public class Handlings {
// unchecked exception/ run time
	public static void main(String[] args) {

     int n=10;
     int m=0;
     try {
    	 int x= n/m;
         System.out.println(x);
     }catch(ArithmeticException e) {
    	 System.out.println("Error: Division by zero not allowed!");
    	 
     }finally {
    	 System.out.println("Program will continue after handling the exception");
     }
    
	}

}
