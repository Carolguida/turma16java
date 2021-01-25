programa
{
	inclua biblioteca Texto
	funcao inicio()
	{
		//PAULISTINHA
		// CORINTHIANS,PALMEIRAS,SANTOS,SPFC
		// PONTOS - INTEIRO - 4
		// TIME GANHA - 3 PONTOS
		// TIME PERDE - 0 PONTOS
		// TIME EMPATA - 1 PONTO
		// FAÇA UM PROGRAMA QUE PEÇA SE CADA TIME G-GANHOU, P-PERDEU
		// EMPATOU EM 4 RODADAS, AO FINAL MOSTRAR O NOME DE CADA TIME
		// E SEUS RESPECTIVOS PONTOS
		// SPFC -  G-GANHOU P-PERDEU OU E-EMPATE [G/P/E] -> USUÁRIO ESCREVE

		cadeia nomeTimes [] = {"Corinthians", "Palmeiras", "Santos", "SPFC"}
		inteiro pontos [4]
		cadeia resposta

		para (inteiro i=0;i<4;i++)// looping das rodadas
		{
			escreva("Rodada " , (i+1), "\n")
			para (inteiro x=0;x<4;x++)// looping dos times
			{
				escreva(nomeTimes[x], " G-GANHOU P-PERDEU OU E-EMPATE [G/P/E]: ","\n")
				leia(resposta)
				resposta = Texto.caixa_alta(resposta) // manda sempre em maiúsculo
				se (resposta == "G")
				{
					pontos[x] = pontos[x]+3
				}
				senao se (resposta == "E")
				{
					pontos[x] = pontos[x]+1
				}
				senao se (resposta == "P")
				{
					pontos[x] = pontos[x]+0
				}
			}
			
			escreva ("\n")
			
		}
		para(inteiro z=0;z<4;z++)// mostra a resposta dos pontos
			{
				escreva ("\n")
				escreva(nomeTimes[z], " finalizou com: ", pontos[z], " pontos", "\n")
								
			}
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 542; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */