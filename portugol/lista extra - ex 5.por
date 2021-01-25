programa
{
	
	funcao inicio()
	{
		//Faça um programa que leia um vetor de 5 posições para números reais e, depois, um código inteiro. 
		//Se o código for zero, finalize o programa; se for 1, mostre o vetor na ordem direta; se for 2, mostre o vetor na ordem inversa. 
		//Caso o código for diferente de 1 e 2, escreva uma mensagem informando código inválido.
		
		real vetor[5], vetor2 = 0.0
		inteiro codigo,x

		escreva("Digite 1-, 2- ou 0- para o código: ")
		leia(codigo)
		
		se (codigo == 1)
		{
			para (x=0; x<5; x++)
			{
				escreva("Digite um valor: ")
				leia(vetor[x])
			}
			para (x=0; x<5; x++)
			{
					escreva ("\nVetor posição", x+1, " : ", vetor[x])
			}
			
	
		}
		senao se (codigo == 2)
		{
			para (x=0; x<5; x++)
			{
				escreva("Digite um valor: ")
				leia(vetor[x])
			}
			para (x=4; x>=0; x--)
			{
				escreva ("\nVetor posição", x+1, " : ", vetor[x])
			}
			
		}
		senao se (codigo > 2 ou codigo < 0)
		{
			escreva("\nCódigo inválido.")
			
		}
		senao
		{
			escreva (" ")
		}
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 891; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 10, 7, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */