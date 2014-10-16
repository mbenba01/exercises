package calculations;

public class GCP {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 48;
		int y = 72;
		int larger = x;
		int smaller = y;
		if( y > x) {
			larger = y;
			smaller = x;
		}
		int result = 0;
		for(int i = 0; i < larger; i++) {
				
				result = larger - smaller;	
				larger = smaller;
				smaller = result;
				
				if(result <= 0) 
					System.out.println("result: " + Math.abs(smaller));	
							
		
		}
		//System.out.println("result: " + larger);
	}
	
}
