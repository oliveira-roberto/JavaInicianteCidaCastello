package curso;

import java.util.Locale;
import java.util.Scanner;

public class Aula034_LacoWhile_2 {
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		
		int num = Integer.parseInt(sc.nextLine());
		
		while (num != 0) {
			System.out.println(Math.pow(num,2));
			System.out.print("Digite o proximo numero: 5");
			
			num = Integer.parseInt(sc.nextLine());
		}
		System.out.println("Fim do programa");
	}

}
