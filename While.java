
package Desemvolvimento;

import java.util.Scanner;

public class While {
public static void main(String[] args) {
		
		Scanner leia=new Scanner (System.in);
		int idade,x=1,menor21=0,maior50=0;
		
		while(x==1) {
			System.out.println("\n\t\tExercicio de While");
			System.out.println("\nIra ficar repetindo ate que o numero seja negativo");
			System.out.println("\nEntre com a sua idade: ");
			idade=leia.nextInt();
			
			if(idade<21 && idade>0) 
				menor21++;
				
			else if(idade>50) 
				maior50++;
				
				if(idade<0)
				x=0;
		}
			System.out.println("\nTotal de menores de 21 anos sao: "+menor21);
			System.out.println("\nTotal de maiores de 50 anossao: "+maior50);
	}
}