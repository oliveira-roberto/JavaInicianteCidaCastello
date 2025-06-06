/**
 * 
 */
package curso;

/**
 * 
 */
public class ComandoBreak {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int x = 0;
		
		 while (true) {
			if ( x == 10) {
				System.out.println("Laco de repeticao interrompido");
				break;
			}
			System.out.println("valor de  x = " + x);
			
			x++;
		 }
			System.out.println("Depois do Laco de repeticao");

	}

}
