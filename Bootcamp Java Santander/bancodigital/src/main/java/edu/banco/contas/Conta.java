package edu.banco.contas;

import edu.banco.classes.Cliente;
import edu.banco.erros.IdadeInvalida;
import edu.banco.erros.SaldoInvalido;
import edu.banco.erros.ValorInvalido;
import edu.banco.interfaces.IConta;
import lombok.Getter;

@Getter
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) throws IdadeInvalida {
		if (cliente.getIdade() < 18)
			throw new IdadeInvalida("Idade inválida para criação de conta");

		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) throws SaldoInvalido {
		if(saldo < valor){
			throw new SaldoInvalido("Saque maior que saldo");
		}
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) throws ValorInvalido {
		if(valor < 0)
			throw new ValorInvalido("Valor depositado não pode ser negativo");
		
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) throws SaldoInvalido, ValorInvalido {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
