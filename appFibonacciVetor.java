package curso;

import javax.swing.JOptionPane;

public class appFibonacciVetor {

	public static void main(String[] args) {
		int tam;
		tam = Integer.parseInt(JOptionPane.showInputDialog("Numero de termos da sequencia de Fibonacci: "));
					
		int [] fibo = new int[tam];
		// indice
		fibo[0] = 0; // a
		fibo[1] =1;  // b
		
		for(int cont=2; cont<tam; cont++) {
			
			fibo[cont] = fibo [cont-2] + fibo[cont-1];
				
		}
		// saida
		for (int i : fibo) {
			System.out.println(i);
		}
		
		
		

	}

}
