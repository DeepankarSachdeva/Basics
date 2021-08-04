package first;


class Honda extends Car
{
	public void hondastart()
	{
		Engine heng=new Engine();  //Composition Honda class fully dependent on Enginne
		heng.startEngine();
	}
}


public class ComposotionDemo {

	public static void main(String[] args) {
		
		
		Honda hondacity=new Honda();
		
		hondacity.setColor("silver");
		hondacity.setMax_speed(180);
		
		System.out.println("**************Honda Car Details*************");
		System.out.println(hondacity.getColor() +"  color");
		System.out.println(hondacity.getMax_speed()+"  speed");
		
		hondacity.hondastart();

	}

}
