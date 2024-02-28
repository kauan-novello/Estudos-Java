package Aula10;

public class Pessoa {
	// Atributos
	private String nome;
	private int idade;
	private String sexo;
	
	// Construtor
	
	// Metodos
	public void fazerAniversario() {
		this.idade = idade++;
	}
	
	// Metodos Especiais
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	// Impressora

	@Override
	public String toString() {
		return "Pessoa [ nome = " + nome + ", idade = " + idade + ", sexo = " + sexo + " ]";
	}
	
}
