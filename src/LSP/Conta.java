package LSP;

public abstract class Conta {
    protected double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public abstract void sacar(double valor);

    public abstract void depositar(double valor);

    public double getSaldo() {
        return saldo;
    }
}
