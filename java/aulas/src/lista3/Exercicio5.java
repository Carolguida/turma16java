package lista3;

import java.util.Scanner;

public class Exercicio5 
{
	public static void main(String[] args)
	{
		//Crie um programa que leia um número do teclado até que encontre um número igual a zero.
		//No final, mostre a soma dos números digitados
		
		Scanner leia = new Scanner(System.in);
		int numero, soma = 0;
	
		do
		{
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			soma+=numero;
			
		}while(numero!=0);
		
		System.out.printf("A soma dos números é: %d", soma);
	}
}
