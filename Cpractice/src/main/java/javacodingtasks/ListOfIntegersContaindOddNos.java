package javacodingtasks;

public class ListOfIntegersContaindOddNos {

	public static void main(String[] args) {
		int a[]= {3,13, 19, 7, 5, 15,11,35};
	//	int flag=1;
		for(int i=0; i<a.length; i++) {
		if(a[i]%2==0) {
			//	flag=0;
			//}if(flag==0) {
				
			System.out.println("given array contains even integers.");
			}else {
				System.out.println("Given array containd only odd integers");
			}
		}
	}

}
