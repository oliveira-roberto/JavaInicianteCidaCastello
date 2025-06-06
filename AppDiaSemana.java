package curso;

public class AppDiaSemana {
	
	public static void main(String[] args) {
		
		int dia =5;
		
		String  diaString;
		
		
		
		switch(dia) {
		
		case 1: {
			diaString = "Segunda-Feira";
			break;
			}	
		case 2: {
			diaString = "Terca-Feira";
			break;
			}	
		case 3: {
			diaString = "Quarta-Feira";
			break;
			}	
		case 4: {
			diaString = "Quinta-Feira";
			break;
			}	
		case 5: {
			diaString = "Sexta-Feira";
			break;
			}
		case 6: {
			diaString = "Sabado";
			break;
			}
		case 7: {
			diaString = "Domingo";
			break;
			}
			default: {
				diaString = "Dia invalido";
				break;
			} //fim switch
		}
		
		System.out.println(diaString);
	}

}
