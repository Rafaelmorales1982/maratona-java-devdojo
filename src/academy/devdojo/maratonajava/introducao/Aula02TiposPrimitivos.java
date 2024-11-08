package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
	
	public static void main(String[] args) {
		//psvm cria método void
		System.out.println("8 tipos primitivos");
		int idade = 42;
        double salarioDouble = 25000d;
		 float salarioFloat = 2500.0f;
	     byte idadeByte = 10;
	     short idadeShort = 20;
	     boolean verdadeiro = true;
	     boolean falso = false;
	     char caracter = 'M';
	     //String não é um tipo primitivo
	        String nome = "Rafael Morales";

	        System.out.println(nome+" sua idade é: "+idade+" anos");
	    System.out.println(salarioDouble);
        System.out.println(salarioFloat);
        System.out.println(idadeByte);
        System.out.println(idadeShort);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(caracter);
	}
}
