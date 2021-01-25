programa
{
	
	funcao inicio()
	{
		// Pedir ao usuário nome[Completo ou 1 nome] 
		// sexo [M/F]
		// Ano de nascimento [AAAA]
		// Escrever na tela a idade aproximada da pessoa

		//variáveis - ingredientes
		caracter sexoUsuario
		cadeia nomeUsuario
		inteiro anoNascimento, resultadoIdade
		//para fazer uma variável constante : const inteiro [NOMEVARIAVEL(letra maiúscula)] = [numero]

		// Entradas
		escreva("Escreva seu nome completo, por favor: ")
		leia(nomeUsuario)

		escreva("Qual seu sexo? Digite M para masculino ou F para feminino: ")
		leia(sexoUsuario)

		escreva("Por favor, digite seu ano de nascimento: ")
		leia(anoNascimento)

		//processamento
		resultadoIdade = 2021 - anoNascimento 

		//saídas
		se (sexoUsuario == 'M' ou sexoUsuario == 'm')
		{
					
			se (resultadoIdade < 18){
				escreva("Bom dia, "+nomeUsuario+"! Sua idade aproximada é "+resultadoIdade+" anos, e você é considerado jovem!")		
			}
			senao se (resultadoIdade < 59){
				escreva("Bom dia, Sr. "+nomeUsuario+"! Sua idade aproximada é "+resultadoIdade+" anos, e você é considerado adulto!")		
			}
			senao se (resultadoIdade > 60){
				escreva("Bom dia, Sr. "+nomeUsuario+"! Sua idade aproximada é "+resultadoIdade+" anos, e você é considerado idoso!")
			}
		}
		senao se (sexoUsuario == 'F'ou sexoUsuario == 'f')
		{
			se (resultadoIdade < 18){
				escreva("Bom dia,"+nomeUsuario+"! Sua idade aproximada é "+resultadoIdade+" anos, e você é considerado jovem!")		
			}
			senao se (resultadoIdade < 59){
				escreva("Bom dia, Sra. "+nomeUsuario+"! Sua idade aproximada é "+resultadoIdade+" anos, e você é considerada adulta!")		
			}
			senao se (resultadoIdade > 60){
				escreva("Bom dia, Sra. "+nomeUsuario+"! Sua idade aproximada é "+resultadoIdade+" anos, e você é considerada idosa!")
			}
		}	
		senao
		{
			se (resultadoIdade < 18){
				escreva("Bom dia, "+nomeUsuario+"! Sua idade aproximada é "+resultadoIdade+" anos, e você é considerado jovem!")		
			}
			senao se (resultadoIdade < 59){
				escreva("Bom dia, Srx. "+nomeUsuario+"! Sua idade aproximada é "+resultadoIdade+" anos, e você é considerada adultx!")		
			}
			senao se (resultadoIdade > 60){
				escreva("Bom dia, Srx. "+nomeUsuario+"! Sua idade aproximada é "+resultadoIdade+" anos, e você é considerada idosx!")
			}
		}
			
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 772; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */