package lista2;

import java.util.Scanner;

public class Exercicio3 
{
	public static void main(String[] args)
	{
		int idadePessoa;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Por favor, digite sua idade: ");
		idadePessoa=leia.nextInt();
		
		if(idadePessoa >=10 && idadePessoa<=14)
		{
			System.out.printf("Você possui %d anos e se encontra na categoria infantil.",idadePessoa);
		}
		else if(idadePessoa >=15 && idadePessoa<=17)
		{
			System.out.printf("Você possui %d anos e se encontra na categoria Juvenil.",idadePessoa);
		}
		else if (idadePessoa >=18 && idadePessoa<=25)
		{
			System.out.printf("Você possui %d anos e se encontra na categoria Adulto.",idadePessoa);
		}
		else
		{
			System.out.printf("Você possui %d anos. Não se encaixa em nenhuma categoria.",idadePessoa);
		}
	}
}
