package classExerise;

import java.util.Scanner;

public class carApp{    
	//create the main class   

	 public static void main(String[] args) {	
Scanner in=new Scanner (System.in);
Car car=new Car();
Car car2=new Car();
car.printData("Toyota", "RAV4", 40);

String ans="";

//create the while loop and if else statement
while
	(!ans.equalsIgnoreCase("x"))
	 {
	System.out.println ("a=accelerate b=break x=exit");
	ans=in.nextLine();
	if(ans.equalsIgnoreCase("a")) {
	car2.accelerate();
	
	}
	else if(ans.equalsIgnoreCase("b"))
	{
	car.brake();
	}
	else if(ans.equalsIgnoreCase("x"))
	{
	break;
	}

	 
	 }

	}

}//end of main

//class Car containing the methods and encapsulation
class Car{
	 private String brand;
	    private String model;
	    private int amountOfFuel; 
	    
	    
	    public Car()
	    {
	        brand = "";
	        model = "";
	        amountOfFuel = 0;
	    }
	    public void accelerate()
		 {
			 System.out.println("Car is accelerating");
		 }
		public void brake()
		{
			System.out.println("Car is breaking");
		}

	 public void printData (String brand, String model, int amountOfFuel) {
		
			System.out.println("Brand: " + brand);
			System.out.println("Model: " + model);
			System.out.println("Fuel: " + amountOfFuel);
		}
	
}

