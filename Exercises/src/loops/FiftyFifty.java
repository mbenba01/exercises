package loops;
/**
 * 
 * @author Mustapha Benbaziz
 * @version 1.01
 *
 */
public class FiftyFifty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 0;
		do {
			sum += i;
			i++;
		} while(i <= 100); 
		System.out.print(sum);
	}

}
