package lista6;

public class TesteEmpregado {

	public static void main(String[] args) {
		Empregado empreg1 = new Empregado("Maria", "Rua Felicidade", "99 99999-9999", "SÃO PAULO", 'F', 1500, 9,
				222);

		// System.out.print("ENDEREÇO\tTELEFONE\tCIDADE\t\tCÓDIGO\tIMPOSTO\tSALARIO
		// BASE");
		System.out.printf("Seja bem-vinda, %s %s", empreg1.statusGenero(empreg1.getGenero()), empreg1.getNome());

		System.out.printf("\nSEUS DADOS: %s | %s | %s | %d | %.1f  | R$ %.2f", empreg1.getEndereco(), empreg1.getCidade(),empreg1.getTelefone(),
				empreg1.getCodigoSetor(), empreg1.getImposto(), empreg1.getSalarioBase());
		
		System.out.printf("\nSeu salário base contabilizando os impostos é: R$ %.2f", empreg1.calcularSalario());
		/*
		 * System.out.println(empreg1.getNome());
		 * System.out.println(empreg1.getEndereco());
		 * System.out.println(empreg1.getTelefone());
		 * System.out.println(empreg1.getCidade());
		 * System.out.println(empreg1.getGenero());
		 * System.out.println(empreg1.getSalarioBase());
		 * System.out.println(empreg1.getImposto());
		 * System.out.println(empreg1.getCodigoSetor());
		 * System.out.println(empreg1.calcularSalario());
		 */
	}

}
