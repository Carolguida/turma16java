package entidades;

public class Aviao {

	public String cor;
	public char modelo;

	public void mostraModelos() {

		System.out.println(
				"MODELOS DE AVIÃO: " + "\n" + "1- Paulistinha" + " " + "2- Airbus A320" + " " + "3- Boeing 787");

	}

	public String tipoAviao(char modelo) {
		String digaModelo;
		if (modelo == '1') {
			digaModelo = "Paulistinha";
		} else if (modelo == '2') {
			digaModelo = "Airbus A320";
		} else {
			digaModelo = "Boeing 787";
		}
		return digaModelo;
	}

	public String especificacaoVelocidade() {
		String digaEspecificacao;

		if (modelo == '1') {
			digaEspecificacao = "Velocidade Máxima -  155 km/h";
		} else if (modelo == '2') {
			digaEspecificacao = "Velocidade Máxima -  875 km/h";
		} else {
			digaEspecificacao = "Velocidade Máxima -  945 km/h";
		}
		return digaEspecificacao;

	}
}
