package exemplos;

import entidades.Celular;
import entidades.Ventilador;

public class TestaEletronico {

	public static void main(String[] args) {

		//objetos:
		Ventilador v1 = new Ventilador("Arno", 250, 8, "Base"); //instanciamento
		Celular c1 = new Celular("Xiaomi", 999.99, "2560x1080", 2);
		
		/*
		v1.setNome("Carol"); -> torna o atributo nome variável
		System.out.print(v1.getNome());
		*/
		
		System.out.printf("Ventilador %s \nPreço: %.2f\nNumero de pás: %d \nTipo %s \n\n", v1.getNome(), v1.getCusto(), v1.getNumeroPas(), v1.getTipo());
		v1.liga();
		v1.aumentarVelocidade();
		v1.diminuirVelocidade();
		v1.desliga();
		
		System.out.printf("\nCelular %s\nPreco: %.2f\nResolução: %s\nQuantidade de cameras: %d\n\n", c1.getNome(), c1.getCusto(), c1.getResolucao(), c1.getQuantidadeCameras());
		c1.fazerLigacao();
		c1.enviarSms();
		c1.desliga();

	}

}
