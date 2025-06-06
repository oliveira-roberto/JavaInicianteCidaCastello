package curso;

import java.util.Locale;
import java.util.Scanner;

public class CalculoDeNotas {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		int i = 1; // representa alunos
		double nota1, nota2, media;
		
		do {
			System.out.println("Aluno: " + i);
			System.out.print("Nota1: ");
			nota1 = Double.parseDouble(sc.nextLine());
			// validacao da nota 1
			while (nota1 < 0 || nota1 > 10) {    
				System.out.print("Nota deve ser entre 0 e 10. Nota1: ");
				nota1 = Double.parseDouble(sc.nextLine());
			}
			System.out.print("Nota2: ");
			nota2 = Double.parseDouble(sc.nextLine());
			// validacao da nota 2
			while (nota2 < 0 || nota2 > 10) {
				System.out.print("Nota deve ser entre 0 e 10. Nota2: ");
				nota2 = Double.parseDouble(sc.nextLine());
			}
			// calcula amedia
			media = (nota1 + nota2) / 2;
			System.out.println ("Media: " + media);
			System.out.println();
			// incremento de 1
			i++;
			
		} while (i <= 3);
		System.out.println("Fim do Programa");
	
		
	}

}
