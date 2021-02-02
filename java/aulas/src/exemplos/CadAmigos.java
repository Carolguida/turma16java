package exemplos;

import java.util.*;

import entidades.Pessoa;

public class CadAmigos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Pessoa amigo1 = new Pessoa();
		System.out.println("Digite o nome do amigo: ");
		amigo1.nome = leia.next();
		System.out.println("Digite M-masculino ou F- feminino: ");
		amigo1.genero = leia.next().toUpperCase().charAt(0);
		System.out.println("Digite o ano de nascimento [AAAA]: ");
		amigo1.anoNascimento = leia.nextInt();

		System.out.printf("Olá, %s. Sua idade aproximada é: %d anos", amigo1.nome, amigo1.idade());
		
	}

}
