package miscellaneous;

class Sample<T>  //Parameter class/Generic class(accept any type)
{
	private T data;  // generic Variable declaration

	public Sample(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}

public class GenericsClassDemo {

	public static void main(String[] args) {
		
		Sample<String> s1=new Sample<String>("Java Generics");  // creating an object of generic class type string
		System.out.println("Display from Genetric Class by passing String Object"+s1.getData());
		
		Sample<Integer> s2=new Sample<Integer>(200);
		System.out.println("Display from Genetric Class by passing Integer Object"+s2.getData());
		

		Sample<Double> s3=new Sample<Double>(555.50);
		System.out.println("Display from Genetric Class by passing Double Object"+s3.getData());
		

	}

}
