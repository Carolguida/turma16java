package aulasexerc�cios;

import java.util.Scanner;

public class ExemploWhile 
{
	public static void main (String[] args)
	{
		//Fa�a um programa que pegue um n�mero do teclado e calcule a soma de todos os n�meros  de 1 at� ele. 
		//Ex.: o usu�rio entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
		
		Scanner leia = new Scanner(System.in);
		
		int numero = 0, somaNumero = 0;
		
		System.out.println("Insira um valor positivo: ");
		numero = leia.nextInt();
		
		if (numero>0)
		{		
			while (numero>0)
			{
				somaNumero+=numero;
				numero--;
			
			}
				
			System.out.printf("O valor total �: %d", somaNumero);
		}
		
		else
		{
			System.out.println("Insira apenas n�meros positivos.");
				
		}
	
	}
	
}
