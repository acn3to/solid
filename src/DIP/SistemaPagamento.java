package DIP;

public class SistemaPagamento {
    private FormaPagamento formaPagamento;

    public SistemaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void getFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void realizarPagamento(double valor) {
        formaPagamento.pagar(valor);
    }
}
