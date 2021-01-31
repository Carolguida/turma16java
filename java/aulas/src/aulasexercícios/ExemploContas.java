package aulasexercícios;
import java.util.*;

public class ExemploContas 
{
		
	static double valorPoupanca[] = new double [200];
	static int x = 0;
	static double saldoFinalPoupanca = 0.0;
	static double saldoFinalEmpresa = 0.0;
	static String descricao[] = new String [200];
	static double valorEmpresa[] = new double [200];
	static double valorEstudantil[] = new double [200];
	static double saldoFinalEstudantil = 0.0;
		
	public static void main(String[] args) 
	{
			
			Scanner ler = new Scanner(System.in);
			double saldoFinal = 0.0;
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
					System.out.println("\t\t\t###OBRIGADO, VOLTE SEMPRE!!!###");	
					break;
				}
				else if (opcao == '1') 
				{
					contaPoupanca();
					
				}
				else if (opcao == '2') 
				{
					//contaCorrente
				}
				else if (opcao == '3') 
				{
					contaEmpresa();
				}
				else if (opcao == '4') 
				{
					contaEstudantil();
				}
				
			}while(true);
			
			
		}

			public static void contaPoupanca()
			{
				Scanner leia = new Scanner(System.in);
				char selecao, opcao, movimento,opcao2;
				
				System.out.println("\t\t###CONTA POUPANÇA###");
	            System.out.println();
	            
	            do 
	            {
	            do
				{	
					System.out.print("Selecione o movimento [D - debito | C - crédito ]: ");
					movimento = leia.next().toUpperCase().charAt(0);
					
					System.out.print("DESCRIÇÃO DO MOVIMENTO: ");
					descricao [x] = leia.next();
						
				
					if (movimento == 'D')
					{
						System.out.print("Digite o valor para débito: ");
						valorPoupanca[x] = leia.nextDouble();
						
						
						if (saldoFinalPoupanca>0)
						{
							while (saldoFinalPoupanca <valorPoupanca[x])
							{
								System.out.printf("Saldo indisponivel, atual %.2f, tente de novo!\n",saldoFinalPoupanca);
								System.out.print("Digite o valor para débito: ");
								valorPoupanca[x]= leia.nextDouble();
								
							}
							
							saldoFinalPoupanca -= valorPoupanca[x]; 
							System.out.printf("Saldo atual é R$ %.2f \n", saldoFinalPoupanca);
						}
						else if (saldoFinalPoupanca == 0)
						{
							System.out.print("SALDO INSUFICIENTE: faça um crédito primeiramente\n");
						}
					}else 
					{
						System.out.print("Você gostaria de creditar qual valor? ");
						valorPoupanca[x] = leia.nextInt();

						saldoFinalPoupanca +=  valorPoupanca[x];
						System.out.printf("\nO valor do saldo atual é: %.2f",saldoFinalPoupanca);
					}
					System.out.print("\nDeseja continuar? [S- sim | N- não ]: ");
					opcao = leia.next().toUpperCase().charAt(0);
					x++;
					
				}while(opcao == 'S');
	         
	            System.out.print("\n\nDeseja correção monetária? [S- sim | N- não ]:");
				opcao2 = leia.next().toUpperCase().charAt(0);
	    		
				if (opcao2 == 'S') 
	    		{
	    			descricao[x] = "Juros";
	    			valorPoupanca[x] = saldoFinalPoupanca * 0.0005;
	    			saldoFinalPoupanca += valorPoupanca[x];
	    			x++;
	    		}
				
				for (int i=0;i<x;i++)
	            {
	            	System.out.printf("\n MOVIMENTO %d: ",(i+1));
	            	System.out.printf("\n DESCRIÇÃO: %s ", descricao[i]);
	            	System.out.printf("\n VALOR %.2f:  ", valorPoupanca[i]);
	            }
	    		
				System.out.printf("\nSALDO FINAL DA CONTA POUPANÇA: %.2f", saldoFinalPoupanca);
	    		System.out.println();
	    		
	    		
	    		System.out.print("\nDESEJA IR PARA O MENU INICIAL? [S- sim | N- não ]: ");
	            opcao = leia.next().toUpperCase().charAt(0);
	            }while(opcao != 'S');
	            
	           
	           }

			public static void contaEmpresa()
	        {
				Scanner leia = new Scanner(System.in);
				double emprestimo = 0.0, emprestimoTotal = 10000, saldoNegativo = 0.0;
				char selecao, opcao, movimento,opcao2;
								
				
				System.out.println("\t\t###CONTA EMPRESA###");
	            System.out.println();
	            
	            do
	            {
	                System.out.print("\nSelecione o movimento [D - debito | C - crédito ]: ");
	                movimento = leia.next().toUpperCase().charAt(0);
	                System.out.print("DESCRIÇÃO DO MOVIMENTO:  ");
					descricao [x] = leia.next();

	                if (movimento == 'D')
	                {    	
	                	System.out.print("Digite o valor para débito: ");
	                	valorEmpresa[x] = leia.nextDouble();
						
						if(valorEmpresa[x]> saldoFinalEmpresa)
						{
							System.out.print("Saldo insuficiente. tente de novo!\n");
						}
	                	
						if (saldoFinalEmpresa > 0)
	                	{
	                		while (saldoFinalEmpresa < valorEmpresa[x])
	                		{
	                			System.out.printf("Saldo indisponivel, atual %.2f, tente de novo!\n",saldoFinalEmpresa);
								System.out.print("Digite o valor para débito novamente: R$ ");
								valorEmpresa[x] = leia.nextDouble();
							}	
	                		
	                		saldoFinalEmpresa-= valorEmpresa[x];
							System.out.printf("Saldo atual é R$ %.2f \n", saldoFinalEmpresa);
	                 	}
						else if (saldoFinalEmpresa < 0)	
	                 	{
	                 		System.out.print("\nA CONTA NÃO PODE FICAR NEGATIVA.");
	                 	}
	                }  
	                else 
	                {
	                    System.out.println("\nVocê gostaria de creditar qual valor?: ");
	                    valorEmpresa[x] = leia.nextInt();
	                    
	                    saldoFinalEmpresa+= valorEmpresa[x];
	                   
	                   System.out.printf("Seu saldo atual é R$ %.2f \n", saldoFinalEmpresa);
	                }
	                
	                
	                System.out.printf("LIMITE DO EMPRESTIMO É DE *** %.2f ***", emprestimoTotal);
	                System.out.print("\nDESEJA FAZER UM EMPRESTIMO [S- Sim e N- Não]");
	                opcao2 = leia.next().toUpperCase().charAt(0);
	                  
		               while(opcao2 == 'S')
		                {    
		                do { 

		                    System.out.print("\nDigite o valor do emprestimo: R$");
		                    emprestimo = leia.nextInt();

		                    emprestimoTotal -= emprestimo;

		                    if(emprestimoTotal < 0)
		                    {
		                    	saldoNegativo = emprestimoTotal;

		                    	System.out.printf("SALDO INDISPONIVEL");
		                    	emprestimoTotal = (saldoNegativo + emprestimo);
		                    }
		                    else if(emprestimo > 10000){
		                        System.out.print("LIMITE DO EMPRESTIMO É DE R$ 10.000");
		                        
		                    }else {
		                    	saldoFinalEmpresa += emprestimo;
		                    System.out.printf("\nO valor do saldo atual é: %.2f", saldoFinalEmpresa);
		                    }
		                    
		                    System.out.printf("\nVoce possui um limite de emprestimo atual de R$ %.2f", emprestimoTotal);
		                
		                System.out.print("\n DESEJA CONTINUAR COM O EMPRESTIMO [S- sim | N- não ]: ");
		                opcao = leia.next().toUpperCase().charAt(0);
		                
		               }while(opcao == 'S'); 
		          
		                opcao2 = 'N';
		            }
		               x++;
		               for (int i=0;i<x;i++)
			            {
			            	System.out.printf("\n MOVIMENTO %d: ",(i+1));
			            	System.out.printf("\n DESCRIÇÃO: %s ", descricao[i]);
			            	System.out.printf("\n VALOR %.2f:  ", valorEmpresa[i]);
			            }
		               System.out.print("\nDESEJA IR PARA O MENU INICIAL ? [S- sim | N- não ]: ");
			                opcao = leia.next().toUpperCase().charAt(0);

			            }while(opcao != 'S');
	            }

			
	            public static void contaEstudantil()
		        {
	            	Scanner leia = new Scanner(System.in);
					double emprestimo = 0.0, emprestimoTotal = 5000, saldoNegativo = 0.0;
					char selecao, opcao, movimento,opcao2;
									
					System.out.println("\t\t###CONTA ESTUDANTIL###");
		            System.out.println();
		            
		            do
		            {
		                System.out.print("\nSelecione o movimento [D - debito | C - crédito ]: ");
		                movimento = leia.next().toUpperCase().charAt(0);
		                System.out.print("DESCRIÇÃO DO MOVIMENTO:  ");
						descricao [x] = leia.next();

		                if (movimento == 'D')
		                {    	
		                	System.out.print("Digite o valor para débito: ");
		                	valorEstudantil[x] = leia.nextDouble();
							
							if(valorEstudantil[x]> saldoFinalEstudantil)
							{
								System.out.print("Saldo insuficiente. tente de novo!\n");
							}
		                	
							if (saldoFinalEstudantil > 0)
		                	{
		                		while (saldoFinalEstudantil < valorEstudantil[x])
		                		{
		                			System.out.printf("Saldo indisponivel, atual %.2f, tente de novo!\n",saldoFinalEstudantil);
									System.out.print("Digite o valor para débito novamente: R$ ");
									valorEstudantil[x] = leia.nextDouble();
								}	
		                		
		                		saldoFinalEstudantil -= valorEstudantil[x];
								System.out.printf("Saldo atual é R$ %.2f \n", saldoFinalEstudantil);
		                 	}
							else if (saldoFinalEstudantil < 0)	
		                 	{
		                 		System.out.print("\nA CONTA NÃO PODE FICAR NEGATIVA.");
		                 	}
		                }  
		                else 
		                {
		                    System.out.println("\nVocê gostaria de creditar qual valor?: ");
		                    valorEstudantil[x] = leia.nextInt();
		                    
		                    saldoFinalEstudantil += valorEstudantil[x];
		                   
		                   System.out.printf("Seu saldo atual é R$ %.2f \n", saldoFinalEstudantil);
		                }
		                
		                
		                System.out.printf("LIMITE DO EMPRESTIMO É DE *** %.2f ***", emprestimoTotal);
		                System.out.print("\nDESEJA FAZER UM EMPRESTIMO [S- Sim e N- Não]");
		                opcao2 = leia.next().toUpperCase().charAt(0);
		                  
			               while(opcao2 == 'S')
			                {    
			                do { 

			                    System.out.print("\nDigite o valor do emprestimo: R$");
			                    emprestimo = leia.nextInt();

			                    emprestimoTotal -= emprestimo;

			                    if(emprestimoTotal < 0)
			                    {
			                    	saldoNegativo = emprestimoTotal;

			                    	System.out.printf("SALDO INDISPONIVEL");
			                    	emprestimoTotal = (saldoNegativo + emprestimo);
			                    }
			                    else if(emprestimo > 5000){
			                        System.out.print("LIMITE DO EMPRESTIMO É DE R$ 5000");
			                        
			                    }else {
			                    	saldoFinalEstudantil += emprestimo;
			                    System.out.printf("\nO valor do saldo atual é: %.2f", saldoFinalEstudantil);
			                    }
			                    
			                    System.out.printf("\nVoce possui um limite de emprestimo atual de R$ %.2f", emprestimoTotal);
			                
			                System.out.print("\n DESEJA CONTINUAR COM O EMPRESTIMO [S- sim | N- não ]: ");
			                opcao = leia.next().toUpperCase().charAt(0);
			                
			               }while(opcao == 'S'); 
			          
			                opcao2 = 'N';
			            }
			               x++;
			               for (int i=0;i<x;i++)
				            {
				            	System.out.printf("\n MOVIMENTO %d: ",(i+1));
				            	System.out.printf("\n DESCRIÇÃO: %s ", descricao[i]);
				            	System.out.printf("\n VALOR %.2f:  ", valorEstudantil[i]);
				            }
			               System.out.print("\nDESEJA IR PARA O MENU INICIAL ? [S- sim | N- não ]: ");
				                opcao = leia.next().toUpperCase().charAt(0);

				            }while(opcao != 'S');
					
	}

}