package giorno5.prodottifinale.vendite;

import giorno5.prodottifinale.Prodotto;

public abstract class Vendita {

    private float totaleComplessivoVendite;

    abstract public void esegui(Prodotto prodotto, int qta);

    public float getTotaleComplessivoVendite() {
        return totaleComplessivoVendite;
    }

    protected void setTotaleComplessivoVendite(float totaleComplessivoVendite) {
        this.totaleComplessivoVendite = totaleComplessivoVendite;
    }
}
