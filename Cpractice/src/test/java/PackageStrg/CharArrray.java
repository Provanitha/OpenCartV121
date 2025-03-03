package PackageStrg;

import java.util.Scanner;

public class CharArrray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
//		System.out.print(s);
        int count=0;
		char ch[]= s.toCharArray();
		for(int i=0; i<ch.length; i++) {
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]==ch[j]) {
		
		

	}
				count++;
				
				System.out.println("duplicate charaters in given string:" + ch[j]);
				System.out.println("duplicate charaters count:" + count);

}
		
}
		
	
}}
