package aulasexercícios;

import java.util.Scanner;

public class ImparPar 
{
	public static void main (String[] args)
	{
		int numero = 0;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro e positivo: ");
		numero = ler.nextInt();
		
		if(numero<0)
		{
			System.out.print("Por favor, digite um número maior que zero: ");
			numero = ler.nextInt();
			
			if (numero%2==0)
			{
				System.out.println("O número digitado é par.");
			}
			else
			{
				System.out.println("O número digitado é ímpar. ");
			}
		}
		else if (numero == 0)
		{
			System.out.println("Zero é um número neutro.");
		}
		
		else if(numero%2==0)
		{
			System.out.println("O número digitado é par.");
		}
		else
		{
	    	System.out.println("O número digitado é ímpar. ");
		}
	}
}
