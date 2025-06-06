package curso;

public class Tabuada {
	
	public static void main(String[] args) {
		
		
		int i, j;
	
		for (i=1; i <= 10; i++) {
			j = 1;
			// System.out.println(" ");
			while ( j <= 10) {
				
				System.out.println("  " + i + " x " + j + " = " + (i * j)); // System.out.print(" " +i + " x " + j + " = " + (i * j));
				j++;
			}
			System.out.println("\n"); //System.out.println(" ");
		}
			
			
			
		
	}
}
