package first;

class staff
{
	private int empid;
	private String name;
	protected float salary,hra;
	
	public staff(int empid, String name, float salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	
	void getHRA()
	{
		hra=(salary*60)/100;
		System.out.println("HRa :"+hra);
	}
	
	void display()
	{
		//System.out.println("*******Employee Details************");
		System.out.println(empid +"  "+name+"  "+salary);
	}
}

class Manager extends staff {
    protected   float da;
    private float gross;
	public Manager(int empid, String name, float salary) {
		super(empid, name, salary);
		
	}
	
	void getDA()
	{
		da=(salary*80)/100;
		System.out.println(" DA is  :"+ da);
	}

	void getGROSS()
	{
		gross=salary+hra+da;
		System.out.println("GROSS Salary of Manager is  :"+gross);
	}
	
}
// from staff----> Manager--->Director
class Director extends Manager
{
private float ta,gross;
	public Director(int empid, String name, float salary) {
		super(empid, name, salary);
		
	}
	
	void getTA()
	{
		ta=(salary*30)/100;
		System.out.println("TA is  :"+ta);
	}
	
	
	void getGROSS()
	{
		gross=salary+hra+da+ta;
		System.out.println("GROSS Salary of DIrector is  :"+gross);
	}
	
	
	
}

public class MultiLevel2 {

	public static void main(String[] args) {
		
		Director d1=new Director(101,"Kean",5000);
		System.out.println("****Details******");
		d1.display();
		d1.getHRA();
		d1.getDA();
		d1.getTA();//Manager
		d1.getGROSS(); //director
		
		Manager m1=new Manager(201,"Marry",4000);
		
		System.out.println("*********Manager Details******");
		m1.display();
		m1.getHRA();
		m1.getDA();
		m1.getGROSS();
		
		staff s1=new staff(301,"Helen",3000);
		s1.display();
		s1.getHRA();
		
	}

}
