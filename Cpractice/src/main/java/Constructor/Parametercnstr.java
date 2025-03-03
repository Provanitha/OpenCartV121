package Constructor;

public class Parametercnstr {
	
	int id;
	double pincode;
	String village_name;
	float salary;
	boolean t;
	
	Parametercnstr(int i,double p,String v,float s,boolean t){
		id=2;
		pincode= 515425;
		village_name= "Padesh";
		salary= 80000.890f;
		t= true;
	}	
		void Employee_data() {
			System.out.println(id+ " " +pincode+ " "+village_name+ " "+salary+" "+t);
			
		}
		
	

	public static void main(String[] args) {
		
		Parametercnstr parms= new Parametercnstr(2, 515425, "Padesh", 80000.890f, true);
		parms.Employee_data();
			
		}


	}

