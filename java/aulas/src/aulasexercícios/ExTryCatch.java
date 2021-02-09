package aulasexercícios;

import java.util.Scanner;

public class ExTryCatch {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		try {
			System.out.println("Digite uma sequencia de nomes:");
			String[] vetor = leia.nextLine().split(" ");// {"ed","rafao","milton"}
			System.out.println("Digite uma posição da lista: ");
			int posicao = leia.nextInt();
			System.out.println("O nome na posição escolhida é " + vetor[posicao]);
		} catch (java.lang.ArrayIndexOutOfBoundsException erro) {
			System.out.println("Amigão, tu digitou um tamanho de indice errado!!!");
		} catch (java.util.InputMismatchException outroerro) {
			System.out.println("Cara, era pra ter digitado um número!!");
		} catch (Exception e) {
			System.out.println("Putz.. ta tudo errado");
		} finally {
			System.out.println("Você digitou tudo errado! ");
		}
		System.out.println("Fim de programa!!!!");
	}

}
