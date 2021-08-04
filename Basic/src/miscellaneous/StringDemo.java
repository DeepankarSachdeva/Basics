package miscellaneous;

public class StringDemo {
	private String firstString = "This is a new String";
    private String secondString = "This is a new String";
    private String concatString;
    private String replacedString;

 

    private boolean equal;
    
    void test() {
        equal = firstString.equals(secondString);
        concatString = "The appendage will come behind me "
                      .concat(secondString);
        replacedString = firstString.replace('i', 'z');
    }

 


    void print() {

 

        System.out.println("The concatenated value: " + concatString);
        System.out.println("Replacing i's with z's: " + replacedString);

 

        if (equal) {
             System.out.println("The two strings are equal");
        } else {
             System.out.println("The strings are not equal");
        }
    }

	public static void main(String[] args) {
		
		StringDemo s=new StringDemo();
		s.test();
		s.print();
		
		String s1="james gosling";
		String email="Raj@test.com";
			
		System.out.println("The Length of String :"+s1.length());
		
		if(email.indexOf('.')> email.indexOf('@'))
			System.out.println("Valid emailid");
		else 
			System.out.println("invalid emailid");
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.concat(email));
		System.out.println(s1.substring(2, 8)); //extract Substring
		System.out.println(s1.substring(6,s1.length()));
		

	
	}

}
