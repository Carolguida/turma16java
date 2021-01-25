programa
{
	//objetivo
	//inicio
		/*variaveis
		 * entradas
		 * processamento
		 * saidas
		 */
	//fim
	funcao inicio()
	{
		inteiro idadePessoa

		escreva ("Por favor, digite sua idade: ")
		leia(idadePessoa)

		se (idadePessoa < 5)
		{
			escreva ("Por favor, insira uma idade maior que 5 anos. ")
		}

		senao se  (idadePessoa <=7) // ou senao se  (idadePessoa >=5 e idadePessoa <=7)
		{
			escreva ("Você faz parte da categoria Infantil A")
		}
		senao se (idadePessoa <= 11)
		{
			escreva ("Você faz parte da categoria Infantil B")
		}
		senao se (idadePessoa <= 13)
		{
			escreva ("Você faz parte da categoria Juvenil A")
		}
		senao se (idadePessoa <= 17)
		{
			escreva ("Você faz parte da categoria Juvenil B")
		}
		senao 
		{
			escreva ("Você faz parte da categoria Adultos")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 368; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */