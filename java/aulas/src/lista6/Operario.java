package lista6;

public class Operario extends Pessoas {

	private double valorProducao;
	private double comissao;
	private double salarioBase;

	public Operario(String nome, String endereco, String telefone, String cidade, char genero, double valorProducao,
			double comissao, double salarioBase) {
		super(nome, endereco, telefone, cidade, genero);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
		this.salarioBase = salarioBase;

	}

	public double calcularSalario() {
		double salarioFinal = salarioBase + comissao;
		return salarioFinal;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

}
