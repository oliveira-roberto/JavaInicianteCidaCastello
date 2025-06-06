package curso;

public class ImparContinue {

	public static void main(String[] args) {
		
		int x;
			
		for (x = 1 ; x < 11; x++ ) {
			
			if ( x % 2 == 0) {
				continue; //break;
			}	
			/* else {
				System.out.println(x + " e impar");
					
				
			} */
			
			// System.out.println ((x % 2 ==0) ?  x + " e par" : x + " e impar");
			System.out.println(x + " e impar");
			
		}						
	}

}
