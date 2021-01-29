package lista3;

public class Exercicio1 
{
	public static void main(String[] args)
	{
		int resto;
		
		for(int x=1000;x<=1999;x++) 
		{
			resto = x%11;
			
			if (resto == 5)
			{
				System.out.printf("\n O número é: %d", x);
				System.out.printf("\n O resto é: %d", resto);
			}
		}
	}
}
