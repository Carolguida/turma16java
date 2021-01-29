package aulasexerc�cios;

import java.util.Scanner;

public class ExemploContas 
{
	public static void main(String[] args)
	{
		
		Scanner ler = new Scanner(System.in);
		double saldoFinal = 0.0, valor = 0.0, debito;
		char opcao;

		
		
		System.out.println("MARC'S BANK");
		System.out.println("O PRIMEIRO EMPR�STIMO VOC� N�O PAGA! VEM VOC� PRO MARC'S BANK!");
		
		do 
		{
			System.out.println("ESCOLHA UMA DAS OP��ES: ");
			System.out.println("1 - CONTA POUPAN�A\r\n"
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
			
			System.out.println("\t\t###CONTA POUPAN�A###");
            System.out.println();
			
            do
			{	
				System.out.println("Selecione o movimento [D/C]: ");
				movimento = leia.next().toUpperCase().charAt(0);
			
				if (movimento == 'D')
				{
					System.out.print("Digite o valor para d�bito: ");
					debito = leia.nextDouble();
					if (saldoFinal>0)
					{
						
						while (saldoFinal < debito)
						{
							System.out.printf("Saldo indisponivel, atual %.2f, tente de novo!\n",saldoFinal);
							System.out.print("Digite o valor para d�bito: ");
							debito = leia.nextDouble();
							
							/* 
							 * System.out.println("Deseja corre��o monet�ria? [1- Sim e 2- N�o]");
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
						System.out.printf("Saldo atual � R$ %.2f \n", saldoFinal);
					}
					else if (saldoFinal == 0)
					{
						System.out.print("SALDO INSUFICIENTE: fa�a um cr�dito primeiramente\n");
					}
				}
				else 
				{
					System.out.println("Voc� gostaria de creditar qual valor?: ");
					valor = leia.nextInt();
					System.out.println("AQUI ENTROU");
					saldoFinal = saldoFinal + valor;
					System.out.printf("\nO valor do saldo atual �: %.2f",saldoFinal);
					
					/*
					System.out.println("Deseja corre��o monet�ria? [1- Sim e 2- N�o]");
					opcao2 = leia.next().charAt(0);
					
					if (opcao2 == '1')
					{
						
						saldoFinal += valor + (valor*0.0005);
						System.out.printf("\nO valor do saldo atual �: %.2f",saldoFinal);
						
					}	
					else
					{
						saldoFinal = saldoFinal + valor;
						System.out.printf("\nO valor do saldo atual �: %.2f",saldoFinal);
						
					}*/
				}
		
				System.out.print("\nDeseja continuar? [S/N]: ");
				opcao = leia.next().toUpperCase().charAt(0);
			}while(opcao == 'S');
		
            System.out.println("Deseja corre��o monet�ria? [S- Sim e N- N�o]");
			opcao2 = leia.next().toUpperCase().charAt(0);
    		
			if (opcao2 == 'S') 
    		{
    			saldoFinal += (valor * 0.0005);
    		}
    		System.out.printf("SALDO FINAL DA CONTA POUPAN�A %.2f \n", saldoFinal);
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
                	System.out.print("Digite o valor para d�bito: ");
					debito = leia.nextDouble();
                	
					if (saldoFinal > 0)
                	{
                		while (saldoFinal < debito)
                		{
                			System.out.printf("Saldo indisponivel, atual %.2f, tente de novo!\n",saldoFinal);
							System.out.print("Digite o valor para d�bito: ");
							debito = leia.nextDouble();
						}	
                		
                		saldoFinal = valor - debito;
						System.out.printf("Saldo atual � R$ %.2f \n", saldoFinal);
                 	}
					else if (saldoFinal < 0)	
                 	{
                 		System.out.print("\nA CONTA N�O PODE FICAR NEGATIVA.");
                 	}
                
                }  
                else 
                {
                    System.out.println("\nVoc� gostaria de creditar qual valor?: ");
                    valor = leia.nextInt();
                }
                System.out.print("DESEJA FAZER UM EMPRESTIMO [S- Sim e N- N�o]");
                opcao2 = leia.next().toUpperCase().charAt(0);

                if (opcao2 == 'S')
                {
                    System.out.print("\nDigite o valor: R$");
                    saldoFinal = leia.nextInt();

                    if(saldoFinal > 10000){
                        System.out.println("LIMITE DO EMPRESTIMO � DE R$ 10.000");
                    }else {
                        saldoFinal = valor + saldoFinal;
                    System.out.printf("\nO valor do saldo atual �: %.2f", saldoFinal);
                    }
                }

                System.out.print("\nDeseja continuar? [S/N]: ");
                opcao = leia.next().toUpperCase().charAt(0);

            }while(opcao == 'S');
		
			
        }
}           
         
     
		
