package Aula10;

public class Aluno extends Pessoa{
	// Atributos
	private int matricula;
	private String curso;
	
	// Construtor
	
	// Metodos
	public void cancelarMatricula() {
		System.out.println("Matricula Cancelada");
		this.matricula = 0;
	}
	
	// Metodos Especiais
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
