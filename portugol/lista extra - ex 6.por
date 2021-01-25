programa
{
	
	funcao inicio()
	{
		//Faça um programa que lê um vetor de 3 elementos e uma matriz de 3 x 3 elementos. 
		//Em seguida, o programa deve fazer a multiplicação do vetor pelas colunas da matriz.

		inteiro matriz[3][3]
		inteiro vetor[3]
		
		
		para (inteiro l=0;l<3;l++)
		{
			escreva("Digite os valores para o vetor: ")
			leia(vetor[l])
		}
			
		para (inteiro l=0;l<3;l++)
		{	
			para (inteiro c=0;c<3;c++)
			{
				escreva("Digite os valores para a matriz: ")
				leia(matriz[l][c])
				
			}
	
		}
		escreva("\nValores Originais do Vetor \n")
		
		para (inteiro x=0;x<3;x++)
		{
			escreva(" [ ",vetor[x], " ] ")
			
		}
		escreva("\n")
		escreva("\nValores Originais da Matriz \n")
		para (inteiro l=0;l<3;l++)
		{
			para (inteiro c=0;c<3;c++)
			{
				escreva(" [ ",matriz[l][c], " ] ")
				
			}
			escreva("\n")
		}
		
		para (inteiro l=0;l<3;l++)
		{
			para (inteiro c=0;c<3;c++)
			{
				matriz[l][c] = (vetor[c]*matriz[l][c])
				
			}
		}
		escreva("\n Valores multiplicados \n")
		para (inteiro l=0;l<3;l++)
		{
			para (inteiro c=0;c<3;c++)
			{
				escreva(" [ ",matriz[l][c], " ] ")
				
			}
			
			escreva("\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 9, 10, 6}-{vetor, 10, 10, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */