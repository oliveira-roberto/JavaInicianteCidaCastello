package curso;

public class AppMeses {
	
	public static void main(String[] args) {
		
		
			String mes = "AGOSTOs";
			int mesNumero;
			
			
			switch(mes.toLowerCase()) {
			
			case "janeiro": {
				mesNumero = 1;
				break;
				}	
			case "feverereiro": {
				mesNumero = 2;
				break;
				}	
			case "marco": {
				mesNumero = 3;
				break;
				}	
			case "abril": {
				mesNumero = 4;
				break;
				}	
			case "maio": {
				mesNumero = 5;
				break;
				}
			case "junho": {
				mesNumero = 6;
				break;
				}
			case "julho": {
				mesNumero = 7;
				break;
				}
			case "agosto": {
				mesNumero = 8;;
				break;
				}	
			case "setembro": {
				mesNumero = 9;
				break;
				}	
			case "outubro": {
				mesNumero = 10;
				break;
				}	
			case "novembro": {
				mesNumero = 11;
				break;
				}
			case "dezembro": {
				mesNumero = 12;
				break;
				}
			default: {
				mesNumero = 0;
				break;
			}
		}		
		if (mesNumero == 0 ) {
			System.out.println("Mes invalido");
		} else {
			System.out.println("Mes: " + mesNumero);
		}
		
		
	}

}
