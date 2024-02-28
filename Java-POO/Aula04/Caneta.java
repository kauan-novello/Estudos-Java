package Aula04;

public class Caneta {
	public String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;

	public Caneta(String m, String c, float p) {
		//this.modelo = m;
		this.setModelo(m);
		//this.cor = c;
		this.setCor(c);
		//this.ponta = p;
		this.setPonta(p);
		//this.setTampada(true);
		this.tampar();
	}

	// metodos acessessores e modificadores
	
	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String m) {
		this.modelo = m;
	}

	public float getPonta() {
		return this.ponta;
	}

	public void setPonta(float p) {
		this.ponta = p;
	}

	public String getCor() {
		return this.cor;
	}
	public void setCor(String c) {
		this.cor = c;
	}
	
	public boolean getTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	
	// metodos comuns
	
	public void tampar() {
		this.setTampada(true);
	}
	public void destampar() {
		this.setTampada(false);
	}
	
	public void status() {
		System.out.println("SOBRE A CANETA:");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Cor: " + this.cor);
		if(this.getTampada() == true) {
			System.out.println("Caneta está tampada!");
		} else {
			System.out.println("Caneta está destampada!");
		}
	}

	

}
