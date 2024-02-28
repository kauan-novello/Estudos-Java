package Aula08;

import java.util.Random;

// Aula sobre agregação

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;

	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			this.setAprovada(true);
			this.setDesafiado(l1);
			this.setDesafiante(l2);
		} else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
	}

	public void lutar() {
		if (this.getAprovada()) {
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentar();

			Random aleat = new Random();
			int vencedor = aleat.nextInt(3);
			
			System.out.println("##### RESULTADO DA LUTA #####");
			
			switch (vencedor) {
				case 0: { // Empate
					System.out.println("Empatou!");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					break;
				}
				case 1: { // Venceu
	
					System.out.println("Vitória do " + this.getDesafiado().getNome());
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					break;
				}
				case 2: { // Perdeu
					System.out.println("Vitória do " + this.getDesafiante().getNome());
					this.desafiante.ganharLuta();
					this.desafiado.perderLuta();
					break;
				}
			}
			System.out.println("#############################");	
		} else {
			System.out.println("Luta não pode acontecer");
		}
	}

	// GETTERS E SETTERS
	// -----------------------------------------------------------------

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean getAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

}
