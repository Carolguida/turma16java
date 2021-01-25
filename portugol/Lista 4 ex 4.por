programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		//Crie um programa que receba valores do usuário para preencher uma matriz 3X3
		// e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
	
		inteiro valores [3][3]
		real somaValores = 0.0, somaDiagonal =0.0

		para (inteiro l=0;l<3;l++)
		{
			para (inteiro c=0;c<3;c++)
			{
				/*escreva("Entre com um valor: ")
				leia(valores[l][c])
				*/
				valores[l][c]=Util.sorteia(1, 9)
				somaValores=somaValores + valores[l][c]
				se (c==l)
				{
					somaDiagonal=somaDiagonal+valores[l][c]
				}
				escreva (valores[l][c], " ")
			
			}
			
			escreva("\n")
		}
		escreva("\n A soma dos valores é: ",somaValores)
		escreva("\n A soma dos valores da diagonal é: ", somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 502; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {valores, 9, 10, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */