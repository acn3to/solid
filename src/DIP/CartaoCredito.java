package DIP;

public class CartaoCredito implements FormaPagamento{
    @Override
    public void pagar(double amount) {
        System.out.println("Pagamento via Cartão de Crédito de R$ " + amount);
    }
}
