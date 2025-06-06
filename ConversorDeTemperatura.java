package curso;

import java.util.Locale;
import java.util.Scanner;

public class ConversorDeTemperatura {
	
	public static void main(String[] args) {
		// configura Locale
		Locale.setDefault(Locale.US);
		
		// ojeto do tipo scanner
		Scanner sc = new Scanner(System.in);
		
		// declara variaveis
		double celsius, fah;
		final String TEXTO1 = "F, temperatura ideal para o experimento.";
		final String TEXTO2 = "F, temperatura inapropriada para o experimento.";
		
		// entrada de dados
		//System.out.print("Celsius = ");
		//celsius = sc.nextDouble();
		System.out.print("Digite a temperatura em Celsius: ");
		celsius = Double.parseDouble(sc.nextLine());
		
		// Processamento - Conversao
		fah = (9.0 * celsius + 160.0) / 5.0;
		
		// saida de dados 
		if (fah > 45.0 && fah < 90.0) {
			System.out.println(fah + TEXTO1);
			}
		else {
			System.out.println(fah + TEXTO2);
		}
		
				
	}

}
