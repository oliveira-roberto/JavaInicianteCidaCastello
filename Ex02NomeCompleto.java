package curso;

import java.util.Scanner;


public class Ex02NomeCompleto {
	
	public static void main(String[] args) {
		
		//objeto Scanner
		Scanner teclado = new Scanner (System.in);
		//variavel do tipo String
		String nomeCompleto;
		System.out.print("Digite seu nome completo: ");
		nomeCompleto = teclado.nextLine();
		
		//saida
		System.out.println("Ola, " + nomeCompleto + ", voce esta no curso de Java para Iniciantes!");
		
	}

}
