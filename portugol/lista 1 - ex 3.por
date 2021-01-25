programa
{
	
	funcao inicio()
	{
		inteiro tempo, hora, minutos, segundosTotais 

		escreva("Digite o tempo de duração do evento em segundos: ")
		leia(tempo)

		hora = tempo/3600
		minutos = (tempo % 3600)/60
		segundosTotais = (tempo % 3600) % 60
		
		escreva ("A duração do evento  em horas é : " + hora + " ,em minutos: " 
		+ minutos + " ,e em segundos :" + segundosTotais)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 344; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */