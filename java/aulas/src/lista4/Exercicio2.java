package lista4;

import java.util.Scanner;
import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {

		// Um dado � lan�ado 10 vezes e o valor correspondente � anotado.
		// Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor.
		// A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize
		// e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.

		int dados[] = new int[10];
		double mediaDados, totalDados = 0.0;
		int maiorDado = 0, contador = 0;
		Random gerador = new Random();

		for (int x = 0; x < 10; x++) {
			dados[x] = gerador.nextInt(6) + 1;
			totalDados += dados[x];

			if (dados[x] > maiorDado) {
				contador = 0;
				maiorDado = dados[x];
			}
			if (dados[x] == maiorDado) {
				contador++;
			}

		}

		for (int x = 0; x < 10; x++) {
			System.out.printf("%d� lan�amento - Dado: %d \n", (x + 1), dados[x]);

		}

		mediaDados = (totalDados / 10);
		System.out.printf("\nO maior valor apresentado �: %d", maiorDado);
		System.out.printf("\n O maior valor apareceu %d veze(s)", contador);
		System.out.printf("\nA m�dia aritm�tica de todos os valores �: %.2f", mediaDados);

	}
}
