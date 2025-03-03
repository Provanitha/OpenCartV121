
public class FirstLargestEle {
	
	 static int getLargestElement(int a[], int len){
		

	int temp;

		for(int i=0; i<len; i++){// 3<10-->true
			
		for(int j=i+1; j<len; j++){// 1<10 -->true // This loop controls the second element to compare with the current element from the outer loop.

		if(a[i] > a[j]){ // 3>1

	temp= a[i]; // swapping 
		a[i]= a[j];
		a[j] = temp; // temp = 9, a[3] = 8, a[7] = 9. a[3] > a[7] >> a[i] > a[j] > 9 >8  req swapping
		//
//			a[i]= a[i]+a[j]; // swapping  3= 3+1 =4
//			a[j]= a[i]-a[j];// 4-1 =3
//			a[i]=a[i]-a[j]; // 4-3 =1 // a[i]=1
//			
//			System.out.println("after swapping:"+ "a[i]= "+ a[i] + "a[j]= "+ a[j]);

		}
		}}// once loop have completed
		return a[len-1]; // 11-1 =10
		
	 }
	 
	 public static void main (String ar[]) {             // 9>8
		 int a1[]= {3,5,7,9,120,80,90,8,789,436,1999}; // {3, 5, 7, 8, 120, 80, 90, 9, 789, 436, 1999}.
		 System.out.println(a1.length);
		 System.out.println("first largest number:" +getLargestElement(a1, a1.length)); // The method uses this information to sort the array and return the largest element.
		
		 
	 }
}

