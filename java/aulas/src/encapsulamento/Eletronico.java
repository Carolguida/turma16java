package encapsulamento;

public class Eletronico {

	private String nome;
	private double custo;

	public Eletronico(String nome, double custo) {
		super();
		this.nome = nome;
		this.custo = custo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public void liga() {
		System.out.println("O aparelho está ligado");
	}

	public void desliga() {
		System.out.println("O aparelho está desligado");
	}
}
