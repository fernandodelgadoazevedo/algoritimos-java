package Desemvolvimento;

import java.util.*;

public class DoWhile {

	public static void main(String[] args) {


		Scanner leia = new Scanner (System.in);
		int numero , soma = 0;
		
		
		System.out.println("\n\t\t Atividade Lacos de Repeticao Do While" );
		System.out.println("\n\t\t Para sair do laco precisa digidar 0 enquanto isso ele fica somando" );
		System.out.println("Digite um número: ");	 
	 
		 do 
         {
         numero = leia.nextInt();
             if (numero>0)
             {
                 soma = numero + soma;
             }
         }
		 while (numero!= 0);
		 System.out.println("\nA Total dos numeros digitados foi: "+soma);

	}

}