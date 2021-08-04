package first;

public class Developer extends Employee {
	String technology;

    public Developer(int empid ,String name,String tech) {
        super(empid,name);
        this.technology=tech;
    }
    void display1()
    {
        System.out.println("Technology Used :"+technology);

    }

}
