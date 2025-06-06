package curso;

public class ExemplosArray {

	public static void main(String[] args) {
		// declaracoesde array
		int [] pontos;
		pontos = new int [5];
		
		// declaracao em uma unica linha
		int valores [] = new int [10];
		
		double [] notas = new double [10];
		
		//indices atribui valores salarios
		double [] salarios  = new double [5];
		salarios[0] = 3250.0;
		salarios[1] = 680.23;
		salarios[2] = 6200.0;
		salarios[3] = 7658.32;
		salarios[4] = 925.01;
		
		
		double [] despesas = {3250.0, 680.23, 6200, 7658.32};
		
		int [] num = {1,2,3,4,5,6,7,8,9};
		
		// para ler um vetor, percorrer vetor
		// laco repeticao
		for (int i=0; i < 9; i++) {
			// apresentar todos os elementos do vetor
			System.out.println(num[i]);
		}
		// o metodo lenght() e responsavel por retornnar o numero de um Array
		for (int j = 0; j < despesas.length; j++) {
			System.out.println(despesas [j]);
		}
		
		String nomes [] = new String [3];
		nomes [0] = "Maria";
		nomes [1] = "Jose";
		nomes [2] = "Anderson";
	//	nomes [3] = "Paula"; // o que aconteceraa aqui ==> erro exception
		for (int z = 0; z < nomes.length; z++) {
			System.out.println(nomes[z]);
		}
		
		

	}

}
