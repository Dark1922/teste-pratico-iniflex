package br.com.iniflex.domain.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private BigDecimal salario;
    private final String funcao;

    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void aplicarReajuste(BigDecimal percentual) {
        this.salario = salario.add(salario.multiply(percentual));
    }

    public String getFuncao() {
        return funcao;
    }
}