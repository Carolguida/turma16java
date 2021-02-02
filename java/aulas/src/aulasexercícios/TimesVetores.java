package aulasexercícios;

import java.util.Scanner;

public class TimesVetores {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String times[] = { "Corinthians", "Palmeiras", "Santos", "SPFC" };
		int pontos[] = new int[4];
		char opcao;

		for (int x = 0; x < 4; x++) {
			System.out.printf("Rodada %d", (x + 1));
			System.out.print("\n");

			for (int i = 0; i < 4; i++) {

				System.out.printf("Para o time %s, insira 1-Ganhou 2-Empatou 3-Perdeu: ", times[i]);
				opcao = leia.next().charAt(0);

				if (opcao == '1') {
					pontos[i] = pontos[i] + 3;
				} else if (opcao == '2') {
					pontos[i] = pontos[i] + 1;
				} else if (opcao == '3') {
					pontos[i] = pontos[i] + 0;
				}

			}

			System.out.println(" ");
		}
		for (int z = 0; z < 4; z++) {
			System.out.printf("%s finalizou com %d pontos", times[z], pontos[z]);
			System.out.println("\n");
		}
	}
}
