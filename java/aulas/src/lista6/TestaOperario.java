package lista6;

public class TestaOperario {

	public static void main(String[] args) {
		
		Operario op1 = new Operario("Amanda", "Rua Europa", "21 98989-9898", "Rio de Janeiro", 'F', 1500, 500, 4000);
		
		System.out.printf("Seja bem-vinda, %s %s", op1.statusGenero(op1.getGenero()), op1.getNome());
		System.out.printf("\nVocê receberá um salário final de R$ %.2f", op1.calcularSalario());
	}

}

