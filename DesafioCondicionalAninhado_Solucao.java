package curso;

import java.util.Locale;
import java.util.Scanner;

public class DesafioCondicionalAninhado_Solucao {
	public static void main(String[] args) {
		// configura Locale
		Locale.setDefault(Locale.US);
		
		// objeto tipo Scanner
		Scanner sc = new Scanner(System.in);
		
		// declara variaveis
		double nota1, nota2, media;
		
		
		// entrada de dados
		System.out.print("Nota 1: ");
		nota1 = Double.parseDouble(sc.nextLine());
		System.out.print("Nota 2: ");
		nota2 = Double.parseDouble(sc.nextLine());
		// calcula media
		media = (nota1 + nota2) / 2;
		
		// saida de dados
		
		if (media >= 9.0) {
				System.out.println(String.format("Media = %.2f\n Conceito: A\n  SituacaO: Aprovado", media));
		} else if (media >= 8.0) {
				System.out.println(String.format("Media = %.2f,  Conceito: B,  Situacao: Aprovado", media));
		} else if (media >= 7.0) {
				System.out.println(String.format("Media = %.2f,  Conceito: C,  Situacao: Aprovado", media));
		} else if (media >= 6.0) {
				System.out.println(String.format("Mediaa = %.2f,  Conceito: D,  Situacao: Recuperacao", media));
		} else {
				System.out.println(String.format("Media = %.2f\nConceito: E\nSituacao: Reprovado", media, args));
		}
			
			
		
	}

}
