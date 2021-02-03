package lista6;

public class Empregado extends Pessoas {

	private int codigoSetor;
	private double salarioBase;
	private double imposto;

	public Empregado(String nome, String endereco, String telefone, String cidade, char genero, double salarioBase,
			double imposto, int codigoSetor) {
		super(nome, endereco, telefone, cidade, genero);
		this.imposto = imposto;
		this.salarioBase = salarioBase;
		this.codigoSetor = codigoSetor;

	}

	public double calcularSalario() {
		double salarioFinal = salarioBase - (salarioBase * (imposto / 100));
		return salarioFinal;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

}
