package Aula10;

public class Professor extends Pessoa{
	// Atributos
	private String especialidade;
	private float salario;
	
	// Construtor
	
	// Metodos
	public void receberAumento(float aum) {
		this.salario += aum;
	}
	
	// Metodos Especiais
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
}
