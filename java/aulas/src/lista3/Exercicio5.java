package lista3;

import java.util.Scanner;

public class Exercicio5 
{
	public static void main(String[] args)
	{
		//Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
		//No final, mostre a soma dos n�meros digitados
		
		Scanner leia = new Scanner(System.in);
		int numero, soma = 0;
	
		do
		{
			System.out.print("Digite um n�mero: ");
			numero = leia.nextInt();
			soma+=numero;
			
		}while(numero!=0);
		
		System.out.printf("A soma dos n�meros �: %d", soma);
	}
}
