package aulasexercícios;

import java.util.*;


public class ExTriangulo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner leia = new Scanner(System.in);// instaciar = criar
		double base1, base2, base3, altura1, altura2, altura3, area1, area2, area3, maiorArea = 0;
		String maiorTriangulo = null;

		System.out.print("Digite a base do primeiro triangulo: ");
		base1 = leia.nextDouble();
		System.out.print("Digite a altura do primeiro triangulo: ");
		altura1 = leia.nextDouble();
		System.out.print("\nDigite a base do segundo triangulo: ");
		base2 = leia.nextDouble();
		System.out.print("Digite a altura do segundo triangulo: ");
		altura2 = leia.nextDouble();
		System.out.print("\nDigite a base do terceiro triangulo: ");
		base3 = leia.nextDouble();
		System.out.print("Digite a altura do terceiro triangulo: ");
		altura3 = leia.nextDouble();

		area1 = ((base1 * altura1) / 2);
		area2 = ((base2 * altura2) / 2);
		area3 = ((base3 * altura3) / 2);

		if (area1 > area2) {
			if (area1 > area3) {
				maiorTriangulo = "primeiro";
				maiorArea = area1;
			}

		}
		if (area2 > area1) {
			if (area2 > area3) {
				maiorTriangulo = "segundo";
				maiorArea = area2;
			}
		}

		if (area3 > area1) {
			if (area3 > area2) {
				maiorTriangulo = "terceiro";
				maiorArea = area3;
			}
		}
		System.out.printf("\nO %s triângulo corresponde a maior área: %.2f.", maiorTriangulo, maiorArea);
	}

}
