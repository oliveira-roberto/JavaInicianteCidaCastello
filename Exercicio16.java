package curso;

public class Exercicio16 {

	public static void main(String[] args) {
		
		int i;
		int soma = 0;
		
		for (i=0; i<=100; i++) {
			soma = soma + i;
			//System.out.println("Soma = "+ soma);
		}
		System.out.println("Resultado da Soma de (1 + 2 + 3 +...+ 98 + 99 + 100 = " + soma);
	}
	
}
