package aula03;

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;

	public void status() {
		System.out.println("Cor: " + this.cor);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: "+ this.carga + "%");
		System.out.println("está tamapada? " + this.tampada);
	}
	
	public void tampar() {
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;
	}

	public void rabiscar() {
		if (this.tampada == false) {
			System.out.println("Rabiscando... @%$#¨%$&%*$!");
		} else {
			System.out.println("Não é possivel rabiscar pois a caneta está tampada");
		}
	}
}
