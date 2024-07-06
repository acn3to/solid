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
        OverPowerImpressoraJiraya printer = new OverPowerImpressoraJiraya();

        printer.imprimirDocumento("documento.txt");
        printer.escaneiarDocumento("documento.jpg");
        printer.faxearDocumento("documento.pdf");
    }
}


