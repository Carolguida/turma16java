package aulasexercícios;

import java.util.Scanner;

public class ToDoList {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String eventoDia[][] = new String[24][31];
		int horaEvento, hora = 0, dia = 0;
		String nomeUsuário;
		char opcao, S, N;
		boolean continuar = true;

		System.out.print("BEM-VINDO, DIGITE O SEU NOME: ");
		nomeUsuário = leia.nextLine();

		do {
			System.out.print("Escolha um dia para o cadastro [1-31]: ");
			dia = leia.nextInt();
			dia = dia - 1;

			while (dia < 1 || dia > 31) {
				System.out.println("DATA INCORRETA \n");
				System.out.print("Escolha uma data entre 1 e 31: ");
				dia = leia.nextInt();
			}

			System.out.print("Escolha um horário para o cadastro [0-24]: ");
			hora = leia.nextInt();

			while (hora < 0 || hora > 24) {
				System.out.println("HORÁRIO INCORRETO \n");
				System.out.print("Escolha um horário para o cadastro [0-24]: ");
				hora = leia.nextInt();
			}

			leia.nextLine();
			System.out.print("INFORME A TAREFA NESTE HORÁRIO: ");
			eventoDia[hora][dia] = leia.nextLine();

			System.out.print("DESEJA CONTINUAR? DIGITE S-SIM E N-NÃO ");
			opcao = leia.next().charAt(0);

		} while (opcao == 'S');

		for (int j = 0; j < 31; j++) {
			for (int i = 0; i < 24; i++) {

			}
		}

	}

}
