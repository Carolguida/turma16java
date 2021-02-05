package lista7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class EstoqueLoja {

	public static void main(String[] args) {

		Collection<String> estoque = new ArrayList<>();

		estoque.add("Mouse");
		estoque.add("Monitor");
		estoque.add("Notebook");
		estoque.add("SSD 200Gb");
		estoque.add("Fone de Ouvido");

		System.out.println("Estoque: " + estoque);

		estoque.remove("Mouse");
		System.out.println("Estoque: " + estoque);
		
		Collection<String> estoque2 = Arrays.asList("Desktop", "Teclado");
		estoque.addAll(estoque2);
		
		for (String i:estoque)
		{
			System.out.println("Estoque: "+i);
		}
	}

}
