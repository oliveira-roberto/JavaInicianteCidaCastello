package curso;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// declara variaveis
		//criar objeto Scanner
		Scanner sc = new Scanner(System.in);
		double num1, num2, soma, subtracao;
		double multiplicacao, divisao;
		
		
		//entrada de dados
		System.out.print("Digite o primeiro numero: ");
		num1 = sc.nextDouble();
		
		System.out.print("Digite o segundo numero: ");
		num2 = sc.nextDouble();
		
		//processamento
		soma = num1 + num2;
		subtracao = num1 - num2;
		multiplicacao = num1 * num2;
		divisao = num1 / num2;
				
		//saida
		System.out.println("Soma = " + soma);
		System.out.println("Subtracao = " + subtracao);
		System.out.println("Multiplicacao = " + multiplicacao);
		System.out.print("Divisao = " + divisao);
		
		

	}

}
