programa
{
	
	funcao inicio()
	{
	// cadastrar a nota de 3 alunos:
	//DENISE
	//LUCAS
	//CANDIDO
	//CAROLINA		
	//SOLICITE O NOME DE QUATRO ALUNOS, SUAS RESPECTIVAS NOTAS
	//MOSTRE NA TELA O NOME E A NOTA, E MOSTRE QUAL É A MAIOR NOTA INFORMADA

	cadeia nomeAluno1,nomeAluno2,nomeAluno3,nomeAluno4
	real nota1, nota2,nota3,nota4, maiorNota =0.0

	escreva("Digite o nome do aluno 1: ")
	leia(nomeAluno1)
	escreva("Digite a nota do aluno 1: ")
	leia(nota1)

	se (maiorNota<nota1)
	{
		maiorNota = nota1
	}
	escreva("Digite o nome do aluno 2: ")
	leia(nomeAluno2)
	escreva("Digite a nota do aluno 2: ")
	leia(nota2)
	se (maiorNota<nota2)
	{
		maiorNota = nota2
	}
	escreva("Digite o nome do aluno 3: ")
	leia(nomeAluno3)
	escreva("Digite a nota do aluno 3: ")
	leia(nota3)
	se (maiorNota<nota3)
	{
		maiorNota = nota3
	}
	escreva("Digite o nome do aluno 4: ")
	leia(nomeAluno4)
	escreva("Digite a nota do aluno 4: ")
	leia(nota4)
	se (maiorNota<nota4)
	{
		maiorNota = nota4
	}
	
	escreva(nomeAluno1, "nota: ", nota1,"\n", nomeAluno2, "nota: ",nota2,"\n",nomeAluno3, "nota: ", nota3,"\n",nomeAluno4, "nota: ", nota4,"\n")
	escreva("\nA maior nota é: ", maiorNota)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1167; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */