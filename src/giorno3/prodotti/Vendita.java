package giorno3.prodotti;

public class Vendita {

    Prodotto spesa;
    int quantita;
    double venditatotale;


    public double getVenditatotale() {
        return venditatotale;
    }

    public void setVenditatotale(double venditatotale) {
        this.venditatotale = venditatotale;
    }

    public double esegui(Prodotto spesa, int quantita) {


        double totale;
        totale = spesa.getPrezzo() * quantita;
        if (spesa.getGenere() == "alimentare") {
            double sconto = totale * 0.05;
            totale = totale - sconto;
            venditatotale = venditatotale +totale;
            return totale;
        } else {
            venditatotale = venditatotale +totale;
            return totale;
        }




    }
}
