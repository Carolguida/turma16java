package exemplos;

import entidades.Produto;

public class ExemploProdutos {

	public static void main(String[] args) {

		Produto item1 = new Produto("123-8", "CERVEJA GABIROL", 12.0);

		System.out.print("C�DIGO \t PRODUTO \t\t VALOR UNIT�RIO ");
		System.out.println("\n" + item1.codigoProduto + "\t " + item1.nomeProduto + " \t\t" + item1.valorUnitario);

	}

}
