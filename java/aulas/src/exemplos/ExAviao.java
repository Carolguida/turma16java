package exemplos;

import java.util.Scanner;

import entidades.Aviao;

public class ExAviao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Aviao meuAviao = new Aviao();

		meuAviao.mostraModelos();
		System.out.println("Digite qual modelo de avião deseja [1/2/3]: ");
		meuAviao.modelo = leia.next().charAt(0);

		System.out.printf("modelo: %s | Especificação: %s", meuAviao.tipoAviao(meuAviao.modelo),
				meuAviao.especificacaoVelocidade());
	}

}
