package lista3;

import java.util.Scanner;

public class Exercicio2 
{
	public static void main(String[] args)
	{
		//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
		
		Scanner leia = new Scanner(System.in);
		int numero, qtdImpar = 0, qtdPar = 0;
		
		
		for (int x=1;x<=4;x++)
		{
			System.out.print("Por favor, insira o n�mero: ");
			numero = leia.nextInt();
			
			if(numero%2 == 0)
			{
				
				qtdPar++;
				
			}
			else
			{
				qtdImpar++;
			}
		}	
	
				
		System.out.printf("\nPossui %d n�meros pares", qtdPar);
		System.out.printf("\n Possui %d n�meros impares", qtdImpar);
	}
}
