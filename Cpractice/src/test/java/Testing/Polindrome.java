package Testing;

public class Polindrome {

	public static void main(String[] args) {
		int rem, temp, sum=0;
		int num=454;
		temp=num;
		
		while(num>0) {
			rem= num%10;
			sum= sum*10+rem;
			num=num/10;
		}if(temp==sum) {
			System.out.println("polindrome");
			
		}else
			
			System.out.println("not polindrome");
		}
		
		

}
