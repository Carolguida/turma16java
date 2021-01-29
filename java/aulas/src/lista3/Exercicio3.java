package lista3;

import java.util.Scanner;

public class Exercicio3 
{
	public static void main(String[] args)
	{
		//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
		//Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99.
		
		Scanner leia = new Scanner(System.in);
		int idade, contPessoas21 = 0, contPessoas50 = 0;
		
		System.out.print("\nDigite a sua idade: ");
		idade = leia.nextInt();
		
		while (idade!=-99)
		{
						
			if(idade<21)
			{
				contPessoas21++;
				
			}
			else if (idade>50)
			{
				contPessoas50++;
				
			}
			
			System.out.print("Digite novamente a idade: (Digite -99 para sair do programa) ");
			idade = leia.nextInt();
		
		}
			
		System.out.printf("\nA quantidade de pessoas com idade menor que 21 é: %d",contPessoas21);
		System.out.printf("\nA quantidade de pessoas com idade maior que 50 é: %d",contPessoas50);
		
		
	}
}
