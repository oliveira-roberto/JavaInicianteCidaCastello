package curso;

public class TextBlock {
	public static void main(String[] args) {
		
		String mensagem = """
				Ola Mundo do Java
				Este e o novo recurso Text Block
				Vamos ver como fica a nossa mensagem?
				""";
		System.out.println(mensagem);
		
 String str = "Java";
		
		int dia = 20;
		
		String mes = "Julho";
		
		double valor = 25.654;
		String saida = """
				Ola %s.
				Hoje e dia %d do mes de %s.
				O valor e R$ %.2f
				""".formatted(str, dia, mes, valor);
		System.out.println(saida);
		
	}

}
