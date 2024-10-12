package edu.banco;

import edu.banco.classes.Cliente;
import edu.banco.contas.Conta;
import edu.banco.contas.ContaCorrente;
import edu.banco.contas.ContaPoupanca;
import edu.banco.erros.IdadeInvalida;
import edu.banco.erros.SaldoInvalido;
import edu.banco.erros.ValorInvalido;

public class Main {
	public static void main(String[] args) throws SaldoInvalido, IdadeInvalida, ValorInvalido {
		Cliente cli = new Cliente("Maria", 20);

		Conta cc = new ContaCorrente(cli);
		Conta poupanca = new ContaPoupanca(cli);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
