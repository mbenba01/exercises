package calculations;
import java.util.Scanner;
public class GCDKeithExample {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter first number:");
		int x = in.nextInt();
		System.out.println("Please enter second number:");
		int y = in.nextInt();
		in.close();
		int z = 0;
		while(x != 0 && y != 0) {
			if(x > y) { 
				z = x - y;
				x = z;
			} 
			else { 
				z = y - x;
				y = z;
			}
		}
		if(x == 0) {
			System.out.println(y);
		} else {
			System.out.println(x);
		}

	}

}
