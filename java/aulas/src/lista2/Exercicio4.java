package lista2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se
		// este n�mero � par ou �mpar.
		// Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero
		// elevado ao quadrado.

		Scanner leia = new Scanner(System.in);

		int numero;
		double quadrado, raiz;

		System.out.print("Digite um n�mero qualquer: ");
		numero = leia.nextInt();

		if (numero <= 0) {
			System.out.println("O n�mero digitado � menor ou igual a zero.");
		}

		else if (numero % 2 == 0) {
			raiz = Math.sqrt(numero);
			System.out.printf("O n�mero digitado %d � par, e sua raiz quadrada � %.2f", numero, raiz);
		} else if (numero % 2 != 0) {
			quadrado = Math.pow(numero, 2);
			System.out.printf("O n�mero %d � impar, e elevado ao quadrado � %.2f", numero, quadrado);
		}

	}

}
