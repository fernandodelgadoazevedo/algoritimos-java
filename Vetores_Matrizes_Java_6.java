package Desemvolvimento;

import java.util.*;

public class Vetores_Matrizes_Java_6 {

	public static void main(String[] args) {
		
		double notas[][] = 
            {
                {4,5,7,3},
                {2.5,6.5,4.7,8},
                {10,8.5,9.5,8},
                {9,6.5,7.6,8,2},
                {5,5,5,6.3},
                {7,8,9,8.5},
                {5.5,3.5,2.5,1},
                {8,9,10,9.5},
                {5.6,5.8,6.5,7},
                {7.5,8.5,9.5,10}
            };
        double media[] = new double[10];
        
        System.out.println("\nExercício 4:\n");
        
        for(int x = 0; x < 10; x++) {
            double somaNotas = 0;
            
            for(int y = 0; y < 4; y++)
                somaNotas += notas[x][y];
            
            media[x] = somaNotas / 4;
            
            System.out.printf(" | %.1f ", media[x]);
        }

		}
	
	}