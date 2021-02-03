package BANK16;

public class Poupanca extends Conta {

	private int diaAniversario;
	private double saldo;

	public Poupanca(String numeroConta, String cpfCliente, int diaAniversario) {
		super(numeroConta, cpfCliente);

		this.diaAniversario = diaAniversario;

	}
	public void aniversario(int dia)
	{
		double correcao = super.getSaldo()*0.0005;
		if (dia == diaAniversario)
		{
			 super.creditar(correcao);
		}
	}

	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int dataAniversario) {
		this.diaAniversario = dataAniversario;
	}

}
