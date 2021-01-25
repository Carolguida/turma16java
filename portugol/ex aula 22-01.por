programa
{
	
	funcao inicio()
	{
		cadeia eventoDia [24][31]
		real horaEvento
		cadeia nomeUsuario
		inteiro hora=0, dia=0
		caracter teste
		caracter S,N
		logico continuar = verdadeiro

		faca
		{
			escreva ("BEM-VINDO, DIGITE O SEU NOME: ")
			leia(nomeUsuario)
			
			faca
			{
				escreva ("ESCOLHA UM DIA PARA CADASTRO [1/31]: ")
				leia(dia)
				dia=dia - 1 // dia- = 1

				enquanto (dia <=0 ou dia > 31)
				{
				escreva("\nData informada incorreta, escolha uma data entre 1 e 31:")
				leia(dia) //saida do loop
				}
				
				escreva ("ESCOLHA UMA HORA PARA CADASTRO [0/24]: ")
				leia(hora)
				enquanto( hora < 0 ou hora > 23 )
				{
				escreva("\nHora informada incorreta, escolha entre 0 e 23 h: ")
				leia(hora)
				}

				escreva("INFORME A TAREFA NESTA DATA E HORA: ")
				leia(eventoDia[hora][dia])
			
				escreva("CONTINUA SIM OU NÃO [S/N]: ")
				leia(teste)
			}enquanto (teste == 'S' ou teste == 's')
		
			para (inteiro c= 0; c<31; c++)
			{
				para(inteiro l=0; l<24;l++)
				{
					se (eventoDia[l][c] != "")
					{
						escreva("\nO dia é: ", c+1, " e a hora é: " , l, ": ", eventoDia[l][c])
					}
				
				}		
			}
			escreva("\nDeseja recomeçar a agenda? Sim [S] ou Não [N]: ")
			leia (teste)		
			se (teste=='S' ou teste=='s')
			{
				continuar = verdadeiro
			}
			senao 
			{
				continuar = falso
			}
					
		}enquanto(continuar == verdadeiro)	
		//Poderia fazer com um se senão, porém seria muita gambiarra
		//Desta forma, é melhor criar uma variável do tipo lógico e fazer dois laços do tipo enquanto/faça
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 978; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */