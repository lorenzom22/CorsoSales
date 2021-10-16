package giorno10.esercizi.cliente;

public class Vendita {
    private Prodotto prodotto;
    private Cliente cliente;
    private int quantita;

    public Vendita(Prodotto prod,Cliente cliente,int quantita){
        this.cliente =cliente;
        this.prodotto = prod;
        this.quantita =quantita;
    }

    public Prodotto getProdotto() {
        return prodotto;
    }

    public void setProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }
}
