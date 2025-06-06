package curso;

import java.util.Scanner;
class Exercicio17 {
	
	public static void main(String[] args) {
		int i;
		int soma = 0;
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite um valor para o somatorio: ");
		int n = Integer.parseInt(sc.nextLine());
		for (i = 0; i <= n; i++) {
			soma += i;
			
		}
		System.out.println("SOMA = " + soma);
		
	}

}
