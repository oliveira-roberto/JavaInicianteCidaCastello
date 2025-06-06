package curso;

import java.util.Locale;
import java.util.Scanner;

public class Ex025_CalculoMedia {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n; // numero de alunos
		double [] notas = new double [2];
		double media = 0;
		
		for(n=1; n <= 3; n++) {
			
			System.out.println("Notas do Aluno: " + n);
			
			for (int i = 0; i < notas.length; i++) {
				System.out.print("Nota " + (i + 1) + ": ");
				notas[i] = Double.parseDouble(sc.nextLine());
				media += notas[i]; // media = media + notas[i];
						
			}
			media = media/2;
			System.out.println("Media = " + media);
			media = 0;
		}
		
	}

}
