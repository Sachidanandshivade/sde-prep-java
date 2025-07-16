package array;




abstract class  VehicleRegistration {
  private String Brand;
  private String model;
  private String Speed;
  private String fuellevel;
  
  public VehicleRegistration(String Brand,String model,String Speed, String fuellevel) {
	  this.Brand=Brand;
	  this.model=model;
	  this.Speed=Speed;
	  this.fuellevel=fuellevel;
  }
  public void displayInfo() {
	    System.out.println("Brand: " + Brand + ", Model: " + model + ", Speed: " + Speed + "km/h, Fuel Level: " + fuellevel + "L");
	}

  public abstract void startEngine();
  public abstract void stopEngine();
  
  public static void main(String[] args) {
	    Car car = new Car("Toyota", "Innova", "120", "50");
	    Bike bike = new Bike("Honda", "Shine", "90", "10");
	    Truck truck = new Truck("Tata", "ACE", "60", "100");

	    car.startEngine();
	    System.out.println();
	    car.displayInfo();
	    car.stopEngine();
	    System.out.println();

	    bike.startEngine();
	    System.out.println();
	    bike.displayInfo();
	    bike.stopEngine();
	    System.out.println();

	    truck.startEngine();
	    System.out.println();
	    truck.displayInfo();
	    truck.stopEngine();
	   
	}

}

class Car extends VehicleRegistration {
	public Car(String Brand,String model, String Speed,String fuellevel) {
		super(Brand, model,Speed, fuellevel);
	}
	
	public void startEngine() {
		System.out.print("Car starts");
	}
	 public void stopEngine() {
		 System.out.print("car stops");
	 }
}

class Bike extends VehicleRegistration {
	public Bike(String Brand,String model, String Speed,String fuellevel) {
		super(Brand, model,Speed, fuellevel);
	}
	
	public void startEngine() {
		System.out.print("Bike starts");
	}
	 public void stopEngine() {
		 System.out.print("Bike stops");
	 }
}

class Truck extends VehicleRegistration {
	public Truck(String Brand,String model, String Speed,String fuellevel) {
		super(Brand, model,Speed, fuellevel);
	}
	
	public void startEngine() {
		System.out.print("Truck starts");
	}
	 public void stopEngine() {
		 System.out.print("Truck stops");
	 }
}


