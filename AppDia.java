package curso;

public class AppDia {

	public static void main(String[] args) {
		int dia =1;
		
		switch(dia) {
		
		case 1: {
			System.out.println("Segunda-Feira");
			break;
			}	
		case 2: {
			System.out.println("Terca-Feira");
			break;
		}	
		case 3: {
			System.out.println("Quarta-Feira");
			break;
		}	
		case 4: {
			System.out.println("Quinta-Feira");
			break;
		}	
		case 5: {
			System.out.println("Sexta-Feira");
			break;
		}
		case 6: {
			System.out.println("Sabado");
			break;
		}
		case 7: {
			System.out.println("Domingo");
			break;
		}
		default: {
			System.out.println("Dia invalido");
			break;
		}
			
		}
	}

}
