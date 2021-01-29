programa
{
	
	funcao inicio()
	{
		//variaveis
		real salario =0.0
		inteiro numFilho=0
		real mediaSalario=0.0, mediaFilho=0.0, maiorSalario=0.0,percentualSalario100=0.0
		real totalSalarios = 0.0
		inteiro totalFilhos = 0
		real contador = 0.0
		const inteiro HABITANTES = 20
		
		//entradas e processamentos
		para (inteiro giro=1;giro<=HABITANTES;giro++)
		{
			escreva("Digite o salário do habitante: ")
			leia(salario)
			escreva("Digite o número de filhos do habitante: ")
			leia(numFilho)
			totalSalarios = totalSalarios + salario //totalizador - totaliza o salário
			totalFilhos = totalFilhos + numFilho
			//totalFilhos += numFilhos operador de incremento/decremento
			
			se (salario > maiorSalario)
			{
				maiorSalario = salario //Quando se tem uma sequência de dados - coloca sempre o maior dado na frente
			}

			se (salario <= 100)
			{
				contador ++
				//contador = contador + 1 - mesma coisa q o ++ - Vai dizer quantas pessoas ganham <= a R$ 100
				//contador += 1
				
			}
		}
		//Saidas
		mediaSalario = totalSalarios/ HABITANTES
		mediaFilho = totalFilhos/HABITANTES
		percentualSalario100 = ((contador/HABITANTES)*100)
		
		
		escreva(+ "\n"+"Média salarial dos habitantes é R$: " +mediaSalario+ "\n")
		escreva("A média de filhos é: " +mediaFilho + " filhos " + "\n")
		escreva ("O maior salário informado é R$: " + maiorSalario + "\n")
		escreva("Número de pessoas que ganham até 100 é: " +contador + ",sendo o percentual de : "+ percentualSalario100 + "% \n")
		escreva("Obrigado (a), fim de programa")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 277; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */