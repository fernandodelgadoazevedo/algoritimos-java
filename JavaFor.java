package JavaFor;

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
}