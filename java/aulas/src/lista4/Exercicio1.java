package lista4;

import java.util.Scanner;

public class Exercicio1 
{
	public static void main(String[] args)
	{
		//Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma atividade e o escreva em seguida. 
		//Encontre ap�s a maior pontua��o e a apresente. 
		
		Scanner leia = new Scanner(System.in);
		int pontuacao [] = new int[5];
		int maiorpontuacao = 0;
		
		for (int x=0;x<5;x++)
		{
			System.out.print("Insira a pontua��o da atividade: ");
			pontuacao[x]=leia.nextInt();
			
			if(pontuacao[x]>maiorpontuacao)
			{
				maiorpontuacao=pontuacao[x];
				
			}
			
			
		}
		System.out.printf("\nA maior pontua��o �: %d",maiorpontuacao);
	}
}
