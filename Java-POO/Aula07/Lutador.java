package Aula07;

public class Lutador {
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria; // Leve, Médio e Pesado
	private int vitorias;
	private int derrotas;
	private int empates;
		
	public void apresentar(){
		System.out.println("--------------------------------------------------");
		System.out.println("Apresentamos o lutador " + this.getNome());
		System.out.println("Ele que é diretamente d " + this.getNacionalidade());
		System.out.println("Com " + this.getIdade() + " anos");
		System.out.println("Com " + this.getAltura() + " m de altura");
		System.out.println("Pesando " + this.getPeso() + " kg");
		System.out.println("Ganhou " + this.getVitorias() + " lutas");
		System.out.println("Perdeu " + this.getDerrotas() + " lutas");
		System.out.println("Empatou " + this.getEmpates() + " lutas");
	}
	public void status(){
		System.out.println(this.getNome() + " é um peso " + this.getCategoria());
		System.out.println("Ganhou " + this.getVitorias() + " vezes");
		System.out.println("Perdeu " + this.getDerrotas() + " vezes");
		System.out.println("Empatou " + this.getEmpates() + " vezes");
	}
	public void ganharLuta(){
		this.setVitorias(this.getVitorias() + 1);
		//this.vitorias = this.vitorias + 1;
	}
	public void perderLuta(){
		this.setDerrotas(this.getDerrotas() + 1);
	}
	public void empatarLuta(){
		this.setEmpates(this.getEmpates() + 1);
	}
	
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
		
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
		this.setIdade(idade);
		this.setAltura(altura);
		this.setPeso(peso);
		this.setVitorias(vitorias);
		this.setDerrotas(derrotas);
		this.setEmpates(empates);
	}
	
	// GETTERS E SETTERS --------------------------------------
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "Inválido";
		} else if(this.peso <= 70.3) {
			this.categoria = "Leve";
		} else if(this.peso <= 83.9) {
			this.categoria = "Médio";
		} else if(this.peso <= 120.2) {
			this.categoria = "Pesado"; 
		} else {
			this.categoria = "Inválido";
		}
		
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	// -----------------------------------------------------
}
