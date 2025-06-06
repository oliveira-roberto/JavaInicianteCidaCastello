package curso;



import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;



public class AppDespesas {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double despesas [] = new double [4];
		// entrada
		
		
		for(int i = 0; i< despesas.length; i++) {
			
			System.out.print("Valor da despesa: ");
			//despesas[i] = Double.parseDouble(sc.nextLine());
			despesas[i] = Double.parseDouble(JOptionPane.showInputDialog("Valor da despesa R$ "));
			
			
			
		}
		
		// saida
		double valorTotal = 0;
		for (double desp : despesas ) {
			
			//System.out.println("Valor : R$ " + desp);
			valorTotal += desp;
		}
		//System.out.println("Valor total da despesa : R$ " + valorTotal);
		JOptionPane.showMessageDialog(null, "Valor total das despesas: R$ " + valorTotal);

	}

}
