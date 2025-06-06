package curso;
/**
 * @author r_bac
 * Usnado sublinhado em numeros
 */
public class UsandoSublinhadoNumero {

	public static void main(String[] args) {
		
		long numeroCartaoDeCredito = 1234_5678_9012_3456L;
		System.out.println("Numero do Cartao de Credito: " + numeroCartaoDeCredito);
		
		//invalido
		//float pi = 3_.1415F;
		//float pi = 3._1415F;
		//long numeroCartaoDeCredito2 = 1234_56789012_3456_L;
		
		//validos
		//int varInt = 5_2;
		
		//invalido
		//int varInt = 52_;
	}
}
