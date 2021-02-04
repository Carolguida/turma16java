package lista7;

public class Cachorro extends Animal implements InterfaceAnimal{

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		
	}

	@Override
	public String emitirSom() {
		
		return "Latindo...";
	}

	@Override
	public String movimentacao() {
		
		return "Correndo...";
	}
	
}
