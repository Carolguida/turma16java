programa
{
	
	funcao inicio()
	{
		inteiro numero
		inteiro resultado


		escreva("Digite um número natural: ")
		leia(numero)

		resultado = numero % 2

		se (numero == 0)
		{
			escreva("Desculpa, mas não podemos fazer nada, pois o número é neutro. ")
			
		}
		senao se (numero < 0)
		{
			escreva("Não é possível fazer nada. Não é aceito números negativos")
		}
			
		
		senao se (numero > 0)
		{
			se (resultado == 0)
			{
				escreva("Este número é par!")
			}
			senao
			{
				escreva("Este número é impar!")
			}
			 
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 298; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */