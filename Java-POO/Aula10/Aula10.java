package Aula10;
// primeira aula sobre herança
public class Aula10 {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Mateus");
		p2.setNome("Marcos");
		p3.setNome("Lucas");
		p4.setNome("João");
		
		p1.setIdade(18);
		p2.setIdade(19);
		p3.setIdade(20);
		p4.setIdade(21);
		
		p1.setSexo("M");
		p2.setSexo("M");
		p3.setSexo("M");
		p4.setSexo("M");
		
		p2.setMatricula(0);
		p2.setCurso(null);
		p2.cancelarMatricula();
		
		p3.setEspecialidade(null);
		p3.setSalario(0);
		p3.receberAumento(0);
		
		p4.setSetor("");
		p4.setTrabalhando(false);
		p4.mudarTrabalho();
		
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	}

}
