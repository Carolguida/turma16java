package aulasexerc�cios;

import java.util.Scanner;

public class ImparPar 
{
	public static void main (String[] args)
	{
		int numero = 0;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um n�mero inteiro e positivo: ");
		numero = ler.nextInt();
		
		if(numero<0)
		{
			System.out.print("Por favor, digite um n�mero maior que zero: ");
			numero = ler.nextInt();
			
			if (numero%2==0)
			{
				System.out.println("O n�mero digitado � par.");
			}
			else
			{
				System.out.println("O n�mero digitado � �mpar. ");
			}
		}
		else if (numero == 0)
		{
			System.out.println("Zero � um n�mero neutro.");
		}
		
		else if(numero%2==0)
		{
			System.out.println("O n�mero digitado � par.");
		}
		else
		{
	    	System.out.println("O n�mero digitado � �mpar. ");
		}
	}
}
