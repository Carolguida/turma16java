package lista5;

import java.util.Scanner;

import entidades.ProdutoEletronico;

public class ExProdutoEletronico {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ProdutoEletronico item1 = new ProdutoEletronico('1', 150.00, "PRETO", "MOCHILA NIKE");
		ProdutoEletronico item2 = new ProdutoEletronico('2', 80.00, "AZUL", "MOCHILA ADIDAS");
		ProdutoEletronico item3 = new ProdutoEletronico('3', 180.00, "ROSA", "MOCHILA COCA COLA");
		ProdutoEletronico item4 = new ProdutoEletronico('4', 157.00, "VERMELHO", "MOCHILA IMAGINARIUM");
		//ProdutoEletronico cliente1 = new ProdutoEletronico();

		System.out.print("CÓDIGO \t VALOR  \t COR \t PRODUTO ");
		System.out.println(
				"\n" + item1.codigo + "\t" + item1.precoProduto + "\t\t" + item1.corProduto + "\t" + item1.nomeProduto);
		System.out.println(
				"\n" + item2.codigo + "\t" + item2.precoProduto + "\t\t" + item2.corProduto + "\t" + item2.nomeProduto);
		System.out.println(
				"\n" + item3.codigo + "\t" + item3.precoProduto + "\t\t" + item3.corProduto + " \t" + item3.nomeProduto);
		System.out.println(
				"\n" + item4.codigo + "\t" + item4.precoProduto + "\t\t" + item4.corProduto + "  " + item4.nomeProduto);

		/*
		System.out.print("DIGITE O CÓDIGO PARA SELECIONAR O PRODUTO: ");
		cliente1.selecao = leia.next().charAt(0);

		System.out.print("DIGITE QUANTAS UNIDADES VOCÊ DESEJA: ");
		cliente1.unidades = leia.next().charAt(0);

		System.out.println(cliente1.statusCompra());
		*/
	}

}
