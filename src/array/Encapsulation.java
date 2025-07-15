package array;
import java.util.Scanner;
public class Encapsulation {
 private String name;
 
 public void setName(String name) {
	 this.name=name;
 }
  public String getName() {
	  return name;
  }
  public static void main(String[] args) {
	  Encapsulation obj=new Encapsulation();
	  Scanner sc=new Scanner(System.in);
	  String names = sc.nextLine();
	  obj.setName(names);
	  System.out.println("user name : "+obj.getName());
	  sc.close();
  }

}
