import java.util.*;

public class DataTypes{
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner (System.in);
		double Fahren;
		double Celsius;
		double Kelvin;
		
		System.out.println("Input a degree in Fahrenheit: ");
		Fahren = scan.nextDouble();
		Celsius = ((Fahren - 32) * 5)/9;
		Kelvin = Celsius + 273.15;
		
		System.out.println(Fahren + " degree in Fahrenheit is equal to " + Celsius + " in Celsius");
		System.out.println("And " + Kelvin + " in Kelvin");

		//one inch is 0.0254m
		double inches;
		double centimeters;

		System.out.println("Input a value for inches:");
		inches = scan.nextDouble();
		centimeters = inches * 0.0254 * 100;

		System.out.println(inches + " inch(es) is " + centimeters + " centimeters");
	}
}
