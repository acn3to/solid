package ISP;

public class OverPowerImpressoraJiraya implements Impressora, Scanner, Fax{
    @Override
    public void imprimirDocumento(String documento) {
        System.out.println("Imprimindo " + documento + " na impressora Jiraya.");
    }

    @Override
    public void escaneiarDocumento(String documento) {
        System.out.println("Escaneando " + documento + " na impressora Jiraya.");
    }

    @Override
    public void faxearDocumento(String documento) {
        System.out.println("Faxando " + documento + " na impressora Jiraya.");
    }
}
