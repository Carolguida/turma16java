package aulas;

import java.util.Scanner;

public class Lista1Ex3 {
	public static void main(String[] args) {
		// Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
		// expressa em segundos e mostre-o expresso em horas, minutos e segundos.

		Scanner ler = new Scanner(System.in);
		int tempoSegundos, tempoHoras, tempoMinutos, segundosTotal;

		System.out.println("Digite o tempo de dura��o do evento em segundos: ");
		tempoSegundos = ler.nextInt();

		tempoHoras = tempoSegundos / 3600;
		tempoMinutos = (tempoSegundos % 3600) / 60;
		segundosTotal = (tempoSegundos % 3600) % 60;

		System.out.println("Tempo de dura��o de um evento da f�brica: " + tempoHoras + " horas, " + tempoMinutos
				+ " minutos, e " + segundosTotal + " segundos.");
		// System.out.println(tempoHoras);
		// System.out.println("Tempo de dura��o de um evento da f�brica em minutos: ");
		// System.out.println(tempoMinutos);
		// System.out.println("Tempo de dura��o do evento da f�brica em segundos: ");
		// System.out.println(segundosTotal);
	}
}
