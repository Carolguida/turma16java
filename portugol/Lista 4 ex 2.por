programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		// Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
		// A seguir determine e imprima a média aritmética dos lançamentos
		// contabilize e apresente também quantas foram as ocorrências da maior pontuação.

		inteiro dados [10], dadoMedia = 0, totalDados=0, maiorDado =0
		inteiro contador = 0
		//inteiro i,x
		
		para (inteiro i=0;i<10;i++)
		{
			/*escreva("Digite o valor do dado (1 a 6): ")
			leia(dados[i])
			*/
			dados[i] = Util.sorteia(1, 6) //sorteia números aleatórios
			totalDados = totalDados + dados[i]
			
			se (dados[i]>maiorDado)
			{
				contador = 0 // É necessário zerar a variável contador 
				maiorDado=dados[i]
			}

			se (dados[i]==maiorDado) // como na condição anterior ja foi declarado que dado>maior dado e ele assume o valor de maior dado
			//isto fará com que o maiorDado assuma o valor do dado que seja maior.. então aqui eu assumo que se um dado for igual ao maiorDado,
			//então ele é o maior, e então faço a contagem.
			{
					contador ++
			}
		}

		/*para (x=0;x<10;x++)
		{
			se (dados[x]==maiorDado) 
			 {
			 	contador ++
			 }
			
		}*/
		para (inteiro i=0;i<10;i++)
		{
			escreva("Lançamento ", (i+1), "º é igual a: ", dados[i],"\n")
			
		}

		dadoMedia = totalDados/10 //Para não ter que usar esse valor fixo (10), posso usar uma var const = TAMANHO = 10 
		//nas variáveis -> const inteiro TAMANHO = 10 -> i=TAMANHO
		escreva("\nA soma dos dados é: ", totalDados, " e a média aritmética é: ",dadoMedia, "\n")
		escreva("O maior número é: ", maiorDado,"\n")
		escreva("Quantidade de número maior é: ", contador)
		
	}
		
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 560; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */