programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		real peso = 0.0, altura = 0.0, imc = 0.0

		escreva("Por favor, insira seu peso (kg): ")
		leia(peso)
		escreva("Por favor, insira sua altura (m): ")
		leia(altura)

		imc = (peso /(Mat.potencia(altura,2.0)))
		imc = Mat.arredondar(imc,2) 

		se (imc < 18.5)
		{
			escreva("\nIMC: ", imc, " \nVocê está abaixo do peso ideal")
		}
		senao se (imc <=25)
		{
			escreva("\nIMC: ", imc, " \nVocê está com peso ideal")
		}
		senao se (imc <= 30)
		{
			escreva("\nIMC: ", imc, " \nVocê está acima do peso ideal")
		}
		senao
		{
			escreva("\nIMC: ", imc, " \nVocê está obeso")
		}
		
		
		
	}
}
		
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 633; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */