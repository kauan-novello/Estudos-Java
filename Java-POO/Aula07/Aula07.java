package Aula07;

// Aula introdutoria à Aula08, criação de uma classe Lutador para agregar a outra classe posteriormente

public class Aula07 {
	public static void main(String[] args) {
		//Lutador l1 = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
		Lutador l[] = new Lutador[3];
		
		l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
		l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 80.9f, 14, 0, 1);
		l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
		
		l[1].status();
	}
}
