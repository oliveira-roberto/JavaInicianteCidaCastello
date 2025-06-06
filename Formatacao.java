package curso;

public class Formatacao {
	
	public static void main(String[] args) {
		
		String str = "Java";
		
		int dia = 20;
		
		String mes = "Julho";
		
		double valor = 25.654;
		
		
		String saida = String.format("Ola %s, hoje e dia %d do mes de %s, o valor e R$ %.2f", str, dia, mes, valor);
		System.out.println(saida);
		
		
	}

}
