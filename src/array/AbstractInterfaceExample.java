package array;


interface A  {
	public void noise() ;
}

interface B {
	public void sound();
	
}
 class C implements A,B{
	 public C() {
		 System.out.println("this is constructor");
	 }
	public void noise() {
		System.out.println("this is noise method");
	}
	public void sound() {
		System.out.println("this is sound method");
	}
}
public class AbstractInterfaceExample {

	
	public static void main(String[] args) {
		C newClass =new C();
		newClass.noise();
		newClass.sound();
		
	}
}


