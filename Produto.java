package curso;

import java.util.Locale;
import java.util.Scanner;

public class Produto {
	
	/**
	 *  ID (int), nome (String), descricao(String), 
	 *  precoUnitario(double), quantidade(int), taxaDeImposto(double), 
	 *  precoTotal(doubl), valorDoImposto(double), valotTotalDaCompra(double)
	 * 
	 */

	public static void main(String[] args) {
		
		
		//Set Locale
		
		Locale.setDefault(Locale.US);
		
		//obnjeto do tipo Scanner
		Scanner sc = new Scanner (System.in);
				
		//declaracao das variaveis
		String nome, descricao;
		int id;
		double quantidade, preco, taxa;
		double valorDoImposto, valorDoProduto, valorTotal;
		
		//entrada de dados
		
		System.out.print("Id: ");
		id = Integer.parseInt(sc.nextLine());
		
		System.out.print("Nome: ");
		nome = sc.nextLine();
		
		System.out.print("Descricao: ");
		descricao = sc.nextLine();
		
		System.out.print("Quantidade: ");
		quantidade =  Double.parseDouble(sc.nextLine());
		
		System.out.print("Preco Unitario: ");
		preco = Double.parseDouble(sc.nextLine());
		
		System.out.print("Taxa de Imposto %: ");
		taxa = Double.parseDouble(sc.nextLine());
		
		//processamento
		valorDoProduto = quantidade * preco;
		valorDoImposto = (valorDoProduto * taxa) / 100;
		valorTotal = valorDoImposto + valorDoProduto;
		
		
		//saida de dados
		System.out.println("Produto: Codigo " + id + ", " + nome);
		System.out.println("Descrcao: " + descricao);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Preco Unitario: R$" + preco);
		System.out.println("Preco Total: R$ " + valorDoProduto);
		System.out.println("Valor do Imposto: R$" + valorDoImposto);
		System.out.println("Valor Total da Compra: R$ " + valorTotal);
		
	}
	
	
	
}
