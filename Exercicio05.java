package curso;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// declara variaveis
		//criar objeto Scanner
		Scanner sc = new Scanner(System.in); 
        sc.useLocale(Locale.US); //alterar o padrao de entrada do padrao brasileiro para americano
		int num1, num2, soma, subtracao;
		int multiplicacao, divisao;
		int resto; // acrescentou ao exercicio durante a aula
		
		//entrada de dados
		System.out.print("Digite o primeiro numero: ");
		num1 = sc.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		num2 = sc.nextInt();
		
		//processamento
		soma = num1 + num2;
		subtracao = num1 - num2;
		multiplicacao = num1 * num2;
		divisao = num1 / num2;
		resto = num1 % num2; // acrescentou ao  exercicio
		
		//saida
		System.out.println("Soma = " + soma);
		System.out.println("Subtracao = " + subtracao);
		System.out.println("Multiplicacao = " + multiplicacao);
		System.out.print("Divisao = " + divisao);
		System.out.print("      Resto da divisao = " + resto); //acrescentou durante a aula
		

	}

}
