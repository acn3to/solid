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
        Pedido pedido = new Pedido();

        pedido.addDesconto(new DescontoEstudante());
        pedido.addDesconto(new DescontoCrianca());

        double total = pedido.calcularTotal(100);
        System.out.println("Total após desconto: " + total);
    }
}
