package academy.devdojo.maratonajava.introducao;

public class Aula12EstruturaRepeticao {

	public static void main(String[] args) {
		// Imprima os primeiros 25 números de um dado valor,50

		int valorMax = 50;
		for(int i = 0; i <= valorMax; i++) {
			if(i > 25) {
				break;
			}
			System.out.println("Valor parado é: "+i);
		}
		
	}

}
