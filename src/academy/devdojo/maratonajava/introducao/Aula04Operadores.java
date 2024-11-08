package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {

	 public static void main(String[] args) {
	        //operadores básicos + - / *
	        int numero01 = 10;
	        int numero02 = 20;
	        double divisao = (double) numero01 / numero02;//fazendo cast
	        int soma = numero01 + numero02;
	        double multiplicacao = (double) numero01 * numero02;
	        int subtracao = numero01 - numero02;
	        System.out.println("Valor da soma: "+soma);
	        System.out.println("Valor da divisão: "+divisao);
	        System.out.println("Valor da multiplicação: "+multiplicacao);
	        System.out.println("Valor da subtração: "+subtracao);
	        
	        //resto da divisão % 0 valor par e 1 impar
	        int resto = 21 % 7;
	        System.out.println("resto da divisão é: "+resto);

	        //operadores relacionais retorna valor boolean < maior, >menor, <= maior igual, >= menor igual, == igual, != diferente
	        boolean valores = 10 > 20;
	        boolean valores2 = 10 < 20;
	        boolean valores3 = 10 == 20;
	        boolean valores4 = 10 != 20;

	        System.out.println("Verdadeiro TRUE e Falso FALSE :"+valores);
	        System.out.println("Verdadeiro TRUE e Falso FALSE :"+valores2);
	        System.out.println("Verdadeiro TRUE e Falso FALSE :"+valores3);
	        System.out.println("Verdadeiro TRUE e Falso FALSE :"+valores4);
	        
	      //operadores lógicos   &&(AND) ||(or) negação !
	        //salario acima de 30 anos é 4612
	        //salario abaixo de 30 anos 3381

	        int idade = 35;
	        float salario = 4612;
	        boolean dentroDaLeiMaiorTrinta = idade > 30 && salario >= 4612 ;
	        boolean dentroDaLeiMenorTrinta = idade < 30 && salario >= 3381;
	        System.out.println("Resulta é :"+dentroDaLeiMaiorTrinta);
	        System.out.println("Resulta é :"+dentroDaLeiMenorTrinta);
	        
	      //utilizando || or -> ou
	        //Comprando PS5 valor PS5 = 5000
	            System.out.println("Programa conta bancária para comprar PS5");
	         double valorTotalContaCorrente = 200;
	         double valorTotalContaPoupanca = 5001;
	         float valorPlaystation = 5000F;
	         boolean ps5Compravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
	            System.out.println("O resultado é verdadeiro ou falso "+ps5Compravel);
	         if (ps5Compravel == true){
	             System.out.println("Sim da para comprar o PS5: verdadeiro "+ps5Compravel);
	         }else {
	             System.out.println("Não da para comprar "+ps5Compravel);
	         }
	         
	         //Operadores de atribuição  =, +=, -=, *=, /=, %=
	         //sistema salário 1000 bonus 1800
	         System.out.println("Salário Bonificação");
	         double bonus = 1800;
	         bonus = bonus + 1000;
	         System.out.println(bonus);//2800
	         bonus += 1000;
	         System.out.println(bonus);//3800
	         bonus -= 1000;
	         System.out.println(bonus);//2800
	         bonus *= 2;
	         System.out.println(bonus);//5600
	         bonus /= 2;
	         System.out.println(bonus);//2800
	         bonus %= 2;
	         System.out.println("Resto da divisão é "+bonus);//0
	         
	         //Operadores Unários  ++, --
	         System.out.println("Contadores Unários");
	         int contador = 0;
	         contador += 1;// contador = contador + 1;
	         contador++;//adiciona depois 
	         contador--;
	         ++contador;//adiciona antes
	         --contador;
	         System.out.println(contador);//igual 1
	         
	         
	         
	         
	    }

}
