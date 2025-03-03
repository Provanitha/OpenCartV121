package PackageStrg;

public class Tostringmethodexmple1 {
	private String name;
	private int age;
	private String occupation;
	
	public Tostringmethodexmple1(String name, int age, String occupation) {
		this.name= name;
		this.age= age;
		this.occupation= occupation;
	}
	
	  @Override
	    public String toString() {
	        return "Person{" +
	                "name='" + name + '\'' +
	                ", age=" + age +
	                ", occupation='" + occupation + '\'' +
	                '}';
	    }

	public static void main(String[] args) {
		Tostringmethodexmple1 tostr= new Tostringmethodexmple1("khanij", 25, "dev");
		System.out.println(tostr);

	}

}
