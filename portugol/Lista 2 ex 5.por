programa
{
	
	funcao inicio()
	{
		real indicePoluicao
		
		
		escreva("Por favor, digite o índice de poluição de 0,05 a 0,5: ")
		leia(indicePoluicao)

		se (indicePoluicao<=0.25)
		{
			escreva ("Sua empresa possui índice de poluição aceitável")
		}
		senao se (indicePoluicao<=0.3)
		{
			escreva ("Neste caso, as indústrias do 1º grupo são intimadas a suspenderem suas atividades")
			
		}
		senao se (indicePoluicao<=0.4)
		{
			escreva ("As indústrias do 1º e 2º grupo devem suspenderem suas atividades")
		}
		senao se (indicePoluicao==0.5)
		{
			escreva ("Todos os grupos devem paralisar as suas atividades")
		}

		
		senao {
			se (indicePoluicao > 0.5){
				escreva("Por favor, digite um valor que seja de 0,05 a 0,5")
			}
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 732; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */