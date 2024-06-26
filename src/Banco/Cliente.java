package Banco;

public class Cliente {
	
	private int id;
	private String nome;
	private String cpf;
	
	
	public Cliente(int id, String nome, String cpf) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCPF() {
		return cpf;
	}
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Código Cliente: " +id+ ", Nome do cliente: "+ nome +", CPF: "+cpf;
	}
	
}
