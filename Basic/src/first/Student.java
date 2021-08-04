package first;

public class Student {
	
	int rollno;
	String name;
	Address ad; // Aggregation -has a relationship
	
	
	public Student(int rollno, String name, Address ad) {
		this.rollno = rollno;
		this.name = name;
		this.ad = ad;
	}

	void display()
	{
		System.out.println("-------Student Details-------");
		System.out.println("Student id :"+rollno);
		System.out.println("Student Name :"+name);
		System.out.println("Address :"+ad.city+ " "+ad.state + "  "+ ad.country+ "  "+ad.pincode);
	
	}
	

}
