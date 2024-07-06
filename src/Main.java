import SRP.ImpressoraDeRelatorio;
import SRP.Venda;
import SRP.Relatorio;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Venda> vendas = new ArrayList<>();
        vendas.add(new Venda(1, "Produto 1", 100.0));
        vendas.add(new Venda(2, "Produto 2", 150.0));
        vendas.add(new Venda(3, "Produto 3", 200.0));

        Relatorio relatorio = new Relatorio();
        String conteudoRelatorio = relatorio.gerarRelatorioVendas(vendas);

        ImpressoraDeRelatorio impressora = new ImpressoraDeRelatorio(System.out);
        impressora.imprimir(conteudoRelatorio);
    }
}
