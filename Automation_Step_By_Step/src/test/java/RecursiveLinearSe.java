
public class RecursiveLinearSe {
	
	
	public static int recursivesearchLinear(int arr[], int target, int index) {
		
		
		if(index == arr.length) {
			return -1; // not found
		}if (arr[index] == target) {
			return index; // found
	}
	return recursivesearchLinear (arr, target, index+1); // next index
		
		
}
	public static void main(String[] args) {
	int a[]= {9, 5, 7, 3, 1, 19};
	
	int target = 19;
	int r= recursivesearchLinear(a,target, 0);
	
	if(r==-1) {
		System.out.println("Element not found");
	}else {
		System.out.println("Element found at the index:"+ r);
	}

	}

}
