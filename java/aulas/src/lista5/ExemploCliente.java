package lista5;

import java.util.*;

import entidades.Cliente;

public class ExemploCliente {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Cliente cliente1 = new Cliente("CAROLINA", 1994);
		
		System.out.println("INSIRA SEU GENERO [F-FEMININO M- MASCULINO X- OUTROS]: ");
		cliente1.genero = leia.next().toUpperCase().charAt(0);
		
		System.out.printf("BEM VINDO A LOJA PARCE, %s %s.",cliente1.statusGenero(cliente1.genero),cliente1.nome);
		System.out.printf("\nPARABÉNS! Você possui %d anos!", cliente1.idade());
		
		
	}

}
