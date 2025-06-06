package curso;

import java.util.Locale;
import java.util.Scanner;

public class DesafioCondicionalAninhado {
	public static void main(String[] args) {
		// configura Locale
		Locale.setDefault(Locale.US);
		
		// objeto tipo Scanner
		Scanner sc = new Scanner(System.in);
		
		// declara variaveis
		double nota1, nota2, media;
		final String MEDIA   = "         Media           ";
		final String MEDIA_A = "  Maior ou igual a 9,0   ";
		final String MEDIA_B = "  Media entre 8,0 e 8,9  ";
		final String MEDIA_C = "  Media entre 7,0 e 7,9  ";
		final String MEDIA_D = "  Media entre 6,0 e 6,9  ";
		final String MEDIA_E = "  Media menor que 6,0    ";
		
		final String CONCEITO   = " Conceito ";
		final String CONCEITO_A = "     A    ";;
		final String CONCEITO_B = "     B    ";;
		final String CONCEITO_C = "     C    ";;
		final String CONCEITO_D = "     D    ";;
		final String CONCEITO_E = "     E    ";;
		
		final String SITUACAO   = "   Situacao    ";
		final String SITUACAO_A = "   Aprovado    ";
		final String SITUACAO_B = "   Aprovado    ";
		final String SITUACAO_C = "   Aprovado    ";
		final String SITUACAO_D = "  Recuperacao  ";
		final String SITUACAO_E = "   Reprovado   ";
		
		// entrada de dados
		System.out.print("Entre com a primeira nota: ");
		nota1 = Double.parseDouble(sc.nextLine());
		System.out.print("Entre com a segunda nota: ");
		nota2 = Double.parseDouble(sc.nextLine());
		// calcula media
		media = (nota1 + nota2) / 2.0;
		
		// saida de dados
		System.out.println(MEDIA + CONCEITO + SITUACAO);
		if (media >= 9.0) {
			System.out.println(MEDIA_A + CONCEITO_A + SITUACAO_A);
		} else if (media >= 8.0 && media <= 8.9) {
			System.out.println(MEDIA_B + CONCEITO_B + SITUACAO_B);
		} else if (media >= 7.0 && media <= 7.9) {
				System.out.println(MEDIA_C + CONCEITO_C + SITUACAO_C);
		} else if (media >= 6.0 && media <= 6.9) {
					System.out.println(MEDIA_D + CONCEITO_D + SITUACAO_D);
		} else {
					System.out.println(MEDIA_E + CONCEITO_E + SITUACAO_E);
		}
			
			
		
	}

}
