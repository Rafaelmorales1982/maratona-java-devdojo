package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {

	public static void main(String[] args) {
		 //Iniciando if estrutura condicional
	    //Programa vender bebidas >= 18 anos
	    //operador negação !

	    int idade = 17;
	    boolean isAutorizadoComprarBebida = idade >= 18; 

	    if(isAutorizadoComprarBebida){//Só entra aqui se for true
	      System.out.println("Autorizado para comprar bebida alcólica");
	    }

	    if(!isAutorizadoComprarBebida){//negação deixando false
	      System.out.println("Não foi autorizado para comprar bebida alcólica");
	    }

	    System.out.println("Fora do if");
	}

}
