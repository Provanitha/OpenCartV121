package javacodingtasks;

public class FirstLargestAndSecondLargestInArray {
	public static int[] getFirstAndSecondLargest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		int first_largest = a[total-1];
		int second_largest = a[total-2];  
		
		return  new int[] {first_largest, second_largest};
		}  
		public static void main(String args[]){  
		int a[]={1,2,5,6,3,2,8,9,0,99,80,};  
		
		int[] resultA = getFirstAndSecondLargest(a, a.length);
		
		   System.out.println("For array a:");
	        System.out.println("First Largest: " + resultA[0]);
	        System.out.println("Second Largest: " + resultA[1]);

       // int[] resultB = getLargestAndSecondLargest(b, b.length);
	//	int b[]={44,66,99,77,33,22,55,88,89};  
//		System.out.println("Second Largest: "+getSecondLargest(a,6));  
//		System.out.println("Second Largest: "+getSecondLargest(b,7)); 
		
		getFirstAndSecondLargest(a, a.length);
		
//		System.out.println("First Largest: "+getSecondLargest(a, a.length));  
//		System.out.println("First Largest: "+getSecondLargest(a, a.length)); 
//	//	System.out.println("Second Largest: "+getSecondLargest(b,b.length)); 

}
}