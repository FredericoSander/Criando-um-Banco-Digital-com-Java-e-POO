package Banco;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Cliente> clientes = new ArrayList<>();
				
		Cliente cliente1 = Conta.cadastrarCliente("Joao da Silva","851.654.982-73");
		Cliente cliente2 = Conta.cadastrarCliente("Antônio de Oliveira Medeiros","123.456.789-78");
		Cliente cliente3 = Conta.cadastrarCliente("Heleanor Santos","527.681.597-23");
		Cliente cliente4 = Conta.cadastrarCliente("Jusefina Bragança","578.741.6897-11");
		Cliente cliente5 = Conta.cadastrarCliente("Dulcinéia Santos","123.987.456-47");
		Cliente cliente6 = Conta.cadastrarCliente("Elenice Bartolomeu","874.254.412-66");
		Cliente cliente7 = Conta.cadastrarCliente("Heleanor Santos","624.456.123-02");
		Cliente cliente8 = Conta.cadastrarCliente("Joaquim de Paula","486.852.654-54");
		Cliente cliente9 = Conta.cadastrarCliente("Otávio Augusto","357.147.789-27");
		Cliente cliente10 = Conta.cadastrarCliente("Russuel Matt","159.369.951-33");
				
		//Cadastro do clientes
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		clientes.add(cliente4);
		clientes.add(cliente5);
		clientes.add(cliente6);
		clientes.add(cliente7);
		clientes.add(cliente8);
		clientes.add(cliente9);
		clientes.add(cliente10);
		
		//Criação de novas contas		
		ContaCorrente contaCorrente1 = new ContaCorrente (cliente1);
		ContaCorrente contaCorrente2 = new ContaCorrente (cliente2);
		ContaPoupanca contaPoupanca1 = new ContaPoupanca (cliente1);
		ContaPoupanca contaPoupanca2 = new ContaPoupanca (cliente3);
		ContaCorrente contaCorrente3 = new ContaCorrente (cliente3);
		ContaPoupanca contaPoupanca3 = new ContaPoupanca (cliente8);
		ContaCorrente contaCorrente4 = new ContaCorrente (cliente4);
		ContaPoupanca contaPoupanca4 = new ContaPoupanca (cliente9);
		ContaCorrente contaCorrente5 = new ContaCorrente (cliente5);
		ContaPoupanca contaPoupanca5 = new ContaPoupanca (cliente10);
		ContaCorrente contaCorrente6 = new ContaCorrente (cliente6);
		ContaPoupanca contaPoupanca6 = new ContaPoupanca (cliente7);
		ContaCorrente contaCorrente7 = new ContaCorrente (cliente7);
		
		
			
		//cadastro de operações de deposito
		contaCorrente1.depositar(1000.0);
		contaCorrente2.depositar(5000.0);
		contaCorrente3.depositar(4000.0);
		contaCorrente4.depositar(2000.0);
		contaCorrente5.depositar(3300.0);
		contaCorrente6.depositar(1254.0);
		contaPoupanca3.depositar(1478.0);
		contaPoupanca5.depositar(7548.0);
		
		//Cadastro de operações de transferencia
		contaCorrente3.transferir(1000.0,contaPoupanca2);
		contaCorrente1.transferir(500.0,contaPoupanca1);
		
			
		//Imprimindo as informações das contas antes do cadastro de operações
		contaCorrente1.imprimirExtrato();
		contaPoupanca1.imprimirExtrato();
		contaCorrente2.imprimirExtrato();
		contaPoupanca2.imprimirExtrato();
		contaPoupanca5.imprimirExtrato();
		contaPoupanca3.imprimirExtrato();
		contaPoupanca4.imprimirExtrato();
		contaCorrente3.imprimirExtrato();
		contaCorrente6.imprimirExtrato();
		contaCorrente4.imprimirExtrato();
		
		List<Conta> contas = List.of(contaCorrente1,contaCorrente2,contaCorrente3,contaPoupanca1,contaPoupanca2,contaCorrente4,contaCorrente2,contaCorrente5,contaCorrente6,contaCorrente7,contaPoupanca1,contaPoupanca4,contaPoupanca5,contaPoupanca6);
		
		Banco banco = new Banco(001,"Banco DIO Santander",contas);
		
		banco.imprimirClientes();
	}
}
