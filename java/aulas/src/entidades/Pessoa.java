package entidades;

public class Pessoa {

	// ATRIBUTOS
	public String nome;
	public int anoNascimento;
	public char genero;
	public boolean estaViva = true;

	public int idade() {
		return 2021 - anoNascimento; // retorna no programa com essa fórmula.
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

	public String statusIdade() {
		int idade = 2021 - anoNascimento;
		String mensagem;
		if (idade < 18) {
			mensagem = "Pessoa maior de 18 anos";

		} else {
			mensagem = "Pessoa maior que 18 anos";

		}
		return mensagem;

	}

}
