package br.com.iniflex.service;

import br.com.iniflex.domain.model.Funcionario;
import br.com.iniflex.util.DataUtil;
import br.com.iniflex.util.MoedaUtil;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class RelatorioService {

    public void imprimirFuncionarios(List<Funcionario> funcionarios) {
        funcionarios.forEach(f ->
                System.out.printf("%s | %s | %s | %s%n",
                        f.getNome(),
                        DataUtil.formatar(f.getDataNascimento()),
                        MoedaUtil.formatar(f.getSalario()),
                        f.getFuncao())
        );
    }

    public void imprimirPorFuncao(Map<String, List<Funcionario>> agrupados) {
        agrupados.forEach((funcao, lista) -> {
            System.out.println("\nFunção: " + funcao);
            lista.forEach(f -> System.out.println(" - " + f.getNome()));
        });
    }

    public void imprimirSalariosMinimos(List<Funcionario> funcionarios, BigDecimal salarioMinimo, FuncionarioService service) {
        funcionarios.forEach(f -> {
            BigDecimal qtd = service.calcularQtdSalariosMinimos(f, salarioMinimo);
            System.out.println(f.getNome() + " - " + qtd + " salários mínimos");
        });
    }
}
