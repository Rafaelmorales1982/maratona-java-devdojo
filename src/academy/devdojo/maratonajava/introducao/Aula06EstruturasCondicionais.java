package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasCondicionais {
	 public static void main(String[] args) {
	        //Programa time de futebol com categorias infantil, juvenil e adulto
	        //idade < 15 categoria infantil
	        //idade >= 15 && idade < 18 Categoria juvenil
	        //idade >= 18 Categoria adulto
	        int idade = 12;
	        String nome = "Rafael Morales";
	        String time = "GEMA MARILENA PR";
	        String categoria;
	        if(idade < 15){
	            categoria = "Categoria infântil";
	        }else if(idade >= 15 && idade < 18){
	            categoria = "Categoria juvenil";
	        }else {
	            categoria = "Categoria adulto";
	        }

	        System.out.println(nome+" sua idade é "+ idade+" anos e está na  : "+categoria+" no time de futebol "+time);

	    }

}
