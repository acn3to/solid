package DIP;

public class PayPal implements FormaPagamento{
    @Override
    public void pagar(double amount) {
        System.out.println("Pagamento via PayPal de R$ " + amount);
    }
}
