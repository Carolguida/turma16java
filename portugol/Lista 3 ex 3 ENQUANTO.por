programa
{
	
	funcao inicio()
	{
		/*
		 * Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório 
		 * a média e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. 
		 * Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
		 * 
		 */

		 inteiro numero=0, totalSomatorio =0
		 real contador =0.0
		 real mediaNumero =0.0
		 
		 	
		 enquanto (numero>=0)
		 {
		 	escreva ("Digite um valor: ")
		     leia(numero)
		 	
		 	se (numero>=0)// PQ AQUI EU ENTRO NO SE? PQ SEM ELE O NUMERO NEGATIVO ENTRA NA CONTA TB
		 	{
		 		totalSomatorio = totalSomatorio + numero 
		  		contador = contador + 1
		 	}
		 		 	
		 }
		 
		 mediaNumero = totalSomatorio/contador 
		 // Neste caso, a média ficará fora do laço, pois eu necessito do totalSomatório e contador que estão rodando no laço!
		 escreva ("O somatório é : " + totalSomatorio + " a média é : " + mediaNumero + " e o total de valores lidos são: " +contador) 
		 //Aqui fica fora do laço tb, pq ele precisa parar até dar um numero negativo e então apresentar a mensagem.	 	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 774; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */