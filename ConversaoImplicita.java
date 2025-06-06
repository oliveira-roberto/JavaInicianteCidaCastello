package curso;
/**
 * 
 * Programa para conversao de dados
 * Explicitamente
 */
public class ConversaoImplicita {
	
	public static void main (String[] args) {
		
		//do menor para o maior
		byte varByte = 21;
		int varInt = varByte;
		System.out.println("Byte: " + varByte); // concatenar
		System.out.println("Int: " + varInt);
		
		double varDouble = varByte;
		System.out.println("Double: " + varDouble);
		
		
		
	}

}
