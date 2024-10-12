package edu.banco.contas;
import edu.banco.classes.Cliente;
import edu.banco.erros.IdadeInvalida;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) throws IdadeInvalida {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
