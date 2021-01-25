programa
{
	
	funcao inicio()
	{	// MOSTRA OS ALUNOS
		//SELECIONAR UM ALUNO PELA MATRICULA
		//CADASTRA A NOTA [1-10]
		//PERGUNTA SE CONTINUA S/N
		//SE SIM CADASTRAR DE NOVO
		//SE NÃO LISTA OS ALUNOS NOVAMENTE COM A NOTA E COM A SITUAÇÃO APROVADO SE NOTA ACIMA DE 8
		//EM ANALISE SE NOTA ENTRE 5 E 8, REPROVADO SE ABAIXO DE 5.

		cadeia alunos[] = {"ALONSO MENDES SILVA DE OLIVEIRA","ANDRESSA FERREIRA DOS SANTOS","ATHOS GIOM DE PAIVA MESQUITA","CÂNDIDO JURELMO DOS SANTOS CAVALEIRO","CAROLINA GUIDA","DANIELE DOS SANTOS PINHEIRO","DÉBORA VIDEIRA MONTEIRO","DENILSON TEIXEIRA DE SOUZA","DENISE BRITO ANJOS","FELIPE CASAGRANDE TEIXEIRA DE CASTRO","FERNANDO BEDNARSKI RAMOS","FERNANDO DE BARROS SABALETE","GISELE DE OLIVEIRA PAZ","GUSTAVO DE SOUZA GUILHEN","GUSTAVO ESTEBAN CARRERAS JORGE","GUSTAVO LIMA DE SOUZA","IGOR MILHOMENS DOS SANTOS","JEAN PABLO CESARIO DA SILVA","JESSICA REGINA RODRIGUES HOLANDA","KAREN BERNARDI","KEWIN SOUTO BARROS","LEONARDO LIMA CINTRA","LEONARDO QUEIROZ BURJATO","LUCAS ALVES SCHIMIT","LUCAS DE BARROS PAIFAR","LUCAS LOIOLA DE ALMEIDA","MARCOS DOS SANTOS","MARIA NAZARE CORTEZ LIMA","MARIANA LIMA","MATHEUS RIBEIRO VILLELA","MAYARA CARDINOT MAFIOLETTI","MILTON JUNIOR CAVALCANTE DA PENHA","NATÃ DE ARAUJO GRECU","OSVALDO TAVARES VELASCO","PAOLA ALENCAR LISBOA","RAPHAEL EUZÉBIO SCAZITI","RENATO ANDRÉ NASCIMENTO SILVA","RUI ALMEIDA DE ANDRADE","TATIANE TISSONI ANTUNES","VICTOR DE MORAIS ARAUJO"}
		cadeia matricula [40]
		inteiro notas[40]
		cadeia matricula2, situacao
		caracter opcao = 'S'
		
		escreva(" Matrícula \t\t Aluno \n")
		para (inteiro i=0;i<40;i++)
		{
			matricula[i]= "G16-"+(i+1)
			escreva(matricula[i], "\t\t", alunos[i],"\n")
		
		}
		enquanto (opcao == 'S' ou opcao == 's')
		{
			escreva ("\nDigite a matrícula do aluno: ")
			leia(matricula2)// tem que criar uma outra variável, senão entra no looping
					//Desta forma aqui não repete toda hora pra entrar com dado de matrícula
				para (inteiro i=0;i<40;i++)
				{
					se (matricula2 == matricula[i])
					{
						escreva("\nVocê selecionou o aluno ", alunos[i])
						escreva("\nPor favor, digite a nota do aluno ", alunos[i], " de 1 a 10: ")
						leia(notas[i])
					}
					
				}
			
			escreva("\nDeseja cadastrar outra nota? Por favor, digite [S/N]: ")
			leia(opcao)
		}
		
		limpa()
		escreva("Matrícula \t\t Nota \t\t Status \t\t Nome \n")
		para (inteiro i=0;i<40;i++)
		{
				
				se (notas[i] < 5 e notas[i]>0)
				{
					situacao = "Reprovado"
				}
				senao se (notas[i]>= 5 e notas[i] <= 8)
				{
					situacao = "em análise"
				}
				senao se (notas[i] > 8)
				{
					situacao = "aprovado"
				}
				senao
				{
					escreva("\n",alunos[i], "\t Não avaliado!")
				}
		escreva("Matrícula \t\t Nota \t\t Status \t\t Nome \n")
		}
		
		
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2702; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {alunos, 13, 9, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */