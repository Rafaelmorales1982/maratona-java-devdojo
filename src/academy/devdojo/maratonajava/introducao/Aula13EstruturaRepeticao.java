package academy.devdojo.maratonajava.introducao;

public class Aula13EstruturaRepeticao {

	public static void main(String[] args) {
		//Dado o valor de um carro, descubra em quantas ele pode ser parcelado
		//Condição valorParcela >= 1000
		double valorTotalCarro = 30000;
		for(int parcela = 1; parcela <= valorTotalCarro; parcela++) {
			double valorParcela = valorTotalCarro / parcela;
			if(valorParcela < 1000) {
				break;
			}
			System.out.println("Parcela: "+parcela+" R$: "+valorParcela);
		}

	}

}
