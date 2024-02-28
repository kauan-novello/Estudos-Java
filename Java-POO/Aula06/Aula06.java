package Aula06;

//  Aula sobre encapsulamento, interfaces, métodos abstratos

/* Vantagens do encapsulamento
 * Tornar mudanças invisiveis
 * Facilitar reutilização de código
 * Reduzir efeitos colaterais
 */

public class Aula06 {

	public static void main(String[] args) {
		ControleRemoto c = new ControleRemoto();
		c.ligar();
		c.maisVolume();
		c.play();
		c.abrirMenu();
		c.fecharMenu();
	}

}
