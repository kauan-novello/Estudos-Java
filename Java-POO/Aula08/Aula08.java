package Aula08;

import java.util.Random;

// aula sobre agregação

public class Aula08 {
	public static void main(String[] args) {
		
		Lutador l[] = new Lutador[6];
		
		l[0] = new Lutador("Pretty Boy", "França", 		31, 1.75f, 68.9f, 11, 2, 1);
		l[1] = new Lutador("Putscript", "Brasil", 		29, 1.68f, 57.9f, 14, 0, 1);
		l[2] = new Lutador("Snapshadow", "EUA", 		35, 1.65f, 80.9f, 12, 2, 1);
		l[3] = new Lutador("Dead Code", "Austrália", 	28, 1.93f, 81.6f, 13, 0, 2);
		l[4] = new Lutador("UFOCobol", "Brasil", 		37, 1.70f, 119.3f, 5, 4, 2);
		l[5] = new Lutador("Nerdaart", "EUA", 			30, 1.81f, 105.7f, 12, 2, 4);
		
		
		Luta UFC1 = new Luta();
		
		Random r = new Random();
		int l1 = r.nextInt(6);
		int l2 = r.nextInt(6);
		
		UFC1.marcarLuta(l[l1], l[l2]);
		UFC1.lutar();
		// para ver os resultados atualizados pós luta
		l[l1].status();
		l[l2].status();
	}
}
