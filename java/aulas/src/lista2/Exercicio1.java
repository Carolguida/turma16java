package lista2;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		// Faça um programa que receba três inteiros e diga qual deles é o maior.

		int num1, num2, num3;
		Scanner leia = new Scanner(System.in);

		System.out.print("Entre com o valor do número 1: ");
		num1 = leia.nextInt();
		System.out.print("Entre com o valor do número 2: ");
		num2 = leia.nextInt();
		System.out.print("Entre com o valor do número 3: ");
		num3 = leia.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.printf("%d é o maior número ", num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.printf("%d é o maior número ", num2);
		} else {
			System.out.printf("%d é o maior número ", num3);
		}

	}
}
