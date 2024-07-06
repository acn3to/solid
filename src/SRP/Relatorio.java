package SRP;

import java.util.List;

public class Relatorio {
    private String conteudo;

    public Relatorio() {
        this.conteudo = "";
    }

    public Relatorio(String conteudo) {
        this.conteudo = conteudo;
    }

    public String gerarRelatorioVendas(List<Venda> vendas) {
        StringBuilder relatorio = new StringBuilder();
        for (Venda venda : vendas) {
            relatorio.append("ID: ").append(venda.getId())
                    .append(", Produto: ").append(venda.getProduto())
                    .append(", Valor: ").append(venda.getValor())
                    .append("\n");
        }
        return relatorio.toString();
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "Relatorio{" +
                "conteudo='" + getConteudo() + '\'' +
                '}';
    }
}
