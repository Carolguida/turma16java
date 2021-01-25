programa
{
	
	funcao inicio()
	{
		inteiro idadeDias, idadeMes, idadeAno, diasTotais

		escreva ("Digite uma idade em dias: ")
		leia(idadeDias)

		idadeAno = idadeDias/365		
		idadeMes = (idadeDias % 365)/30
		diasTotais = (idadeDias % 365) % 30
		
		escreva ("A idade em anos é: " + idadeAno + ",em meses é: " + idadeMes + ",e em dias é: " + diasTotais)
		
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 370; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */