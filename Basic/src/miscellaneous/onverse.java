package miscellaneous;

public class onverse {

	public static void main(String[] args) {
		
	/*	void tobeConvert() {
	        String binary, hex, octal;
	        int num = 100;
	        Integer obj = new Integer(num); // Integer Wrapper class obj

	 

	        binary = obj.toBinaryString(num);
	        hex = obj.toHexString(num);
	        octal = obj.toOctalString(num);

	 

	        System.out.println("Decimal value : " + num);
	        System.out.println("Binary equivalent = " + binary);
	        System.out.println("Hexadecimal equivalent = " + hex);
	        System.out.println("Octal equivalent = " + octal);
	    }  */
		
		
		int count;
        char[] values = {'*', '7', 'p', ' ', 'P'};
       
        for (count = 0; count < values.length; count++)
        {
        if (Character.isDigit(values[count]))
        {
        System.out.println(values[count] + " is a digit");
        }
        if (Character.isLetter(values[count]))
        {
        System.out.println(values[count] + " is a letter");
        }
        if (Character.isUpperCase(values[count]))
        {
        System.out.println(values[count] + " is uppercase");
        }
        if(Character.isUnicodeIdentifierStart(values[count]))
        {
           System.out.println(values[count] + " is valid first"
                      + "character of Unicode identifier");
                  }
              }
	}

}
