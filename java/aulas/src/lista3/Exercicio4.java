package lista3;

import java.util.Scanner;

public class Exercicio4 
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		int pessoas=0,idade,sexoPessoa,statusPessoa,contador1=0, contador2=0,contador3=0,contador4=0,contador5=0,contador6=0;
		
		while (pessoas<3)
		{
			System.out.print("Informe sua idade: ");
			idade = leia.nextInt();
			
			System.out.print("Informe seu status [1-Pessoa calma 2- Pessoa Nervosa 3- Pessoa agressiva]: ");
			statusPessoa = leia.nextInt();
			while(statusPessoa<1 || statusPessoa>3)
			{
				
			}
		
		}

		
		
		
		
	}
}
