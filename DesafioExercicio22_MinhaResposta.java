package curso;

import java.util.Locale;
import java.util.Scanner;

public class DesafioExercicio22_MinhaResposta {

	public static void main(String[] args) {
		// Configura Objetos
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// declara variaveis
		long fat = 1, i;
				
		// processa - solucao com do while
		
		System.out.print("Digite o numero que deseja fatorar: ");
		long n = Long.parseLong(sc.nextLine());
		
		i = n;
		do {	
			fat = fat * i;
			i--;
		} while (i > 0);
		System.out.println ("O Fatorial de " + n + "! e' " + fat);
		
	}

}
