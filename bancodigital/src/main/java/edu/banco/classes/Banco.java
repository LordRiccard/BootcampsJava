package edu.banco.classes;

import java.util.List;

import edu.banco.contas.Conta;
import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Banco {
	private String nome;
	private List<Conta> contas;
}
