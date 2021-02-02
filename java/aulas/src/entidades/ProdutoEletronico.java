package entidades;

public class ProdutoEletronico {
	public double precoProduto;
	public String corProduto;
	public int unidades;
	public String nomeProduto;
	public char codigo;
	public char selecao;
	public String cliente;

	public ProdutoEletronico(char codigo, double precoProduto, String corProduto, String nomeProduto) {

		this.precoProduto = precoProduto;
		this.corProduto = corProduto;
		this.nomeProduto = nomeProduto;
		this.codigo = codigo;
	}

	public ProdutoEletronico() {

	}

	/*public double statusCompra() {
		double precoFinal = precoProduto * unidades;

		if (selecao == '1') {
			precoProduto = 150;
			precoFinal = precoProduto * unidades;
		} else if (selecao == '2') {
			precoProduto = 80;
			precoFinal = precoProduto * unidades;
		} else if (selecao == '3') {
			precoProduto = 180;
			precoFinal = precoProduto * unidades;
		} else {
			precoProduto = 157;
			precoFinal = precoProduto * unidades;
		}
		return precoFinal;
	}*/

}
