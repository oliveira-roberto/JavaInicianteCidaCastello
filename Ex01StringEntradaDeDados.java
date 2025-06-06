package curso;
/**
 * @author r_bac
 * 
 */
import java.util.Scanner;

public class Ex01StringEntradaDeDados {

	public static void main(String[] args) {
		
		//declaracao de vafriaveis do tipo String
		String nome;
		String sobrenome;
		// entrada de dados - Scanner
		//declaracao do objeto
		Scanner teclado;
		//construir objeto
		teclado = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		//recebe a entrada de dados
		
		nome =  teclado.next();
		System.out.print("Digite seu sobrenome: ");
		sobrenome = teclado.next();
		
		//saida
		System.out.println(nome + " " + sobrenome);
		
		sobrenome = "Oliveira";
		

	}

}
