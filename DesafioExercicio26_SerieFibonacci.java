package curso;

import java.util.Scanner;

public class DesafioExercicio26_SerieFibonacci {

	public static void main(String[] args) {
		// declara vafriaves
		
		Scanner sc = new Scanner(System.in);
		int n;  // numero de termos da serie de Fibonacci
		int serie[];  // vetor da serie de Fibonacci
		
		
		// entrada de dados
		System.out.print("Digite numero de termos da sequencia de Fibonacci: ");
		n = Integer.parseInt(sc.nextLine());
		serie = new int [n];
		
		
		// gera a sequencia de Fibonacci
		for (int i = 0; i < serie.length; i++) {
			if (i < 2) {
				serie[i] = i;
				
			} else {
				serie [i] = serie [i-2] + serie [i-1];
				
			}
			
		}
	
		System.out.println("Sequencia de Fibonacci desejada:");
		for (int j =0; j < serie.length; j++) {
			System.out.println(serie[j] + ", ");
		}
		System.out.println("Fim do programa");
		
			

	}

}
