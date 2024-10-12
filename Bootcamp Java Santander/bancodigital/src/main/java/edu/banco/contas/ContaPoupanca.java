package edu.banco.contas;
import edu.banco.classes.Cliente;
import edu.banco.erros.IdadeInvalida;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) throws IdadeInvalida {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
}
