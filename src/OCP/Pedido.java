package OCP;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Desconto> descontos = new ArrayList<>();

    public void addDesconto(Desconto desconto) {
        descontos.add(desconto);
    }

    public double calcularTotal(double valor) {
        double total = valor;
        for (Desconto desconto : descontos) {
            total -= desconto.calcularDesconto(total);
        }
        return total;
    }
}
