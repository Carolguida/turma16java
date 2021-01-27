package aulas;

import java.util.Scanner;

public class Lista1Ex6 
{
	public static void main(String[] args)
	{
		double d, sub1, sub2, x1,x2,y1,y2;
		
		Scanner ler = new Scanner(System.in);
				
		System.out.println("Entre com o valor de X1: ");
		x1 = ler.nextDouble();
		System.out.println("Entre com o valor de X2: ");
		x2 = ler.nextDouble();
		System.out.println("Entre com o valor de Y1: ");
		y1 = ler.nextDouble();
		System.out.println("Entre com o valor de Y2: ");
		y2 = ler.nextDouble();
		
		sub1 = Math.pow((x2-x1), 2);
		sub2 = Math.pow((y2-y1), 2);
		d = Math.sqrt(sub1+sub2);
		
		System.out.println("O resultado é: " + d);
		
		
		
	}
}
