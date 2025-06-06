package curso;

public class Desafio18MinhaResposta {

	public static void main(String[] args) {
		//declara as variavesis
		int i, j, s;
		boolean a = true;
		// processa - calculo da soma
		
		s = 0; j = 1; 
		for (i = 1; i <= 50; i++) {
			//j = (a ? j = i; a = false | j = i + 2));
			if (a) {
				a = false;
				
				
			}
			else {
				j = i + 2;
			}
					
			s = s + (j / i);
			
		}
		System.out.println("S = " + s);
	}
}
