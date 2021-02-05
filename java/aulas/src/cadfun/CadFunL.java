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

		System.out.println("Digite o n�mero de empregados: ");
		int numero = leia.nextInt();
		for (int x = 1; x <= numero; x++) {
			System.out.println("Funcion�rio: "+x);
			System.out.print("Voc� � terceiro? Digite S-Sim ou N-n�o: ");
			char opcao = leia.next().toUpperCase().charAt(0);
			System.out.print("Digite sua matr�cula: ");
			int matricula = leia.nextInt();
			leia.nextLine();// limpeza bufer teclado
			System.out.print("Insira seu nome: ");
			String nome = leia.nextLine();
			System.out.print("Digite as horas trabalhadas: ");
			int horas = leia.nextInt();
			System.out.print("Digite o valor por hora (valor/hora): ");
			double valorHora = leia.nextDouble();

			if (opcao == 'S') {

				System.out.print("Digite o acr�scimo em porcentagem (%): ");
				double acrescimo = leia.nextDouble();
				lista.add(new Terceiros(nome, matricula, horas, valorHora, acrescimo));

			} else if (opcao == 'N') {
				lista.add(new Empregado(nome, matricula, horas, valorHora));

			}
		}
		for (Empregado i:lista)
		{
			System.out.println(i.getNome() + " - sal�rio: R$ " + i.salario());
		}
	}
}
