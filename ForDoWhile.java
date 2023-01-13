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

/*package JavaFor;

import java.util.*;

public class JavaFor {

	public static void main(String[] args) {
{
			Scanner leia = new Scanner(System.in);
			
			int num,Par=0,Impar=0,x;
						
			for (x=1;x<=10;x++)
			{
				System.out.println("\n\t\tAtividade Lacos de Repeticao ");
				System.out.println("\nDigite um numero de 0 a 9: ");
				num = leia.nextInt();
				if (num % 2 == 0)
				{
					Par++; 
				}
				else
				
					{
						Impar++;
					}
			
				}
				
				System.out.printf("\nSoma de numeros pares e: "+Par+ "e a soma de numeros Impares e: "+Impar);
				
	}


}
}*/