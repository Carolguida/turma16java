package aulas;

import java.util.Scanner;

public class Lista1Ex3 {
	public static void main(String[] args) {
		// Faça um sistema que leia o tempo de duração de um evento em uma fábrica
		// expressa em segundos e mostre-o expresso em horas, minutos e segundos.

		Scanner ler = new Scanner(System.in);
		int tempoSegundos, tempoHoras, tempoMinutos, segundosTotal;

		System.out.println("Digite o tempo de duração do evento em segundos: ");
		tempoSegundos = ler.nextInt();

		tempoHoras = tempoSegundos / 3600;
		tempoMinutos = (tempoSegundos % 3600) / 60;
		segundosTotal = (tempoSegundos % 3600) % 60;

		System.out.println("Tempo de duração de um evento da fábrica: " + tempoHoras + " horas, " + tempoMinutos
				+ " minutos, e " + segundosTotal + " segundos.");
		// System.out.println(tempoHoras);
		// System.out.println("Tempo de duração de um evento da fábrica em minutos: ");
		// System.out.println(tempoMinutos);
		// System.out.println("Tempo de duração do evento da fábrica em segundos: ");
		// System.out.println(segundosTotal);
	}
}
