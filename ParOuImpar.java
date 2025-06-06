package curso;

import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args) {
		
		//objeto do tipo Scanner
		Scanner sc = new Scanner(System.in);
		
		//declara variaveis
		int valor, resto;
		
		//entrada de dados
		System.out.print("Informe um valor: ");
		valor=sc.nextInt();
		
		//verifica se e par ou impar
		//resto = valor % 2;
		if (valor % 2 == 0) {
			System.out.println(valor + " e par");
		}
		else {
			System.out.println(valor + " e impar");
		}
	}

}
