import java.util.Arrays;

public class SortArraysEx {

	public static void main(String[] args) {
     int arr[] = {8, 6,9,0,6,8,5,4,3,5};
     
  //   Arrays.sort(arr);
     
//     for(int a:arr) {
//    	 System.out.println("Sorted array:" + a);
//     }
     
//     for(int i=0; i<arr.length; i++) {
//    	 System.out.println(arr[i] + " ");
//     }
     
     System.out.println("Before sorting:");
     
     for(int i=0; i<arr.length; i++) {
    	 for(int j=i+1; j<arr.length; j++) {
    		 if(arr[i]>arr[j]) {
    			 int temp;
    			 temp= arr[i];
    			 arr[i] = arr[j];
    			 arr[j] = temp;    		 
    			 }
    	 }
    	 System.out.println("after sorting ascending order:" + arr[i]);
     }
	}

}
