package entidades;

public class Cliente {
	public String nome;
	public char genero;
	public int anoNascimento;

	public Cliente(String nome, int anoNascimento) {
		super();
		this.nome = nome;
		this.anoNascimento = anoNascimento;
	}

	public int idade() {
		return 2021 - anoNascimento;
	}

	public String statusGenero(char genero) {
		String apelido;

		if (genero == 'F') {
			apelido = "Sra.";
		} else if (genero == 'M') {
			apelido = "Sr.";
		} else {
			apelido = "Srx.";
		}
		return apelido;
	}
}
