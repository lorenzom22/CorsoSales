package giorno10.esercizi.cliente;

public class Prodotto {
    private String nome;
    private String codice;

    public Prodotto(String nome, String codice){
        this.nome = nome;
        this.codice = codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }
}
