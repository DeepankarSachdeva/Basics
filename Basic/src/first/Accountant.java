package first;

public class Accountant extends Employee {
	 String task ,tech;

	    public Accountant(int empid,String name, String t1,String t2)
	    {
	        super(empid,name);
	        this.task=t1;
	        this.tech=t2;
	    }

	    void display() {
	        super.display(); // invoke base class didplay() method
	        System.out.println("Accountant Task : "+task);
	        System.out.println("Accountant tech : "+tech);

	    }

}
