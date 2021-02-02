package lista2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Faça um programa em que permita a entrada de um número qualquer e exiba se
		// este número é par ou ímpar.
		// Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número
		// elevado ao quadrado.

		Scanner leia = new Scanner(System.in);

		int numero;
		double quadrado, raiz;

		System.out.print("Digite um número qualquer: ");
		numero = leia.nextInt();

		if (numero <= 0) {
			System.out.println("O número digitado é menor ou igual a zero.");
		}

		else if (numero % 2 == 0) {
			raiz = Math.sqrt(numero);
			System.out.printf("O número digitado %d é par, e sua raiz quadrada é %.2f", numero, raiz);
		} else if (numero % 2 != 0) {
			quadrado = Math.pow(numero, 2);
			System.out.printf("O número %d é impar, e elevado ao quadrado é %.2f", numero, quadrado);
		}

	}

}
