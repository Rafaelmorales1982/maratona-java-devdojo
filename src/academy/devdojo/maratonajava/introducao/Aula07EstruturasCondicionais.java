package academy.devdojo.maratonajava.introducao;

public class Aula07EstruturasCondicionais {

	public static void main(String[] args) {
		//Operador Ternário
		//Programa Doação para DevDojo
		//Fazer doação se o meu salário for > 5000 mil reais
		//Doar 500 reais
		double salario = 4999;
		String mensagemDoar = "Doar 500 reais DevDojo";
		String mensagemNaoDoar = "Ainda não tenho condições";
		
		String resultado = salario >= 5000 ? mensagemDoar : mensagemNaoDoar;
		
		System.out.println(resultado);
		
	
		
	}

}
