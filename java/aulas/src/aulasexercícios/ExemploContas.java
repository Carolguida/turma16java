package aulasexercícios;

import java.util.Scanner;

public class ExemploContas 
{
	public static void main(String[] args)
	{
		double saldoFinal = 0.0, valor = 0.0;
		char selecao, opcao, movimento,opcao2;

		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Selecione o tipo da conta [1/2/3/4 ou 5]: ");
		selecao = leia.next().charAt(0);
		
		if (selecao == '1')
		{	
			do
			{	
				System.out.println("Selecione o movimento [D/C]: ");
				movimento = leia.next().charAt(0);
			
				if (movimento == 'D')
				{
					System.out.println("Infelizmente, não podemos continuar com a operação: SALDO INSUFICIENTE");
				}
				else 
				{
					System.out.println("Você gostaria de creditar qual valor?: ");
					valor = leia.nextInt();
					System.out.println("Deseja correção monetária? [1- Sim e 2- Não]");
					opcao2 = leia.next().charAt(0);
					
					if (opcao2 == '1')
					{
					
						saldoFinal = valor + valor*0.05;
						System.out.printf("\nO valor do saldo atual é: %.2f",saldoFinal);
						
					}	
					else
					{
						saldoFinal = valor;
						System.out.printf("\nO valor do saldo atual é: %.2f",saldoFinal);
						
					}
				}
		
				System.out.print("\nDeseja continuar? [S/N]: ");
				opcao = leia.next().charAt(0);
			}while(opcao == 'S' || opcao == 's');
		
			 
		}
		
		
	}
}
