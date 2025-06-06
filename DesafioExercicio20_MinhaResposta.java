package curso;

import java.util.Locale;
import java.util.Scanner;

public class DesafioExercicio20_MinhaResposta {
	
	public static void main(String[] args) {
		// declara objetos
		Locale.setDefault(Locale.US);
		Scanner tela =new Scanner(System.in);
		
		// declara variaveis
		int soma =0;
		
		// entrada de dados
				
		System.out.print("Digite o primeiro numero: ");
		int num = Integer.parseInt(tela.nextLine());
		
		// etapa de processamento
		
		while ( num != 0) {
			soma = soma + num; // soma += num;
			System.out.print("Digite o proximo numero: ");
			num = Integer.parseInt(tela.nextLine());
		}
		System.out.println("Soma = " + soma);
	}

}
