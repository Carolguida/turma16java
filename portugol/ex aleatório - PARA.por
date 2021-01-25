programa
{
	
	funcao inicio()
	{
		/*
		 * Escrever um algoritmo que lê 5 valores para A, um de cada vez, 
		 * e conta quantos destes valores são negativos, escrevendo esta informação. 
		 */
		inteiro x, A
		inteiro contador=0

		para (x=1; x<=5; x++)
		{
			escreva("Digite um valor: ")
			leia(A)
			
			se (A<0)
			{
				contador ++
			}
		}
		escreva("O número de valores negativos é: " ,contador)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 415; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */