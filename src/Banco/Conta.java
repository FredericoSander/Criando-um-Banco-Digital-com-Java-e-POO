package Banco;

public class Conta implements IConta {

	private static int AGENCIA_PADRAO = 0001;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {	
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
		
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	
	@Override
	public void sacar(double valor) {
		saldo -=  valor;		
	}

	@Override
	public void depositar(double valor) {
		saldo +=  valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected void imprimirinfoscomuns() {
		System.out.println(String.format("Código Cliente: %d",this.cliente.getId()));
		System.out.println(String.format("Titular: %S",this.cliente.getNome()));
		System.out.println(String.format("CPF Cliente: %S",this.cliente.getCPF()));
		System.out.println(String.format("Agencia: %d",this.agencia));
		System.out.println(String.format("Numero da conta: %d",this.numero));
		System.out.println(String.format("Saldo da conta: %.2f",this.saldo));
		}

	@Override
	public void imprimirExtrato() {
				
	}

	public static Conta criarConta(Cliente cliente) {
		return new Conta(cliente);
	}
	
	public static Cliente cadastrarCliente(String nome, String CPF) {
		int id = SEQUENCIAL++;
		return new Cliente(id, nome,CPF);
	}

	
}
