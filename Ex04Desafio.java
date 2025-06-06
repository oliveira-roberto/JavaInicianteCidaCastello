package curso;

import java.util.Scanner;

/**
 * @author r_bac
 * Programa com a solucao ao desafio de apresentar a entrada de 2 numeros atraves de tela e 
 * exibir o resultado de suas somas
 */

public class Ex04Desafio {
	public static void main(String[] args) {
		
		//cria um objeto
		
		Scanner sc = new Scanner(System.in);
		
		//variaveis
		int num1;
		int num2;
		int soma;
		
		//entrada de dados
		System.out.print("Digite o primeiro numero: ");
		num1 = sc.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		num2 = sc.nextInt();
		
		//saida
		soma = num1 + num2;
		System.out.print("A soma de " + num1 + " + " + num2 + " = " + soma); 
		//System.out.println("A soma de " + num1 + " + " + num2 + " = " + (num1 + num2)); //opcional
		
		
		
		
		
	}

}
