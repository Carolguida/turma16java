programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
		/*
		 * Receber o salário da pessoa e seu nome
		 * Baseado no salário:
		 * Salário até 1.100 reais (inclusive) - Isento
		 * Salário entre maior que 1.100 e 3.500 (inclusive) - 9% imposto  (apresentar o valor do imposto e do salário total)
		 * Salário maior que 3.500 e (inclusive) 10.000 - 15% imposto 
		 *  SALARIOS ACIMA DE 10.000 PAGAM 27% IMPOSTO (MOSTRE IGUAL)
		 *  DETALHE - TRATAR COMO SENHOR OU SENHORA
 		 */

		cadeia nomeUsuario
		caracter sexo
		real salarioBruto=0.00, salarioLiquido=0.00, valorImposto=0.00

		escreva("Por favor, digite seu nome: ")
		leia(nomeUsuario)

		escreva ("Por favor, digite F para feminino e M para masculino: ")
		leia(sexo)

		escreva ("Por favor, digite seu salário bruto: ")
		leia(salarioBruto)

 		se (sexo == 'F'ou sexo == 'f')
 		{
			se (salarioBruto<=1100.00)
 			{
 			escreva("Olá, Sra., você está isenta de imposto")
 			}
 			senao se (salarioBruto >1100.00 e salarioBruto<=3500.00)
 			{
 			valorImposto = salarioBruto*0.09
 			salarioLiquido = salarioBruto - valorImposto
 			escreva("Olá, Sra.,o valor do seu imposto é R$ " + Matematica.arredondar(valorImposto, 2) + " e do seu salário líquido é R$ " + Matematica.arredondar(salarioLiquido,2))
 			}
 			senao se (salarioBruto>3500.00 e salarioBruto<=10000.00)
 			{
 				valorImposto = salarioBruto*0.15
 				salarioLiquido = salarioBruto - valorImposto
 				escreva("Olá, Sra.,o valor do seu imposto é R$ " + Matematica.arredondar(valorImposto, 2) + " e do seu salário líquido é R$ " + Matematica.arredondar(salarioLiquido,2))
 			}
 			senao se (salarioBruto>10000.00)
 			{
				valorImposto = salarioBruto*0.27
 				salarioLiquido = salarioBruto - valorImposto
 				escreva("Olá, Sra.,o valor do seu imposto é R$ " + Matematica.arredondar(valorImposto, 2) + " e do seu salário líquido é R$ " + Matematica.arredondar(salarioLiquido,2))
 			}

 		}

 		senao se  (sexo == 'M' ou sexo == 'm')
 		{
 			se (salarioBruto<=1100.00)
 			{
 				escreva("Olá, Sr., você está isento de imposto")
 			}
 			senao se (salarioBruto>1100.00 e salarioBruto<=3500.00)
 			{
 				valorImposto = salarioBruto*0.09
 				salarioLiquido = salarioBruto - valorImposto
 				escreva("Olá, Sr.,o valor do seu imposto é R$ " + Matematica.arredondar(valorImposto, 2) + " e do seu salário líquido é R$ " + Matematica.arredondar(salarioLiquido,2))
 			}
			senao se (salarioBruto>3500.00 e salarioBruto<=10000.00)
 			{
 				valorImposto = salarioBruto*0.15
 				salarioLiquido = salarioBruto - valorImposto
 				escreva("Olá, Sr.,o valor do seu imposto é R$ " + Matematica.arredondar(valorImposto, 2) + " e do seu salário líquido é R$ " + Matematica.arredondar(salarioLiquido,2))
 			}
 			
 			senao se (salarioBruto>10000.00)
 			{
				valorImposto = salarioBruto*0.27
 				salarioLiquido = salarioBruto - valorImposto
 				escreva("Olá, Sr.,o valor do seu imposto é R$ " + Matematica.arredondar(valorImposto, 2) + " e do seu salário líquido é R$ " + Matematica.arredondar(salarioLiquido,2))
 			}

 		}
		senao 
		{
			se (salarioBruto<=1100.00)
 			{
 				escreva("Olá, Srx., você está isento de imposto")
 			}
 			senao se (salarioBruto>1100.00 e salarioBruto<=3500.00)
 			{
 				valorImposto = salarioBruto*0.09
 				salarioLiquido = salarioBruto - valorImposto
 				escreva("Olá, Srx.,o valor do seu imposto é R$ " + Matematica.arredondar(valorImposto, 2) + " e do seu salário líquido é R$  " + Matematica.arredondar(salarioLiquido,2))
 			}
			senao se (salarioBruto>3500.00 e salarioBruto<=10000.00)
 			{
 				valorImposto = salarioBruto*0.15
 				salarioLiquido = salarioBruto - valorImposto
 				escreva("Olá, Srx.,o valor do seu imposto é R$ " + Matematica.arredondar(valorImposto, 2) + " e do seu salário líquido é R$ " + Matematica.arredondar(salarioLiquido,2))
 			}
 			
 			senao se (salarioBruto>10000.00)
 			{
				valorImposto = salarioBruto*0.27
 				salarioLiquido = salarioBruto - valorImposto
 				escreva("Olá, Srx.,o valor do seu imposto é R$ " + Matematica.arredondar(valorImposto, 2) + " e do seu salário líquido é R$ " + Matematica.arredondar(salarioLiquido,2))
 			}
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3575; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */