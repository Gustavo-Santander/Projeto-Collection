package Modelo;

public class Cliente {

	private int idCliente;
	private String nome;
	private String sobrenome;
	private String CPF;

	public Cliente() {
		super();

	}

	public Cliente(int idCliente, String nome, String sobrenome, String cPF) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.sobrenome = sobrenome;
		CPF = cPF;
	}
	
	
	

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNomeString(String nome) {
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
