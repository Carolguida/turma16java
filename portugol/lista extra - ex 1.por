programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real precoNormal = 0.0, precoDesconto = 0.0, parcelas = 0.0
		caracter escolhaPagamento
		

		escreva ("Por favor, insira o valor de etiqueta do produto: ")
		leia (precoNormal)

		escreva ("Por favor, insira a forma de pagamento [1/2/3 ou 4]: ")
		leia(escolhaPagamento)

		se (escolhaPagamento == '1')
		{
			precoDesconto =  precoNormal*0.20
			escreva ("\nVocê escolheu a opção 1: À vista em dinheiro ou cheque, recebe 20% de desconto \n")
			escreva("\nDesta forma, você receberá um desconto de R$ ", precoDesconto, " e o valor final do seu produto é R$ ",precoNormal-precoDesconto, "\n") 

		} 
		senao se (escolhaPagamento == '2')
		{
			precoDesconto =  precoNormal*0.15
			escreva ("\nVocê escolheu a opção 2: À vista no cartão de crédito, recebe 15% de desconto  \n")
			escreva("\nDesta forma, você receberá um desconto de R$ ", precoDesconto, " e o valor final do seu produto é R$ ",precoNormal-precoDesconto) 

		}
		senao se (escolhaPagamento == '3')
		{
			parcelas = precoNormal/2
			escreva ("\nVocê escolheu a opção 3: Em duas vezes, preço normal de etiqueta sem juros \n")
			escreva("\nDesta forma, valor final do seu produto é R$ ",precoNormal, " com parcela de R$ ", parcelas) 
		}
		senao
		{
			parcelas = (precoNormal+ precoNormal*0.10)/3 
			escreva ("\nVocê escolheu a opção 4: Em três vezes, preço normal de etiqueta mais juros de 10% \n")
			escreva("\nDesta forma, valor final do seu produto é R$ ",precoNormal + precoNormal*0.10, " com parcela de R$ ", Matematica.arredondar(parcelas, 2)) 
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1505; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */