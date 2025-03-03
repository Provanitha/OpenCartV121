package javacodingtasks;

public class SumOfArray {

	public static void main(String[] args) {
		int a[]= {2,5,2,5,25};
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

}
