package Inheritance;

public class User  {

	public static void main(String[] args) {

Guest guest = new Guest();
guest.read();

Developer dev = new Developer();
dev.read();
dev.write();

Admin adm= new Admin();
adm.read();
adm.write();
adm.manage();

	}

}
