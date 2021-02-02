package aulas;

import java.util.Scanner;

public class Lista1Ex7 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a, b, c, d, e, x, y, f;

		System.out.println("Entre com o valor de A: ");
		a = ler.nextDouble();
		System.out.println("Entre com o valor de B: ");
		b = ler.nextDouble();
		System.out.println("Entre com o valor de C: ");
		c = ler.nextDouble();
		System.out.println("Entre com o valor de D: ");
		d = ler.nextDouble();
		System.out.println("Entre com o valor de E: ");
		e = ler.nextDouble();
		System.out.println("Entre com o valor de F: ");
		f = ler.nextDouble();

		x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		y = ((a * f) - (c * d)) / ((a * e) - (b * d));

		System.out.println("O valor de x é: " + x + " e y é: " + y);

	}
}
