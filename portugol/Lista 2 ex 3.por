programa
{
	inclua biblioteca Matematica --> Mat // alias
	
	funcao inicio()
	{
		real numero1, numero2, numero3, numero4
		real quadrado1, quadrado2, quadrado3, quadrado4

		escreva ("\n Digite quatros valores para serem calculados: \n")
		leia (numero1, numero2, numero3, numero4)

		quadrado1 = Matematica.potencia(numero1, 2)
		quadrado2 = Matematica.potencia(numero2, 2)
		quadrado3 = Matematica.potencia(numero3, 2)
		quadrado4 = Matematica.potencia(numero4, 2)

		se (quadrado3>= 1000)
		{
			escreva("O quadrado do número 3 é : " + quadrado3)

		} senao
		{
			escreva("O quadrado dos número de 1 a 4 é: " + quadrado1 + ", " + quadrado2+ ", " + quadrado3 + ", e " + quadrado4)
		}
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 57; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */