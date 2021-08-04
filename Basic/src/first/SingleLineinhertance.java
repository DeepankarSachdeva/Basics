package first;

public class SingleLineinhertance {

	public static void main(String[] args) {
		 Developer d1=new Developer(101,"james Goseling","JDBC");
	     Developer d2=new Developer(105,"Deepankar ","JDBC");
	        
	        d1.display();
	        d1.display1();
	        d2.display();
	        d2.display1();
	Accountant a1= new Accountant(201,"Gourav","Process salary Of employee","SAP");
	Accountant a2= new Accountant(205,"ram" , "Payment to vandor","tally");

	//invoke Accountant classs
	a1.display();
	a2.display();
	 }

}
