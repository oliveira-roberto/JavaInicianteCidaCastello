package curso;

import java.util.Locale;
import java.util.Scanner;

public class Desafioexercicio20 {

	public static void main(String[] args) {
		// 
		// declara objetos
				Locale.setDefault(Locale.US);
				Scanner tela =new Scanner(System.in);
				
				// declara variaveis
				int soma =0;
				
				// entrada de dados
						
				System.out.print("Digite o primeiro numero: ");
				int num = Integer.parseInt(tela.nextLine());
				
				// etapa de processamento
				soma += num;   // soma = soma + num;
				while ( num != 0) {
					
					System.out.print("Digite o proximo numero: ");
					num = Integer.parseInt(tela.nextLine());
					soma += num;   // soma = soma + num;
				}
				System.out.println("Total da soma = " + soma);

	}

}
