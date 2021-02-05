package lista1;

import java.util.Scanner;

public class Lista1Ex5 {
	public static void main(String[] args) {
		int nota1, nota2, nota3;
		double mediaNotas;

		Scanner ler = new Scanner(System.in);

		System.out.println("Entre com o valor da primeira nota: ");
		nota1 = ler.nextInt();
		System.out.println("Entre com o valor da segunda nota: ");
		nota2 = ler.nextInt();
		System.out.println("Entre com a terceira nota: ");
		nota3 = ler.nextInt();

		mediaNotas = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;

		System.out.println("A média final do aluno é: " + mediaNotas);

	}
}
