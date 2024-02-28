package aula02;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;

	void status() {
		System.out.println("Cor: " + this.cor);
		System.out.println("Modelo: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: "+ this.carga + "%");
		System.out.println("está tamapada? " + this.tampada);
	}
	
	void tampar() {
		this.tampada = true;
	}

	void destampar() {
		this.tampada = false;
	}

	void rabiscar() {
		if (this.tampada == false) {
			System.out.println("Rabiscando... @%$#¨%$&%*$!");
		} else {
			System.out.println("Não é possivel rabiscar pois a caneta está tampada");
		}
	}
}
