package aula03;

// aula sobre modificadores de visibilidade

public class Aula03 {
	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.modelo = "BIC";
		//c1.ponta = 0.5f;
		c1.carga = 97;
		c1.tampada = false;
		c1.status();
		c1.rabiscar();
		
		Caneta c2 = new Caneta();
		c2.cor = "Preta";
		c2.modelo = "FABER-CASTEL";
		//c2.ponta = 0.7f;
		c2.carga = 100;
		c2.tampada = true;
		c2.status();
		c2.rabiscar();
	}
}
