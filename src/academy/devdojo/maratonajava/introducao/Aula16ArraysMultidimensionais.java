package academy.devdojo.maratonajava.introducao;

public class Aula16ArraysMultidimensionais {

	public static void main(String[] args) {
		int[][] dias = new int[3][3];
		
		dias[0][0]=1;
		dias[0][1]=2;
		dias[0][2]=3;
		
		dias[1][0]=11;
		dias[1][1]=12;
		dias[1][2]=13;
		
		dias[2][0]=21;
		dias[2][1]=22;
		dias[2][2]=23;
		
		for(int i= 0; i < dias.length; i++) {
			for(int j= 0; j < dias[i].length; j++) {
				System.out.println(dias[i][j]);
			}
		}
 
		//foreach
		System.out.println("-------------");
		for (int[] arrBase : dias) {
			for (int num : arrBase) {
				System.out.println(num);
			}
			
		}
	}

}
