package academy.devdojo.maratonajava.introducao;

public class Aula08SwitchCase {

	public static void main(String[] args) {
		//no switch pode tipos de dados
		//char, int, byte, short, enum, String
		
		//imprima o dia da semana, considerando 1 como domingo
		int dia = 8;
		switch(dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2: 
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5: 
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default :
			System.out.println("Número digitado errado, não é possível encontrar dia da semana");
			break;
		
		
		
		}
			
		
		//Programa Masculino M e Feminino F
		char sexo = 'M';
		switch (sexo) {
		case 'M':
			System.out.println("Masculino");
			break;
		case 'F':
			System.out.println("Feminino");
			break;
			default:
				System.out.println("inválido");
				break;
		}
		
	}

}
