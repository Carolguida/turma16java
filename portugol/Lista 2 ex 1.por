programa
{
	
	funcao inicio()
	{
		inteiro peso = 0, excesso = 0, multa =0

		escreva ("Por favor, digite o peso total dos tomates: ")
		leia(peso)

		

		se (peso<=50){		
			escreva ("Não há excessos, e não há multa a ser aplicada.")
		}
		senao se  (peso>50){
			excesso= peso - 50
			multa = 4*excesso
			
		}
			escreva("Você possui um excesso de " + excesso + " kg" + " e sua multa será de " + multa + " reais")
			/*Caso queira aparecer os valores zerados, é necessário inicializar a variável (=0.00) 
			 * e então deixar o escreva fora do se/senao se
			 * 
			 */
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 575; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */