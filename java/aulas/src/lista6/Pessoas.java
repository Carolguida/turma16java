package lista6;

public class Pessoas {

	private String nome;
	private String endereco;
	private String telefone;
	private char genero;
	private String cidade;

	public Pessoas(String nome, String endereco, String telefone, String cidade, char genero) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.genero = genero;
		this.cidade = cidade;

	}

	public Pessoas() {

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

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

}
