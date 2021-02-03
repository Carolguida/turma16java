package entidades;

import encapsulamento.Eletronico;

public class Ventilador extends Eletronico {// heran�a eletronico (gen�rico que atende a todos os produtos do tipo
											// eletr�nico)

	// atributos
	private int numeroPas;
	private int velocidades;
	private String tipo;

	// Encapsulamento -> Usa o private e ent�o precisa do get e set -> serve para
	// proteger um atributo para que nenhum outro programa(classe) acesse ele.
	public int getNumeroPas() {// Recuperador de atributo: para visualizar no console - printar
		return numeroPas;
	}

	public void setNumeroPas(int numeroPas) {
		// para que a pessoa possa mudar o valor desta vari�vel dentro do
		// c�digo.(modificadores de atributos)
		this.numeroPas = numeroPas;
	}

	public int getVelocidades() {
		return velocidades;
	}

	public void setVelocidades(int velocidades) {
		this.velocidades = velocidades;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Ventilador(String nome, double custo, int numeroPas, String tipo) {
		super(nome, custo);
		this.numeroPas = numeroPas;
		this.tipo = tipo;
	}

	// m�todos
	public void aumentarVelocidade() {
		System.out.println("Velocidade aumentou!");
	}

	public void diminuirVelocidade() {
		System.out.println("Velocidade diminuiu!");
	}

}
