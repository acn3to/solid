import DIP.CartaoCredito;
import DIP.FormaPagamento;
import DIP.PayPal;
import DIP.SistemaPagamento;
import ISP.OverPowerImpressoraJiraya;
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
        SistemaPagamento sistemaComCartao = new SistemaPagamento(new CartaoCredito());

        sistemaComCartao.realizarPagamento(758.0);

        sistemaComCartao.getFormaPagamento(new PayPal());

        sistemaComCartao.realizarPagamento(200.5);
    }
}



