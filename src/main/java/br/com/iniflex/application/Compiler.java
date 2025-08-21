package br.com.iniflex.application;

import br.com.iniflex.domain.model.Funcionario;
import br.com.iniflex.service.FuncionarioService;
import br.com.iniflex.service.RelatorioService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Compiler {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = carregarFuncionarios();

        FuncionarioService funcionarioService = new FuncionarioService();
        RelatorioService relatorioService = new RelatorioService();

        // 3.2 Remover João
        funcionarios.removeIf(f -> f.getNome().equalsIgnoreCase("João"));

        // 3.3 Imprimir funcionários
        relatorioService.imprimirFuncionarios(funcionarios);

        // 3.4 Reajuste 10%
        funcionarioService.aplicarReajuste(funcionarios, BigDecimal.valueOf(0.10));

        // 3.5 Agrupar por função
        var agrupados = funcionarioService.agruparPorFuncao(funcionarios);

        // 3.6 Imprimir agrupados
        relatorioService.imprimirPorFuncao(agrupados);

        // 3.8 Aniversariantes
        System.out.println("\n--- Aniversariantes outubro e dezembro ---");
        funcionarioService.filtrarPorMesAniversario(funcionarios, 10, 12)
                .forEach(f -> System.out.println(f.getNome()));

        // 3.9 Mais velho
        funcionarioService.encontrarMaisVelho(funcionarios).ifPresent(f ->
                System.out.println("\nMais velho: " + f.getNome() + " - " +
                        funcionarioService.calcularIdade(f) + " anos"));

        // 3.10 Ordem alfabética
        System.out.println("\n--- Ordem alfabética ---");
        funcionarioService.ordenarPorNome(funcionarios)
                .forEach(f -> System.out.println(f.getNome()));

        // 3.11 Total salários
        System.out.println("\nTotal salários: " + funcionarioService.somarSalarios(funcionarios));

        // 3.12 Salários mínimos
        System.out.println("\n--- Quantos salários mínimos cada funcionário ganha ---");
        relatorioService.imprimirSalariosMinimos(funcionarios, new BigDecimal("1212.00"), funcionarioService);
    }

    private static List<Funcionario> carregarFuncionarios() {
        return new ArrayList<>(List.of(
                new Funcionario("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44"), "Operador"),
                new Funcionario("João", LocalDate.of(1990, 5, 12), new BigDecimal("2284.38"), "Operador"),
                new Funcionario("Caio", LocalDate.of(1961, 5, 2), new BigDecimal("9836.14"), "Coordenador"),
                new Funcionario("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88"), "Diretor"),
                new Funcionario("Alice", LocalDate.of(1995, 1, 5), new BigDecimal("2234.68"), "Recepcionista"),
                new Funcionario("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72"), "Operador"),
                new Funcionario("Arthur", LocalDate.of(1993, 3, 31), new BigDecimal("4071.84"), "Contador"),
                new Funcionario("Laura", LocalDate.of(1994, 7, 8), new BigDecimal("3017.45"), "Gerente"),
                new Funcionario("Heloísa", LocalDate.of(2003, 5, 24), new BigDecimal("1606.85"), "Eletricista"),
                new Funcionario("Helena", LocalDate.of(1996, 9, 2), new BigDecimal("2799.93"), "Gerente")
        ));
    }
}
