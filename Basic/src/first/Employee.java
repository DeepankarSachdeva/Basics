package first;

public class Employee {
	int empid;

    String name;
    public Employee(int empid, String name) {
        this.name = name;
        this.empid = empid;
    }
    void display()
    {
        System.out.println("**************************");
        System.out.println("Employ id :"+empid);
        System.out.println("Employe name :"+name);
    }
}
