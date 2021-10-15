package Modelo;

public class Funcionario {

	private int Matricula;
	private String nome;
	private String sobrenome;
	private String CPF;
	
	public Funcionario() {
		super();
	}

	public Funcionario(int matricula, String nome, String sobrenome, String cPF) {
		super();
		Matricula = matricula;
		this.nome = nome;
		this.sobrenome = sobrenome;
		CPF = cPF;
	}

	public int getMatricula() {
		return Matricula;
	}

	public void setMatricula(int matricula) {
		Matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	
	
}
