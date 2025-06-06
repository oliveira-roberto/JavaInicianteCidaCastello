package curso;

import java.util.Scanner;

public class DesafioExercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n1;
		double n2;
		
		System.out.print("Digite o primeiro numero: ");
		n1 = sc.nextDouble();
		System.out.print("Digite o segundo numero: ");
		n2 = sc.nextDouble();
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
