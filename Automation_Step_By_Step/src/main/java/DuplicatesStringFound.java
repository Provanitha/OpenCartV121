
public class DuplicatesStringFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String v[]= {"java", "python", "java"};

		Boolean isDuplicate=false;

		for(int i=0; i<v.length; i++){

		for(int j=i+1; j<v.length; j++){
		
		if(v[i] == v[j]){
			 System.out.println("duplicates found:" + v[i]);

		 isDuplicate=true;
		

		}}}
	if (!isDuplicate){
			System.out.println("no duplicates");


	}}}


		
