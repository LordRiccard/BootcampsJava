package edu.banco.interfaces;

import edu.banco.erros.SaldoInvalido;
import edu.banco.erros.ValorInvalido;

public interface IConta {
	
	void sacar(double valor) throws SaldoInvalido;
	
	void depositar(double valor) throws ValorInvalido;
	
	void transferir(double valor, IConta contaDestino) throws SaldoInvalido, ValorInvalido;
	
	void imprimirExtrato();
}
