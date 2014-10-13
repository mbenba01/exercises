package calculations;

public class GCP {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 72;
		int y = 54;
		int larger = x;
		int smaller = y;
		int diff = larger - smaller;
		while(diff != 0) {
			if(smaller > larger) {
				larger = smaller;
			}
			diff = larger - smaller;
			larger = diff;
		}
		System.out.print(diff);
		
		
	}
	
}
