package lista2;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		// Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

		int num1, num2, num3;
		Scanner leia = new Scanner(System.in);

		System.out.print("Entre com o valor do n�mero 1: ");
		num1 = leia.nextInt();
		System.out.print("Entre com o valor do n�mero 2: ");
		num2 = leia.nextInt();
		System.out.print("Entre com o valor do n�mero 3: ");
		num3 = leia.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.printf("%d � o maior n�mero ", num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.printf("%d � o maior n�mero ", num2);
		} else {
			System.out.printf("%d � o maior n�mero ", num3);
		}

	}
}
