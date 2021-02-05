package cadfun;

public final class Terceiros extends Empregado { //torna essa classe final - ninguém mais pode extender a classe terceiros

	private double acrescimo;

	public Terceiros(String nome, int matricula, int horas, double valorHora, double acrescimo) {
		super(nome, matricula, horas, valorHora);
		this.acrescimo = acrescimo;
	}

	@Override
	public double salario() {

		return super.salario() + (super.salario() * (acrescimo/100));
	}

	public double getAcrescimo() {
		return acrescimo;
	}

	public void setAcrescimo(double acrescimo) {
		this.acrescimo = acrescimo;
	}

}
