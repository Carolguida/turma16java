programa
{


	funcao inicio()
	{
		inteiro codigo
		real horasTrabalhadas
		real salario = 0.00
		real excessoHoras= 0.00
		real excessoSalario=0.00
		real totalSalario = 0.00
			
		escreva("Quantas foram as horas trabalhadas?  ")
		leia(horasTrabalhadas)

		
		
		se (horasTrabalhadas==50.00 ou horasTrabalhadas<50.00)
		{
			salario = horasTrabalhadas*10.00
			totalSalario = salario
			escreva("Você não possui nenhum excedente de horário")
			
		}
		senao se (horasTrabalhadas>50.00)
		{
			salario = horasTrabalhadas*10.00
			excessoHoras = (horasTrabalhadas - 50.00)
			excessoSalario = excessoHoras * 20.00
			totalSalario = 500.00 + excessoSalario
						
		}
			escreva (". Desta forma, você receberá " + excessoSalario + " reais pelo excesso" +",totalizando " + totalSalario + " reais")	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 743; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */