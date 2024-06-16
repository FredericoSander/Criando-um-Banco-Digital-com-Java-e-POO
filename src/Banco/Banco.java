package Banco;
import java.util.List;


public class Banco {
	
	private int codigo;
	private String nome;
	private List<Conta> contas;
	
	public Banco(int codigo, String nome, List<Conta> contas) {
		this.codigo =codigo;
		this.nome = nome;
		this.contas =contas;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Conta> getContas() {
		return contas;
	}
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void imprimirClientes() {
		System.out.println("Lista de clientes do " + nome + ":");
		for (Conta conta : contas) {
				
			System.out.println(conta.getCliente() + ", Agencia:" + conta.agencia +", Numero da conta: "+conta.numero+", Saldo: R$" + conta.saldo);	
			
			
		}
	}
}

