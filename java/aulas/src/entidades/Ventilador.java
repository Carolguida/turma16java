package entidades;

import encapsulamento.Eletronico;

public class Ventilador extends Eletronico {// herança eletronico (genérico que atende a todos os produtos do tipo
											// eletrônico)

	// atributos
	private int numeroPas;
	private int velocidades;
	private String tipo;

	// Encapsulamento -> Usa o private e então precisa do get e set -> serve para
	// proteger um atributo para que nenhum outro programa(classe) acesse ele.
	public int getNumeroPas() {// Recuperador de atributo: para visualizar no console - printar
		return numeroPas;
	}

	public void setNumeroPas(int numeroPas) {
		// para que a pessoa possa mudar o valor desta variável dentro do
		// código.(modificadores de atributos)
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

	// métodos
	public void aumentarVelocidade() {
		System.out.println("Velocidade aumentou!");
	}

	public void diminuirVelocidade() {
		System.out.println("Velocidade diminuiu!");
	}

}
