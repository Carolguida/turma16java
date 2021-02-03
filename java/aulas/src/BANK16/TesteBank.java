package BANK16;

import java.util.*;

public class TesteBank {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		char opcao;
		double valor;

		System.out.print("Digite o número da sua conta: ");
		String numero = leia.next();
		System.out.print("Digite seu cpf: ");
		String cpf = leia.next();
		System.out.print("Digite o dia do seu aniversário: ");
		int dia = leia.nextInt();

		Poupanca conta1 = new Poupanca(numero, cpf, dia);
		/*
		 * Poupanca conta2 = new Poupanca(numero,cpf,diaAniversario);
		 * conta2.setDiaAniversario(14);
		 */
		for (int x = 0; x < 3; x++) {
			System.out.print("\nDigite D-Débito ou C- crédito: ");
			opcao = leia.next().toUpperCase().charAt(0);
			System.out.print("Digite o valor: ");
			valor = leia.nextDouble();
			if (opcao == 'D') {
				conta1.debitar(valor);
			} else if (opcao == 'C') {
				conta1.creditar(valor);
			} else {
				System.out.println("Opção inválida.");
			}
			System.out.printf("Saldo atual: R$ %.2f", conta1.getSaldo());
		}
		System.out.print("\nDigite o dia de hoje: ");
		dia = leia.nextInt();
		conta1.aniversario(dia);

		System.out.printf("Saldo atual: R$ %.2f", conta1.getSaldo());
	}

}
