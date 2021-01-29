package lista4;

import java.util.Scanner;

public class Exercicio4 
{

	public static void main(String[] args) 
	{
		
		//Crie um programa que receba valores do usuário para preencher uma matriz 3X3
		//e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
		
		Scanner leia = new Scanner (System.in);
		int matriz[][]=new int[3][3];
		int somaMatriz = 0, somaDiagonal = 0; 
		int i,j;
		
		for (i=0;i<3;i++)
		{
			for (j=0;j<3;j++)
			{
				System.out.print("Insira os valores da matriz [3][3]: ");
				matriz[i][j] = leia.nextInt();
				somaMatriz += matriz[i][j];
				
				if (i==j)
				{
					somaDiagonal+=matriz[i][j];
				}
			}
		}
				
		System.out.printf("\nA soma dos valores da matriz [3][3] é: %d",somaMatriz);
		System.out.printf("\nA soma dos valores da diagonal da matriz é: %d",somaDiagonal);
		
	}

	public static void pula ()
	{
		System.out.println("\n");
	}
	
}
