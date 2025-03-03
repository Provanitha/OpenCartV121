package PackageStrg;

public class Occurences {

	public static void main(String[] args) {
		String h= "hello good morning";
        int totalcount= h.length();
        System.out.println(totalcount);
        int total_count_withoutspace= h.replace("o", "").length();
  System.out.println(total_count_withoutspace);
		int count=totalcount-total_count_withoutspace;
	System.out.println("num of occurances:"+ count);
		

//String s= "Sakkett";
//
//int totallength= s.length();
//int afterremovingduplicate= s.replace("kt", " ").length();
//
//int duplicate= totallength - afterremovingduplicate;
//
//System.out.println(duplicate);

	}

}
