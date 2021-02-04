package lista7;

public class Preguica extends Animal implements InterfaceAnimal{

	public Preguica(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String emitirSom() {
		
		return "Emitindo som...";
	}

	@Override
	public String movimentacao() {
		
		return "A preguiça está subindo na árvore...";
	}

}
