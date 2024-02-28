package Aula05;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	// GETTERS E SETTERS ----------------------------------------------------------------
	
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	// ----------------------------------------------------------------
	public void status() {
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Status: " + this.getStatus());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
	}
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		
		if (this.getTipo() == "CC") {
			this.setSaldo(50);
		}else if (this.getTipo() == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta Aberta com Sucesso!");
	}
	
	public void fecharConta() {
		if (this.getSaldo()> 0){
			System.out.println("Conta com dinheiro");
		} else if (this.getSaldo() < 0){
			System.out.println("Conta em debito");
		} else {
			this.setStatus(false);
			System.out.println("Conta Fechada com Sucesso!");
		}
	}
	
	public void depositar(float v) {
		if (this.getStatus() == true) {
			float resultado = this.getSaldo() + v;
			this.setSaldo(resultado);
		} else {
			System.out.println("Impossivel Depositar");
		}
	}
	
	public void sacar(float v) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v); 
				System.out.println("Saque realizado com sucesso! Na conta de " + this.getDono());
			}
			else {
				System.out.println("Saldo Insuficiente para Saque");
			}
		} else {
			System.out.println("Impossivel Sacar");
		}
	}
	
	public void pagarMensal() {
		int v = 0;
		if (this.getTipo() == "CC") {
			v = 12;
		} else if (this.getTipo() == "CP") {
			v = 20;
		}
		if (this.getStatus()) {
			if (this.getSaldo() > v) {
				this.setSaldo(this.getSaldo() - v);
			} else {
				System.out.println("Saldo Insuficiente");
			}
		} else {
			System.out.println("Impossivel Pagar");
		}
	}
	
}

