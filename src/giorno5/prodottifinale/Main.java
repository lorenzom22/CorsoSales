package giorno5.prodottifinale;

import giorno5.prodottifinale.vendite.Vendita;
import giorno5.prodottifinale.vendite.VenditaADomicilio;
import giorno5.prodottifinale.vendite.VenditaOnline;

public class Main {

    public static void main(String[] args) {

        Prodotto pane = new ProdottoAlimentare("PAN","panebianco",1);
        Prodotto uova = new ProdottoAlimentare("UOV","uova",3);
        Prodotto scottex = new ProdottoNonAlimentare("SCOT","scottex",5);

        Vendita spesa12 = new VenditaOnline();
        spesa12.esegui(pane,50);
        spesa12.esegui(uova,10);
        System.out.println(spesa12.getTotaleComplessivoVendite());


        Vendita spesa3 = new VenditaADomicilio();
        spesa3.esegui(scottex,5);








    }
}
