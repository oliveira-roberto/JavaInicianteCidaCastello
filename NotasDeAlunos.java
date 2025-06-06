package curso;

import java.util.Locale;
import java.util.Scanner;

public class NotasDeAlunos {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		int i = 1; // representa alunos
		double nota1, nota2, media;
		
		do {
			System.out.println("Aluno: " + i);
			System.out.print("Nota1: ");
			nota1 = Double.parseDouble(sc.nextLine());
			System.out.print("Nota2: ");
			nota2 = Double.parseDouble(sc.nextLine());
			media = (nota1 + nota2) / 2;
			
			System.out.println (media);
			System.out.println();
			i++;
			
		} while (i <= 3);
		System.out.println("Fim do Programa");
	}

}
