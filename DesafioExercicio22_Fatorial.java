package curso;

import java.util.Locale;
import java.util.Scanner;

public class DesafioExercicio22_Fatorial {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		// declara variaveis
		int n, fatorial, i; // i =1;
		
		fatorial = 1;
		
		System.out.print("Digite o valor: ");
		n = Integer.parseInt(sc.nextLine());
		i = n; // na logica decremental
		do {
			fatorial = fatorial * i;
			
			i--; //i++;
			
		} while (i > 0); // while (i<= n);
		System.out.println("O fatorial de " + n + "! = " + fatorial);
						

	}

}
