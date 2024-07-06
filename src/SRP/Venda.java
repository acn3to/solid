package SRP;

public class Venda {
    private int id;
    private String produto;
    private double valor;

    public Venda(int id, String produto, double valor) {
        this.id = id;
        this.produto = produto;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + getId() +
                ", produto='" + getProduto() + '\'' +
                ", valor=" + getValor() +
                '}';
    }
}
