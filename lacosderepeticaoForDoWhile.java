
			//Exercécio 1
				int idade,x=1,menor21=0,maior50=0;

				while(x==1) {
					System.out.println("\nEntre com a sua idade: ");
					idade=leia.nextInt();
	
					if(idade<21 && idade>0) 
						menor21++;
		
					else if(idade>50) 
						maior50++;
		
					if(idade<0)
						x=0;
					}
					System.out.println("\nTotal de pessoas menores de 21 anos: "+menor21);
					System.out.println("\nTotal de pessoas maiores de 50 anos: "+maior50);
				}
					do
						while
			}
			//Exercicio 2
			package DesenvolvimentoJava;

			import java.util.Scanner;

			public class ExerciciosLacosdeRepeticao {

			public static void main(String[] args) {
				Scanner leia=new Scanner (System.in);
				int num,x=1,contPar=0,contImpar=0;
		
				for(x=0;x<10;x++) {
				System.out.println("\nEntre com um número qualquer: ");
			num=leia.nextInt();
			
			if(num%2==0)
			{
				contPar++;
			}else {
				contImpar++;
			}
		}
			System.out.println("\nQuantidade de numeros pares foi de: "+contPar);
			System.out.println("\nQuantidade de numeros impares foi de: "+contImpar);
	}
}

			//Exercício 3
			int x,soma=0,pos=0;
			
				do
				{
				System.out.println("\nDigite um número (Para sair aperte o 0): ");
				x=leia.nextInt();
				
				if(x>0)
				{
					soma=x+soma;
					pos++;
				}
							
			}while(x!=0);
				System.out.println("\nA soma dos numeros positivos é: "+soma);
		}
		
	}
			
	