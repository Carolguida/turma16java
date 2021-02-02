package lista3;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		// Escrever um programa que receba vários números inteiros no teclado.
		// E no final imprimir a média dos números múltiplos de 3.
		// Para sair digitar 0 (zero).

		Scanner leia = new Scanner(System.in);
		double media = 0.0;
		double soma = 0, contador = 0;
		int numero;

		do {
			System.out.print("Digite um número inteiro: ");
			numero = leia.nextInt();

			if (numero % 3 == 0 && numero != 0) {
				soma += numero;
				contador++;

			}

		} while (numero != 0);

		if (contador != 0) {
			media = (soma / contador);
			System.out.printf("\nA média dos números múltiplos de 3 é: %.2f", media);
		} else {
			System.out.println("Nenhum número múltiplo de 3 foi informado. Não existe média.");
		}

	}
}
