package javacodingtasks;

import java.util.Arrays;

public class SortingArrays {

	public static void main(String[] args) {
		// using Arrays.sort() 
	/*	int a[]= {8, 6,9,10,67,89,56,0,3,5};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println("ascending order:" + a[i]);
		}

	}  */
		
		// using for loop ascending order
		
		int []sort1= new int[] {10,9,8,67,89,6,5,4,30,2};
		System.out.println("Afetr sorting Arrays:");
		
		for(int i=0; i< sort1.length; i++) {
			for(int j= i+1; j<sort1.length; j++) {
				int temp=0;
				if(sort1[i]>sort1[j]) { // --> if (sort[i]<sort[j]) it will print descending order
					
					temp= sort1[i];
					sort1[i]=sort1[j];
					sort1[j]=temp;
				}
		}
			System.out.println("Ascending order:" +sort1[i]);
		}
		
}
}











