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
	}
}