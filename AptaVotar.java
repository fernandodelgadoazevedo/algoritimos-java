package Desemvolvimento;

	import java.util.*;

public class AptaVotar {
	public static void main (String args [])
	{
		Scanner ler = new  Scanner (System.in);
		int idade;
		String nome;
		double salario = 0;
		double imposto = 0;
		
			System.out.printf("\n\t\tEntre com os dados para saber se esta Apto a Votar!!! "); //Apresenta na tela a informação do que é para fazer.
			
				System.out.printf("\nDigite seu Nome: "); // Solicita ao usuario que informa o dado "NOME"
					nome=ler.nextLine();
					
				System.out.printf("\nDigite sua idade: ");// Solicita ao usuario que informe o dado "IDADE"
					idade=ler.nextInt();

		System.out.printf(nome);
		System.out.printf(" :Idade e %d", idade);
		
		if(idade <16)
		{
			System.out.printf(": Não esta Apta a votar");
		}
		else if(idade >=16 && idade <18 || idade >65)
		{
			System.out.printf(": Esta apta a votar e é Facultativo");
		}
		else
		{
			System.out.printf(": Esta apta a votar e é Obrigatorio");
		}
		
		
	System.out.println();
		
		/*System.out.println("\nDigite o Salario");
		salario = ler.nextFloat();
		if(salario >=0 && salario <=2000)
		{
			System.out.printf("\nImposto de Renda: Isento");
		}
		else if(salario >=2000.01 && salario <=3000)
		{
			imposto = salario * 0.08;
			System.out.printf("\nImposto de Renda: %.2f", imposto);
		}
		else if(salario >=3000.01 && salario <=4500)
		{
			imposto = salario * 0.18;
			System.out.printf("\nImposto de Renda: %.2f", imposto);
		}
		
		else if(salario >=4500)
		{
			imposto = salario * 0.28;
			System.out.printf("\nImposto de Renda: %.2f", imposto);
		}
		
		else
		{
			System.out.printf("\n Valor Digitado Errado!!!");
		}*/
		
	}
}
