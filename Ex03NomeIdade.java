package curso;

import java.util.Scanner;

public class Ex03NomeIdade {

	public static void main(String[] args) {
		//instanciar um objeto da classe Scanner
		//criar um objeto
		Scanner sc = new Scanner(System.in);
		//variaveis
		String nome;
		String sobrenome;
		int idade;
		
		//entrada de dados
		System.out.print("Digite seu nome: ");
		nome = sc.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		sobrenome = sc.nextLine();
		
		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();
		
		//saida 
		System.out.println("Seu nome e " + nome + " " + sobrenome + " e voce tem " + 
		idade + " anos");

	}

}
