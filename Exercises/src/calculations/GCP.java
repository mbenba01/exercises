package calculations;
import java.util.Scanner;
public class GCP {

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter first number:");
		int number1 = in.nextInt();
		System.out.println("Please enter Second number:");
		int number2 = in.nextInt();
		in.close();
		
		System.out.println("GCD of two numbers " + number1 + " and " + number2 + " is " + findGCD(number1, number2));
	}

	private static int findGCD(int number1, int number2) {

		if(number2 == 0) {
			return number1;
		}
		
		return findGCD(number2, number1%number2);
	}
		
	
	

}
