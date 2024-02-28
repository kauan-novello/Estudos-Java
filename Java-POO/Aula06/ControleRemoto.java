package Aula06;

public class ControleRemoto implements Controlador {
	private int volume;
	private boolean ligado;
	private boolean tocando;

	public ControleRemoto() {
		this.setVolume(50);
		this.setLigado(true);
		this.setTocando(false);
	}

	// metodo abstratos
	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		if(this.getLigado()) {
			System.out.println("------------MENU-----------");
			System.out.println("Ligado: " + this.getLigado());
			System.out.print("Volume: " + this.getVolume() + " ");
			for (int i = 0; i < 100; i += 10) {
				if(i<this.getVolume()) {
					System.out.print("#");			
				} else {
					System.out.print("-");
				}
			}
			System.out.println("");
			System.out.println("Tocando: " + this.getTocando());
			System.out.println("---------------------------");
		}
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu...");
	}

	@Override
	public void maisVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() + 1);
		} else {
			System.out.println("Impossivel aumentar volume"); // tv desligada
		}
	}

	@Override
	public void menosVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() - 1);
		} else {
			System.out.println("Impossivel diminuir volume"); // tv desligada
		}
	}

	@Override
	public void ligarMudo() {
		if (this.getLigado() && this.getVolume() != 0) {
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		if(this.getLigado() && !(this.getTocando()) ) { //!(this.getTocando()) same this.getTocando() != true
			this.setTocando(true);
		} else {
			System.out.println("Impossivel dar play"); 
		}
	}

	@Override
	public void pause() {
		if(this.getLigado() && this.getTocando()) { 
			this.setTocando(false);
		} else {
			System.out.println("Impossivel pausar"); 
		}
	}

	// GETTERS E SETTERS ------------------------------------------------------

	private int getVolume() {
		return this.volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

}
