package curso;

import java.util.Scanner;

public class DesafioExercicio05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n1;
		int n2;
		int resultado;
		
		System.out.print("Digite o primeiro numero inteiro: ");
		n1 = sc.nextInt();
		System.out.print("Digite o segundo numero inteiro: ");
		n2 = sc.nextInt();
		System.out.println();
		System.out.println("Soma de : " +  n1 + " + " + n2 + " = " + (n1 + n2));
		System.out.println();
		System.out.println( "Subtracao de : "+ n1 + " - " + n2 + " = " + (n1 - n2));
		System.out.println();
		System.out.println( "Multiplicacao de : "+ n1 + " * " + n2 + " = " + (n1 * n2));
		System.out.println();
		System.out.println( "Divisáo de: "+ n1 + " / " + n2 + " = " + (n1 / n2));
	}
	

}
