programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real a,b,c,d,r,s, soma1, soma2

		escreva(" Digite o número a: ")
		leia(a)

		escreva("Digite o número b: ")
		leia(b)

		escreva("Digite o número c: ")
		leia(c)

		soma1= a+b
		soma2= b+c

		r = Matematica.potencia(soma1, 2.0)
		s = Matematica.potencia(soma2, 2.0)

		d= (r+s)/2

		escreva("O valor da expressão D=(R+S)/2, onde R= (A+B)² e S=(B+C)² é igual a: " + d)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 434; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */