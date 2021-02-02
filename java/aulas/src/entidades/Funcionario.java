package entidades;

public class Funcionario {
	public String nomeFuncionario;
	public String empresaFuncionario;
	public String profissaoFuncionario;
	public String matriculaFuncionario;
	public double salarioFuncionario;

	public Funcionario(String nomeFuncionario, String empresaFuncionario, String profissaoFuncionario,
			double salarioFuncionario) {
		super();
		this.nomeFuncionario = nomeFuncionario;
		this.empresaFuncionario = empresaFuncionario;
		this.profissaoFuncionario = profissaoFuncionario;
		this.salarioFuncionario = salarioFuncionario;
	}
	
	public String getFuncionario()
	{
		String funcionario = " NOME: "+ nomeFuncionario + "| PROFISSÃO: " +profissaoFuncionario + "| EMPRESA: " + empresaFuncionario + "| SALÁRIO: R$ " + salarioFuncionario;
		return funcionario;
	}
			
}
