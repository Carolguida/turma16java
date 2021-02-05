package lista1;

import java.util.Scanner;

public class Lista1Ex2 {
	public static void main(String[] args) {
		// Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
		// expressa em anos, meses e dias.

		Scanner ler = new Scanner(System.in);
		int idadeAnos, idadeMeses, idadeDias;
		double diasTotais;

		System.out.println("Entre com o valor da idade (dias): ");
		idadeDias = ler.nextInt();

		idadeAnos = idadeDias / 360;
		idadeMeses = (idadeDias % 365) / 30;
		diasTotais = (idadeDias % 365) % 30;

		System.out.println("A idade em anos é: ");
		System.out.println(idadeAnos);
		System.out.println("A idade em meses é: ");
		System.out.println(idadeMeses);
		System.out.println("Em dias: ");
		System.out.println(diasTotais);
	}
}
