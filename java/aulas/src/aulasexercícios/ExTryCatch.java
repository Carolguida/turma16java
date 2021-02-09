package aulasexerc�cios;

import java.util.Scanner;

public class ExTryCatch {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		try {
			System.out.println("Digite uma sequencia de nomes:");
			String[] vetor = leia.nextLine().split(" ");// {"ed","rafao","milton"}
			System.out.println("Digite uma posi��o da lista: ");
			int posicao = leia.nextInt();
			System.out.println("O nome na posi��o escolhida � " + vetor[posicao]);
		} catch (java.lang.ArrayIndexOutOfBoundsException erro) {
			System.out.println("Amig�o, tu digitou um tamanho de indice errado!!!");
		} catch (java.util.InputMismatchException outroerro) {
			System.out.println("Cara, era pra ter digitado um n�mero!!");
		} catch (Exception e) {
			System.out.println("Putz.. ta tudo errado");
		} finally {
			System.out.println("Voc� digitou tudo errado! ");
		}
		System.out.println("Fim de programa!!!!");
	}

}
