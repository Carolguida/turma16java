package aulasexercícios;

import java.util.Scanner;

public class ExemploContas 
{
	public static void main(String[] args)
	{
		
		Scanner ler = new Scanner(System.in);
		double saldoFinal = 0.0, valor = 0.0, debito;
		char opcao;

		
		
		System.out.println("MARC'S BANK");
		System.out.println("O PRIMEIRO EMPRÉSTIMO VOCÊ NÃO PAGA! VEM VOCÊ PRO MARC'S BANK!");
		
		do 
		{
			System.out.println("ESCOLHA UMA DAS OPÇÕES: ");
			System.out.println("1 - CONTA POUPANÇA\r\n"
					+ "2 - CONTA CORRENTE\r\n"
					+ "3 - CONTA EMPRESA\r\n"
					+ "4 - CONTA ESTUDANTIL\r\n"
					+ "5 - SAIR\r\n"
					+ "");
			opcao = ler.next().charAt(0);
			
			if (opcao == '5')
			{
				break;
			}
			else if (opcao == '1') 
			{
				contaPoupanca();
			}
			else if (opcao == '2') 
			{
				
			}
			else if (opcao == '3') 
			{
				contaEmpresa();
			}
			else if (opcao == '4') 
			{
				
			}
			
		}while(true);
	}

		public static void contaPoupanca()
		{
			Scanner leia = new Scanner(System.in);
			double saldoFinal = 0.0, valor = 0.0, debito;
			char selecao, opcao, movimento,opcao2;
			
			System.out.println("\t\t###CONTA POUPANÇA###");
            System.out.println();
			
            do
			{	
				System.out.println("Selecione o movimento [D/C]: ");
				movimento = leia.next().toUpperCase().charAt(0);
			
				if (movimento == 'D')
				{
					System.out.print("Digite o valor para débito: ");
					debito = leia.nextDouble();
					if (saldoFinal>0)
					{
						
						while (saldoFinal < debito)
						{
							System.out.printf("Saldo indisponivel, atual %.2f, tente de novo!\n",saldoFinal);
							System.out.print("Digite o valor para débito: ");
							debito = leia.nextDouble();
							
							/* 
							 * System.out.println("Deseja correção monetária? [1- Sim e 2- Não]");
							opcao2 = leia.next().charAt(0);
							
							if (opcao2 == '1')
							{
								saldoFinal = valor + (valor*0.0005);
							}
							else
							{
								saldoFinal = valor;
							}*/
						}
						
						saldoFinal = valor - debito;
						System.out.printf("Saldo atual é R$ %.2f \n", saldoFinal);
					}
					else if (saldoFinal == 0)
					{
						System.out.print("SALDO INSUFICIENTE: faça um crédito primeiramente\n");
					}
				}
				else 
				{
					System.out.println("Você gostaria de creditar qual valor?: ");
					valor = leia.nextInt();
					System.out.println("AQUI ENTROU");
					saldoFinal = saldoFinal + valor;
					System.out.printf("\nO valor do saldo atual é: %.2f",saldoFinal);
					
					/*
					System.out.println("Deseja correção monetária? [1- Sim e 2- Não]");
					opcao2 = leia.next().charAt(0);
					
					if (opcao2 == '1')
					{
						
						saldoFinal += valor + (valor*0.0005);
						System.out.printf("\nO valor do saldo atual é: %.2f",saldoFinal);
						
					}	
					else
					{
						saldoFinal = saldoFinal + valor;
						System.out.printf("\nO valor do saldo atual é: %.2f",saldoFinal);
						
					}*/
				}
		
				System.out.print("\nDeseja continuar? [S/N]: ");
				opcao = leia.next().toUpperCase().charAt(0);
			}while(opcao == 'S');
		
            System.out.println("Deseja correção monetária? [S- Sim e N- Não]");
			opcao2 = leia.next().toUpperCase().charAt(0);
    		
			if (opcao2 == 'S') 
    		{
    			saldoFinal += (valor * 0.0005);
    		}
    		System.out.printf("SALDO FINAL DA CONTA POUPANÇA %.2f \n", saldoFinal);
    		System.out.println();
            
		}
		
		
		public static void contaEmpresa()
        {
			Scanner leia = new Scanner(System.in);
			double saldoFinal = 0.0, valor = 0.0, debito;
			char selecao, opcao, movimento,opcao2;
			
			System.out.println("\t\t###CONTA CORRENTE###");
            System.out.println();
            
            do
            {
                System.out.print("\nSelecione o movimento [D/C]: ");
                movimento = leia.next().toUpperCase().charAt(0);

                if (movimento == 'D')
                {
                	System.out.print("Digite o valor para débito: ");
					debito = leia.nextDouble();
                	
					if (saldoFinal > 0)
                	{
                		while (saldoFinal < debito)
                		{
                			System.out.printf("Saldo indisponivel, atual %.2f, tente de novo!\n",saldoFinal);
							System.out.print("Digite o valor para débito: ");
							debito = leia.nextDouble();
						}	
                		
                		saldoFinal = valor - debito;
						System.out.printf("Saldo atual é R$ %.2f \n", saldoFinal);
                 	}
					else if (saldoFinal < 0)	
                 	{
                 		System.out.print("\nA CONTA NÃO PODE FICAR NEGATIVA.");
                 	}
                
                }  
                else 
                {
                    System.out.println("\nVocê gostaria de creditar qual valor?: ");
                    valor = leia.nextInt();
                }
                System.out.print("DESEJA FAZER UM EMPRESTIMO [S- Sim e N- Não]");
                opcao2 = leia.next().toUpperCase().charAt(0);

                if (opcao2 == 'S')
                {
                    System.out.print("\nDigite o valor: R$");
                    saldoFinal = leia.nextInt();

                    if(saldoFinal > 10000){
                        System.out.println("LIMITE DO EMPRESTIMO É DE R$ 10.000");
                    }else {
                        saldoFinal = valor + saldoFinal;
                    System.out.printf("\nO valor do saldo atual é: %.2f", saldoFinal);
                    }
                }

                System.out.print("\nDeseja continuar? [S/N]: ");
                opcao = leia.next().toUpperCase().charAt(0);

            }while(opcao == 'S');
		
			
        }
}           
         
     
		
