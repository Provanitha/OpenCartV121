            package javacodingtasks;

public class RemoveTheDuplicatesInArr {

	public static void main(String[] args) {
		
	/*		
		int x[]={10, 20, 20, 30, 40, 40, 40, 50, 50};
		int n=x.length;
		int f=0;
		for(int i=0;i<n;i++)
		{
		f=0;
		for(int j=i+1;j<n;j++)
		{
		if(x[i] == x[j])
		{
		f=1;
		}
		}
		if(f==1)
		continue;
		System.out.print(" "+x[i]);
		}
		}

	}
*/

        // Sample array with duplicates
		
       int[] arr = {1, 2, 3, 2, 4, 3, 5, 6, 4};

        // Determine the new size of the array (maximum possible size is original array size)
        int n = arr.length;
        System.out.println("total length:"+ n);
        
      

        // Iterate through the array and remove duplicates
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    // Shift the elements to the left to remove the duplicate
                    for (int k = j; k < n - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    // Decrease the size of the array by 1
                    n--;
                    j--; // Decrement j to check the new element that shifted into its place
                }
            }
        //    System.out.println("Array after removing duplicates:");
            System.out.println("After removing duplicates:" + arr[i]);
        }

        // Print the modified array
        
      //  for (int i = 0; i < n; i++) {
          
     //  }
    }
}



