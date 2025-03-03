package javacodingtasks;

public class FindDuplicatesInString {

	public static void main(String[] args) {
		String a[]= new String [] {"java", "test", "play", "play", "java"};
		 
		boolean flag= false;
		for(int i=0; i<a.length; i++) {
			
			for (int j= i+1; j<a.length; j++) {
				if(a[i] == a[j]) {
					System.out.println("Duplicate elements in given String:" + a[i]);
					flag=true;
				}
			}
		}
		if(!flag) {
			System.out.println("No Duplicates found");
		}
	}

}
