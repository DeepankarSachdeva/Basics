package miscellaneous;

public class WrapperDemo {
	public static void main(String[] args) {
		//Creat a premitive type
		int a=5;
		float b=10.10f;
		
		//Integer aObj=new Integer(a);
		//Convert into Wrapper type
		
		Integer aObj=a;
		Float bObj=b;
		// creat Wrapper Class object
		
		Integer x=Integer.valueOf(100);
		Double y=Double.valueOf(20000.0);
		// Converting into back Primitive type
		int p=x.intValue();
		double q=y.doubleValue();
		
		System.out.println(p+" "+q);
		System.out.println(aObj + " "+bObj);
	}

}
