package first;
// Multilevel Inheritance
public class Account { //base class for Saving account
	
	int accNo;
	String name;
	
	public Account(int accNo, String name) {
		this.accNo = accNo;
		this.name = name;
	}
	
	void display ()
	{
		
		System.out.println("**********************");
		System.out.println("Account no"+accNo);
		System.out.println(" ustomer Name"+name);
		
	}

}
