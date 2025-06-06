package curso;

import java.util.Arrays;
import java.util.Random;

public class Exercicio27 {

	public static void main(String[] args) {
		
		int array[] = new int[50];
		Random random = new Random();
		
		int par=0, impar=0;
		int indicePar = 0, indiceImpar = 0;
		
		
		//gerar o array com numeros aleatorios
		
		for (int i=0; i<array.length; i++) {
			
			array[i] = 1 + random.nextInt(100);
			if (array[i] % 2 ==0) {
				// par
				par +=1;
				
			} else {
				impar +=1;
			}
		}
		
		// arrays par - impar
		int [] arrayPar = new int[par];
		int [] arrayImpar = new int[impar];
		
		// percorrer o array e preencher os arrays  par e impar
		for (int i =0; i<array.length; i++) {
			if (array[i] % 2 ==0 ) {
				arrayPar[indicePar] = array[i];
				indicePar +=1;
			} else {
				arrayImpar[indiceImpar] = array[i];
				indiceImpar+=1;
				
			}
		}
		// saida dos 3 vetores
		
		System.out.println("\nArray\n");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("\nPar\n");
		for (int i = 0; i < arrayPar.length; i++) {
			System.out.println(arrayPar[i]);
		}
		
		System.out.println("\nImpar\n");
		for (int i = 0; i < arrayImpar.length; i++) {
			System.out.println(arrayImpar[i]);
		}
		System.out.println("\nParcela Par: "+ arrayPar.length + " Parcela Impar: "+ arrayImpar.length + " Total: " + (arrayPar.length+arrayImpar.length));
		
		// ordenacao dos valores dos vetores
		// classe Arrays - metodo sort
		Arrays.sort(arrayPar);
		Arrays.sort(arrayImpar);
		System.out.println("Ordenados");
		
		System.out.println("\nPares Ordenados\n");
		for (int i = 0; i < arrayPar.length; i++) {
			System.out.println(arrayPar[i]);
		}
		
		System.out.println("\nImpares Ordenados\n");
		for (int i = 0; i < arrayImpar.length; i++) {
			System.out.println(arrayImpar[i]);
		}
		
		
	}

}
