package exemplos;

import java.util.*;

import entidades.Pessoa;

public class bancaRevista {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		// Pessoa cliente1 = new Pessoa("CAROLINA GUIDA", false); = COLOCANDO
		// CLASSIFICA��O

		Pessoa cliente1 = new Pessoa();
		Pessoa cliente2 = new Pessoa();
		Pessoa cliente3 = new Pessoa();

		System.out.println("Digite o seu nome: ");
		cliente1.nome = leia.next();
		System.out.println("Digite para o qual voc� se identifica [M-masculino, F- feminino ou X- Outros]:  ");
		cliente1.genero = leia.next().toUpperCase().charAt(0);
		System.out.println("Digite o seu ano de nascimento [AAAA]: ");
		cliente1.anoNascimento = leia.nextInt();

		if (cliente1.idade() < 18) {
			System.out.printf("%s: %s, %s, voc� n�o pode comprar revista pornogr�fica!", cliente1.statusIdade(),
					cliente1.statusGenero(cliente1.genero), cliente1.nome);
		} else {
			System.out.printf("%s: %s, %s, voc� pode comprar o que quiser!", cliente1.statusIdade(),
					cliente1.statusGenero(cliente1.genero), cliente1.nome);
		}

	}

}
