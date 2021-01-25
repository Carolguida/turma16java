programa
{
	
	funcao inicio()
	{
		real baseTriangulo, alturaTriangulo, areaTriangulo

		escreva ("Por favor, digite um valor para a altura e base de um triângulo: \n")
		leia(baseTriangulo)
		leia(alturaTriangulo)

		se (baseTriangulo<=0 ou alturaTriangulo<=0)
		{
			escreva ("Por favor, digite um valor positivo e maior que zero. ")
		}

		senao se (baseTriangulo>0 e alturaTriangulo>0)
		{
			areaTriangulo = (baseTriangulo*alturaTriangulo)/2
			escreva("A área do triângulo é: " + areaTriangulo)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 509; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */