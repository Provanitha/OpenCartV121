package javaCoding;

import java.util.Scanner;

public class IfelseConditions {
	public static void main (String ar[]) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();            
    String ans="";
    if(n%2==1){
      ans = "Weird";
    }
    else {
        if (n >= 2 && n <= 5) {
            ans = "Not Weird";
        } else if (n >= 6 && n <= 20) {
            ans = "Weird";
        } else {
            ans = "Not Weird";
        }
    
       //Complete the code
        
    }
    System.out.println(ans);
    
}
}
	



