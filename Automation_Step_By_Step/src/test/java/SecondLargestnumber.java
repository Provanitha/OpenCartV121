
public class SecondLargestnumber {
		public static int getSecondLargest(int[] a, int total){  
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
			       return a[total-2];  
			}  
			public static void main(String args[]){  
			int a[]={1,2,5,6,3,2,8,9,0,99,80,};  
			int b[]={44,66,99,77,33,22,55,88,89};  
//			System.out.println("Second Largest: "+getSecondLargest(a,6));  
//			System.out.println("Second Largest: "+getSecondLargest(b,7)); 
			
			System.out.println("Second Largest: "+getSecondLargest(a, a.length));  
		//	System.out.println("Second Largest: "+getSecondLargest(b,b.length)); 

	}
	}


