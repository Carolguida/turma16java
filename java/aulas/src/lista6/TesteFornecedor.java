package lista6;

public class TesteFornecedor {

	public static void main(String[] args) {
		
		Fornecedor for1 = new Fornecedor ("ADRIANO", "RUA ESPERANÇA, 291", "99 98954-6542","ORLANDO", 'M', 5000, 2000);
		
		System.out.printf("%s %s, seu saldo é: %.2f",for1.statusGenero(for1.getGenero()), for1.getNome(), for1.obterSaldo());
		

	}

}
