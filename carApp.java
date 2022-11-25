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

}

