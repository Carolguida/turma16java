package lista3;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		// Escrever um programa que receba v�rios n�meros inteiros no teclado.
		// E no final imprimir a m�dia dos n�meros m�ltiplos de 3.
		// Para sair digitar 0 (zero).

		Scanner leia = new Scanner(System.in);
		double media = 0.0;
		double soma = 0, contador = 0;
		int numero;

		do {
			System.out.print("Digite um n�mero inteiro: ");
			numero = leia.nextInt();

			if (numero % 3 == 0 && numero != 0) {
				soma += numero;
				contador++;

			}

		} while (numero != 0);

		if (contador != 0) {
			media = (soma / contador);
			System.out.printf("\nA m�dia dos n�meros m�ltiplos de 3 �: %.2f", media);
		} else {
			System.out.println("Nenhum n�mero m�ltiplo de 3 foi informado. N�o existe m�dia.");
		}

	}
}
