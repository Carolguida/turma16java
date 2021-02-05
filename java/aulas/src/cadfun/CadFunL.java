package cadfun;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CadFunL {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		List<Empregado> lista = new ArrayList<>();

		System.out.println("Digite o número de empregados: ");
		int numero = leia.nextInt();
		for (int x = 1; x <= numero; x++) {
			System.out.println("Funcionário: "+x);
			System.out.print("Você é terceiro? Digite S-Sim ou N-não: ");
			char opcao = leia.next().toUpperCase().charAt(0);
			System.out.print("Digite sua matrícula: ");
			int matricula = leia.nextInt();
			leia.nextLine();// limpeza bufer teclado
			System.out.print("Insira seu nome: ");
			String nome = leia.nextLine();
			System.out.print("Digite as horas trabalhadas: ");
			int horas = leia.nextInt();
			System.out.print("Digite o valor por hora (valor/hora): ");
			double valorHora = leia.nextDouble();

			if (opcao == 'S') {

				System.out.print("Digite o acréscimo em porcentagem (%): ");
				double acrescimo = leia.nextDouble();
				lista.add(new Terceiros(nome, matricula, horas, valorHora, acrescimo));

			} else if (opcao == 'N') {
				lista.add(new Empregado(nome, matricula, horas, valorHora));

			}
		}
		for (Empregado i:lista)
		{
			System.out.println(i.getNome() + " - salário: R$ " + i.salario());
		}
	}
}
