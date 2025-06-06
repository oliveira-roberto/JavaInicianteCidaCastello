package curso;
import java.util.Locale;

import javax.swing.JOptionPane;



public class AppFibonacci {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// declara variaveis
		int serie [];
		int n;
		
		// entrada de dados
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite numero de termos da Serie de Fibonacci a exibir: "));
		serie = new int[n];
		
		for (int i = 0; i < serie.length; i++) {
			
			if (i < 2) {
				serie[i] = i;
			} else {
				serie [i] = serie [i-1] + serie [i-2];
				
			}
		}
		System.out.println("Serie de Fibonacci desejada:");
		for (int j =0; j < n; j++) {
			System.out.print((j == (n-1)) ? serie[j] : serie [j] + ", ");
			
		}
		System.out.println("\n" + "Fim do programa");
	}

}
