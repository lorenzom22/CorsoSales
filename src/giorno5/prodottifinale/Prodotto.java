package giorno5.prodottifinale;

abstract public class Prodotto {


    private String codice;
    private String nome;
    private float prezzoUnitario;
    private float scontoPercentuale;

    public Prodotto(String codice, String nome, float prezzoUnitario) {
        this.codice = codice;
        this.nome = nome;
        this.prezzoUnitario = prezzoUnitario;
    }

    public float calcolaPrezzoVendita(int qta) {
        float prezzoUnitarioNetto = this.prezzoUnitario - ((this.prezzoUnitario * scontoPercentuale) / 100);
        return prezzoUnitarioNetto * qta;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrezzoUnitario() {
        return prezzoUnitario;
    }

    public void setPrezzoUnitario(float prezzoUnitario) {
        this.prezzoUnitario = prezzoUnitario;
    }

    public float getScontoPercentuale() {
        return scontoPercentuale;
    }

    public void setScontoPercentuale(float scontoPercentuale) {
        this.scontoPercentuale = scontoPercentuale;
    }
}
