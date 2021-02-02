package aulas;

import java.util.Scanner;

public class Lista1Ex1 {
	public static void main(String[] args) {
		// Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias
		// e mostre-a expressa apenas em dias.

		Scanner ler = new Scanner(System.in);
		int idadeAnos, idadeDia, idadeMeses, diasTotais;

		System.out.println("Entre com o valor da idade (anos): ");
		idadeAnos = ler.nextInt();
		System.out.println("Entre com o valor da idade (meses): ");
		idadeMeses = ler.nextInt();
		System.out.println("Entre com o valor da idade (dias): ");
		idadeDia = ler.nextInt();

		diasTotais = idadeAnos * 365 + idadeDia + idadeMeses * 30;

		System.out.println("A idade em dias totais é: ");
		System.out.println(diasTotais);

	}
}
