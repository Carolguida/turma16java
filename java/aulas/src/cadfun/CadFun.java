package cadfun;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CadFun {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		List<Empregado> lista = new ArrayList<>(); 
		// List - tratado como interface - não pode implementar um objeto do
		// tipo List (implementou um ArrayList.

		
		System.out.print("Digite sua matrícula: ");
		int matricula = leia.nextInt();
		leia.nextLine();// limpeza bufer teclado
		System.out.print("Insira seu nome: ");
		String nome = leia.nextLine();
		System.out.print("Digite as horas trabalhadas: ");
		int horas = leia.nextInt();
		System.out.print("Digite o valor por hora (valor/hora): ");
		double valorHora = leia.nextDouble();
		System.out.print("Você é terceiro? Digite S-Sim ou N-não: ");
		char opcao = leia.next().toUpperCase().charAt(0);
		if (opcao == 'S') {

			System.out.print("Digite o acréscimo em porcentagem (%): ");
			double acrescimo = leia.nextDouble();

			Terceiros func1 = new Terceiros(nome, matricula, horas, valorHora, acrescimo);
			System.out.println("Seu salário é: R$ " + func1.salario());

		} else {
			Empregado func1 = new Empregado(nome, matricula, horas, valorHora);
			System.out.println("Seu salário é R$: " + func1.salario());
		}

	}

}
