package array;

 class Person{
	 public void role() {
	System.out.println("I am a person");
  }
	 public void role(String str) {
		 System.out.println("In this situation, I act as a " + str);
	 }
}
 
 class father extends Person {
	 public void role() {
		 System.out.println("Here , I am father");
	 }
	 
 }
 class Cricketer extends Person {
	    
	    public void role() {
	        System.out.println("I am a cricketer on the field");
	    }
	}

 public class Polymorphism extends Person {

public void role() {
			System.out.println("I act different in different position");
		}
public static void main(String[] args) {
	Person p1=new father();
	Person p2=new Cricketer();
	Person p3=new Polymorphism();
	
	 p1.role();                    
     p2.role();                   
     p3.role();
	
	p1.role("father");
	p2.role("cricketer");
	
	
}
	}