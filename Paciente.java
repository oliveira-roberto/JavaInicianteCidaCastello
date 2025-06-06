package curso;

import java.util.Locale;
import java.util.Scanner;

public class Paciente {
	
	/**
	 *  nome completo,
	 *  e-mail e telefone de contato
	 *  idade,peso e altura
	 * 
	 */
	
	public static void main(String[] args) {
		
		//config do Locale para classe
		Locale.setDefault(Locale.US);
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//declaracao das variaveis
		String nomeCompleto, email, telefone;
		int idade;
		double peso, altura;
		
		//entrada de dados
		System.out.print("Nome completo: ");
		nomeCompleto = sc.nextLine();
		
		System.out.print("E-mail: ");
		email = sc.nextLine();
		
		System.out.print("Telefone de contato: ");
		telefone = sc.nextLine();
		
		
		System.out.print("Idade: ");
		idade = Integer.parseInt(sc.nextLine());
				
					
		System.out.print("Peso: ");
		peso = Double.parseDouble(sc.nextLine());
		
		System.out.print("Altura: ");
		altura = Double.parseDouble(sc.nextLine());
		
		//saida de dados
		System.out.println("Nome: " + nomeCompleto);
		System.out.println("E-mail: " + email + 
				" Telefone: " + telefone);
		System.out.println("Idade: " + idade +
				" Peso: " + peso + 
				"Altura: " + altura);
		
		
		
		
		
	}

}
