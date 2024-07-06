package LSP;

public class ContaPoupanca extends Conta {
    private static final double TAXA_POUPANCA = 0.05;

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo()) {
            saldo -= valor * (1 + TAXA_POUPANCA);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
}

