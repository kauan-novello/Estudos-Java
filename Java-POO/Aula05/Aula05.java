package Aula05;

// aula prática, colocando em prática tudo q foi visto até então

public class Aula05 {
	public static void main(String[] args) {
		
		ContaBanco p1 = new ContaBanco();
		p1.setDono("Kauan Novello");
		p1.setNumConta(12345678);
		p1.abrirConta("CC");
		//p1.setTipo("CC");
		//p1.setStatus(false);
		
		//p1.setSaldo(1000000);
		
		
		ContaBanco p2 = new ContaBanco();
		p2.setDono("João Paulo");
		p2.setNumConta(12345679);
		p2.abrirConta("CP");
	
		p1.status();
		p2.status();
		
		
	}
}
