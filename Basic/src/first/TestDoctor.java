package first;

class Doctor
{
	int idnumber;
	String name;
    String address;
    
    
	public Doctor(int idnumber, String name, String address) {
		this.idnumber = idnumber;
		this.name = name;
		this.address = address;
	}
    
    
	void display() {
	    System.out.println("********* Doctor Details ***********");
	        System.out.println("The name is :" + name);
	        System.out.println("The number is :" + idnumber);
	        System.out.println("The address is :" + address);
	    }
    
}


class Specialist extends Doctor
{
	
	String Speciality;
	
	public Specialist(int idnumber, String name, String address) {
		super(idnumber, name, address);
		this.Speciality=Speciality;
	
	}

    void display() {
    super.display(); // call base class method
    System.out.println("The speciality is :" + Speciality);
    
    }
}
    
 class Nonspecialist extends Doctor
 {

	public Nonspecialist(int idnumber, String name, String address) {
		super(idnumber, name, address);
	
	}
	 
 }
    

public class TestDoctor {

	public static void main(String[] args) {
		
		Specialist spobj=new Specialist(1001,"Marry","New york");
		
		spobj.display();
		
		Nonspecialist nspobj=new Nonspecialist(1005,"john","sydeny");
		nspobj.display();
		

	}

}
