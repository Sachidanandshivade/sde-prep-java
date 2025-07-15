package array;


class demo {
	String Car;
	public void name(String Car){
		this.Car=Car;
		System.out.print("this is "+Car);
	}
}

public class Inheritence extends demo {
 String model;
 public void sound(String model) {
	 this.model=model;
	 System.out.println("this model is "+model);
 }
 public static void main(String[] args) {
	 Inheritence Inhet=new Inheritence();
		Inhet.sound("fortuner");
		Inhet.name("toyota");

 }
}


