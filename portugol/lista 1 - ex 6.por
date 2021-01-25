programa
{
	
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real x1,x2,y1,y2, d, sub1,sub2, quadrado1,quadrado2, soma

		escreva ("Digite o valor para x1: ")
		leia(x1)
		
		escreva("Digite o valor para x2: ")
		leia(x2)

		escreva("Digite o valor para y1: ")
		leia(y1)

		escreva("e digite o valor de y2: ")
		leia(y2)

		sub1 = x2 - x1
		sub2 = y2 - y1
		quadrado1 = Matematica.potencia(sub1, 2.0)
		quadrado2 = Matematica.potencia(sub2, 2.0)
		soma = quadrado1+quadrado2

		d= Matematica.raiz(soma, 2.0)

		escreva("O resultado da equação é: " + d)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 327; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */