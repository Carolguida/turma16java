package lista4;

import java.util.Scanner;
import java.util.Random;

public class Exercicio3 
{
	public static void main(String[] args) 
	{
		int M1 [][]= new int [4][6];
		int M2 [][]= new int [4][6];
		int N1 [][] = new int [4][6];
		int N2 [][] = new int [4][6];
	
		Random gerador = new Random();
		
		
		for (int l=0;l<4;l++)
		{
			for (int c=0;c<6;c++)
			{
				M1[l][c] = gerador.nextInt(25) + 1;
				M2[l][c] = gerador.nextInt(25) + 1;
				N1[l][c] = M1[l][c] + M2 [l][c];
				N2[l][c] = M1[l][c] - M2 [l][c];
			}
		}
		
		System.out.println("MATRIZ N1: ");
		linha(50);
		System.out.println("\n");
		for (int l=0;l<4;l++)
		{
			for (int c=0;c<6;c++)
			{
				System.out.printf(" [ %d  ]",N1[l][c]);
				
			}
			System.out.println("\n");
		}
		
		linha(50);
		System.out.println("\nMATRIZ N2: \n");
		for(int l=0;l<4;l++)
		{
			for (int c=0;c<6;c++)
			{
				System.out.printf(" [ %d  ]",N2[l][c]);
			}
			System.out.println("\n");
		}
		linha(50);
	}
	
	public static void  linha (int tamanho)
	{
		for (int x=0;x<tamanho;x++)
		{
			System.out.print("-");
		}
	}
}
