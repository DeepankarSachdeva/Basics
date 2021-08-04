package first;

public class AggrigationDemo {

	public static void main(String[] args) {
		
		Address ad1=new Address("Bengaluru","Karnataka","india",15478);
		Address ad2=new Address("Pune","Downtown","Canada",15498);
		
		Student s1=new Student(101,"ravi",ad1);
		Student s2=new Student(102,"ram",ad2);
		
		s1.display();
		s2.display();

	}

}
