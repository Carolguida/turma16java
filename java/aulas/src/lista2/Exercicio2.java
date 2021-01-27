package lista2;

import java.util.Scanner;

public class Exercicio2 
{
	public static void main(String[] args)
	{
		//Objetivo: Faça um programa que entre com três números e coloque em ordem crescente.
		
		Scanner leia = new Scanner(System.in);//OBS: sempre colocar antes das variáveis
		int num1,num2,num3;
		
		
		System.out.print("Entre com o primeiro valor: ");
		num1 = leia.nextInt();
		System.out.print("Entre com o segundo valor: ");
		num2 = leia.nextInt();
		System.out.print("Entre com o terceiro valor: ");
		num3 = leia.nextInt();

		
		if (num1<num2)
		{
			
			if (num2<num3)
			{
				System.out.printf("\nO primeiro, segundo e terceiro número em ordem crescente é: %d, %d, %d. ",num1,num2,num3);
				
			}
			else if (num3<num2)
			{
				System.out.printf("\nO primeiro, segundo e terceiro número em ordem crescente é: %d, %d, %d. ",num1,num3,num2);
			}
			else 
			{
				System.out.printf("\nO primeiro, segundo e terceiro número em ordem crescente é: %d, %d, %d. ",num3,num1,num2);
			}
			
		}	
		
		if (num2<num1)
		{	
							
			if (num2<num3) 
			{
				if (num1<num3)
				{
					System.out.printf("\nO primeiro, segundo e terceiro número em ordem crescente é: %d, %d, %d. ",num2,num1,num3);
				}
				else
				{
					System.out.printf("\nO primeiro, segundo e terceiro número em ordem crescente é: %d, %d, %d. ",num2,num3,num1);
				}
			}
			else 
			{
				System.out.printf("\nO primeiro, segundo e terceiro número em ordem crescente é: %d, %d, %d. ",num3,num2,num1);
			}
			
		}	
		
		System.out.println("\nFim de programa!"); 	
	}
}
