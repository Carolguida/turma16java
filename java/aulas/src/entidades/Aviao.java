package entidades;

public class Aviao {

	public String cor;
	public char modelo;

	public void mostraModelos() {

		System.out.println(
				"MODELOS DE AVI�O: " + "\n" + "1- Paulistinha" + " " + "2- Airbus A320" + " " + "3- Boeing 787");

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
			digaEspecificacao = "Velocidade M�xima -  155 km/h";
		} else if (modelo == '2') {
			digaEspecificacao = "Velocidade M�xima -  875 km/h";
		} else {
			digaEspecificacao = "Velocidade M�xima -  945 km/h";
		}
		return digaEspecificacao;

	}
}
