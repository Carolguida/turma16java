package BANK16;

public class Conta {

	private String numero;
	private String cpf;
	private double saldo;

	public Conta(String numeroConta, String cpfCliente) { // construtor
		super();
		this.numero = numeroConta;
		this.cpf = cpfCliente;

	}

	public void debitar(double valor) {
		/*
		 * if(saldo<=0) {
		 * 
		 * System.out.println("Valor informado nao corresponde ao solicitado"); } else {
		 * this.saldo -= valor; }
		 */

		if (saldo <= 0) {
			System.out.println("Saldo zero!Faça um crédito primeiramente");
		} else {
			saldo -= valor;
		}
	}

	public void creditar(double valor) {
		saldo = saldo + valor;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numeroConta) {
		this.numero = numeroConta;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpfCliente) {
		this.cpf = cpfCliente;
	}

	public double getSaldo() {
		return saldo;
	}

}
