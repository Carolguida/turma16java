package aulasexercícios;

import java.util.Scanner;

public class ExemploLaco {

	public static void main(String[] args) 
	{
		/*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
		a) média do salário da população; 
		b) média do número de filhos; 
		c) maior salário; 
		d) percentual de pessoas com salário até R$100,00.
		*/
		Scanner leia = new Scanner(System.in);
		double salario = 0.0,salarioMedia = 0.0,filhosMedia = 0.0, maiorSalario = 0.0,salarioTotal = 0.0,percentualSalario = 0.0,contador =0.0;
		double numFilhos =0.0,filhosTotal = 0.0;
		final int habitantes = 20;
		
		for (int x=1; x<=habitantes; x++)
		{
			System.out.print("Por favor, insira o número de filhos: ");
			numFilhos = leia.nextDouble();
			System.out.print("Por favor, insira o seu salário: ");
			salario = leia.nextDouble();
			
			salarioTotal += salario; //atribui valor no salarioTotal e filhosTotal sempre que rodar o looping.
			filhosTotal += numFilhos;
			
			if (salario > maiorSalario) 
			{
				maiorSalario = salario;
			}
			if (salario<=100)
			{
				contador ++;
				
			}
			
		}
		
		salarioMedia = salarioTotal/habitantes;
		filhosMedia = filhosTotal/habitantes;
		percentualSalario = ((contador/habitantes)*100);
		
		System.out.printf("\nA média do salário da população é: %.2f",salarioMedia);
		System.out.printf("\nA média de filhos de é: %.2f ",filhosMedia);
		System.out.printf("\nO maior salário é: %.2f", maiorSalario);
		System.out.printf("\nO percentual de pessoas com salário menor que R$ 100 é: %.1f%%", percentualSalario);
	}
}
