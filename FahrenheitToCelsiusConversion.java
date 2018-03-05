package fahrenheitToCelsiusConversion;

/**
 * Program: PrgExercise2.2
 * File: FahrenheitToCelsiusConversion.jpg
 * Summary: Converts a user-entered fahrenheit number into the celsius equivalent.
 * Author: Erica Morgan
 * Date: 03/01/2018
 */
import java.util.Scanner;

	public class FahrenheitToCelsiusConversion {

		public static void main(String[] args) {
			//Create the Scanner object
			Scanner input = new Scanner(System.in);
			//User input field
			System.out.print("Enter a degree in Fahrenheit:");
			double fahrenheit = input.nextDouble();
			//Convert fahrenheit to celsius
			double celsius = (5.0/9)*(fahrenheit-32);
			System.out.println(+fahrenheit+ " degrees in fahrenheit is " +celsius+ " degrees in celsius.");
			
	
	}

}
