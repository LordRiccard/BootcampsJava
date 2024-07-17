package edu.banco.erros;

public class SaldoInvalido extends Exception{
    public SaldoInvalido(String err){
        super(err);
    }
}
