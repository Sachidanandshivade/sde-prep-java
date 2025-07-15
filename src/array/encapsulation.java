package array;
import java.util.Scanner;
public class encapsulation {
 private String name;
 
 public void setName(String name) {
	 this.name=name;
 }
  public String getName() {
	  return name;
  }
  public static void main(String[] args) {
	  encapsulation obj=new encapsulation();
	  Scanner sc=new Scanner(System.in);
	  String names = sc.nextLine();
	  obj.setName(names);
	  System.out.println("user name : "+obj.getName());
	  sc.close();
  }

}
