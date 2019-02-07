import java.util.*;

public class DataTypes{
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner (System.in);
		double Fahren;
		double Celsius;
		
		System.out.println("Input a degree in Fahrenheit: ");
		Fahren = scan.nextDouble();
		Celsius = ((Fahren - 32) * 5)/9;
		
		System.out.println(Fahren + " degree in Fahrenheit is equal to " + Celsius + " in Celsius");

		//one inch is 0.0254m
		double inches;
		double centimeters;

		System.out.println("Input a value for inches:");
		inches = scan.nextDouble();
		centimeters = inches * 0.0254 * 100;

		System.out.println(inches + " inch(es) is " + centimeters + " centimeters");
	}
}
