package lista7;

public class Cavalo extends Animal implements InterfaceAnimal{

	public Cavalo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String emitirSom() {
		
		return "O cavalo está relinchando...";
	}

	@Override
	public String movimentacao() {
		
		return "O cavalo está correndo...";
	}

}
