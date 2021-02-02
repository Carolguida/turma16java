package lista4;

import java.util.Scanner;
import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {

		// Um dado é lançado 10 vezes e o valor correspondente é anotado.
		// Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
		// A seguir determine e imprima a média aritmética dos lançamentos, contabilize
		// e apresente também quantas foram as ocorrências da maior pontuação.

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
			System.out.printf("%dº lançamento - Dado: %d \n", (x + 1), dados[x]);

		}

		mediaDados = (totalDados / 10);
		System.out.printf("\nO maior valor apresentado é: %d", maiorDado);
		System.out.printf("\n O maior valor apareceu %d veze(s)", contador);
		System.out.printf("\nA média aritmética de todos os valores é: %.2f", mediaDados);

	}
}
