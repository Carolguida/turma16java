package lista6;

public class Fornecedor extends Pessoas {

	private double valorCredito;
	private double valorDivida;

	public Fornecedor(String nome, String endereco, String telefone, String cidade, char genero, double valorCredito,
			double valorDivida) {
		super(nome, endereco, telefone, cidade, genero);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;

	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	public double obterSaldo() {
		return (valorCredito - valorDivida);
	}
}
