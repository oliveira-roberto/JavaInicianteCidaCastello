package curso;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo25 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String alunos [] = {"Roberto", "Rodrigo", "Rafael"};
		double [] notas = new double[3];
		double media;
		boolean a = true;
		int i = 0;
		int j ;
		
		while (i < alunos.length) {
			System.out.println("Aluno: " + alunos[i]);
			media = 0.0;
			
			for (j =0; j < 2; j++) {
				System.out.print("Digite Nota " + (j +1) + ": ");
				notas[j]= Double.parseDouble(sc.nextLine());
				while (a == true) {
					if (notas[j] < 0 | notas[j] > 10) {
						System.out.print("Nota deve estar entre 0 e 1. Digite Nota " + (j + 1) + ": ");
						notas[j]= Double.parseDouble(sc.nextLine());
						
					}
					else {
				
					
						a = false;
					}
				}	
				media = media + notas [j];
				
				a = true;
				
			}
			System.out.println("Media do aluno " +  alunos[i] + ": " + (media / 2));
		    System.out.println(" ");
			i++;
			
		}
				
		System.out.println("fim do programa");
		
	}

}
