package academy.devdojo.maratonajava.introducao;

public class Aula14Arrays {

	public static void main(String[] args) {
		
		//criando array
		int[] idades = new int[3];
		
		idades[0] = 21;
		idades[1] = 15;
		idades[2] = 11;
		System.out.println("Posição1 :"+idades[0]);
		System.out.println("Posição2 :"+idades[1]);
		System.out.println("Posição3 :"+idades[2]);
		
		
		System.out.println("Atividade 02 Arrays");
		
		String[] nomes = new String[4];
		nomes[0] = "Goku";
		nomes[1] = "Kurosaki";
		nomes[2] = "Luffy";
		nomes[3] = "Hinata";
		
		for(int i = 0; i < nomes.length;i++) {
			System.out.println("FOR -> Nomes na lista: "+nomes[i]+ "-> Posição ->"+i);
		}
		
		
		//utilizando while
		int busca =0;
		while(busca < nomes.length) {
			System.out.println("WHILE -> Nome: "+nomes[busca]+" POSIÇÃO: "+busca);
			busca++;
		}
		
	}

}
