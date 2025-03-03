
public class BinarySearch {
	
	public static int binarysort(int arr[], int target) {
		int left=0;
		int right= arr.length-1;
		
		for(int i=0; left<=right; i++) {
			int middle= left+(right-left)/2;
          if(arr[middle] == target) {
        	  return middle;
          }	  
        	  if (arr[middle] > target) {
        		  right = middle-1;
        	  }else {
        		  left= middle+1;
        	  }
        	 
          }
          return -1;
}
	

	public static void main(String[] args) {
		
		int num[]= {7, 8, 90, 25,67, 43};
		
		int findnum= 8;
		int resultarray= binarysort(num,findnum);
		
		if(findnum==-1) {
			System.out.println("not found element");
			
		}else {
			System.out.println("Element was found at the index: " + resultarray);
		}
	

	}

}
