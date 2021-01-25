programa
{
	
	funcao inicio()
	{
		inteiro numero = 0, contador = 0, contador2 = 0, contador3 = 0, contador4 = 0

		
	faca
	{
		escreva("Digite um número qualquer: ")
		leia(numero)

		se (numero > 0 e numero <= 25)
		{
			
			contador += 1
		}
		senao se (numero > 0 e numero <= 50)
		{
			
			contador2 += 1
		}
		senao se (numero > 0 e numero <=75)
		{
			
			contador3 += 1
		}
		senao se (numero > 0 e numero <=100)
		{
			contador4 += 1 
		}
		
		}enquanto (numero>0)
			
		escreva("\nGRUPO 1 [0-25]  \t\t  GRUPO 2 [26-50]  \t\t  GRUPO 3 [51-75]  \t\t  GRUPO 4 [76-100]")
		escreva ("\n", contador, "  \t\t\t\t  ", contador2, "  \t\t\t\t  ", contador3, "  \t\t\t\t  ", contador4)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 455; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */