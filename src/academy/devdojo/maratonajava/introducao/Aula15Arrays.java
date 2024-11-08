package academy.devdojo.maratonajava.introducao;

public class Aula15Arrays {

	public static void main(String[] args) {
		
		//int[] numeros = new int[3];
		//int[] numeros = {1,2,3,4,5};
		int[] numeros = new int[]{1,2,3,4,5};
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Lista de Número: "+numeros[i]);
		}
		
		//utilizando foreach
		for (int num : numeros) {
			System.out.println("Lista foreach: "+num);
		}

	}

}
