import LSP.Conta;
import LSP.ContaCorrente;
import LSP.ContaPoupanca;
import OCP.DescontoCrianca;
import OCP.DescontoEstudante;
import OCP.Pedido;
import SRP.ImpressoraDeRelatorio;
import SRP.Venda;
import SRP.Relatorio;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente(1000);

        contaCorrente.depositar(500);
        contaCorrente.sacar(300);

        System.out.println("Saldo da Conta Corrente: " + contaCorrente.getSaldo());

        Conta contaPoupanca = new ContaPoupanca(2000);

        contaPoupanca.depositar(1500);
        contaPoupanca.sacar(750);

        System.out.println("Saldo da Conta Poupança: " + contaPoupanca.getSaldo());
    }
}

