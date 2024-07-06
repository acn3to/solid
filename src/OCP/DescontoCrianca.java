package OCP;

public class DescontoCrianca implements Desconto{
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.10;
    }
}
