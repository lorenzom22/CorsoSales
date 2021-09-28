package giorno5.prodottifinale.vendite;

import giorno5.prodottifinale.Prodotto;

public class VenditaOnline extends Vendita{

    public void esegui(Prodotto prodotto, int qta) {
        float valore = prodotto.calcolaPrezzoVendita(qta);
        float percentualeOnline = 3;

        float sovraprezzoOnline = valore*percentualeOnline/100;
        valore = valore +sovraprezzoOnline;



        super.setTotaleComplessivoVendite(getTotaleComplessivoVendite() + valore);
        System.out.println("--- vendita di " + prodotto.getNome() + " qta = " + qta + " al p.unitario = "
                + prodotto.getPrezzoUnitario() + " con sconto = " + prodotto.getScontoPercentuale() + "% apllicando il sovraprezzo online "
    + percentualeOnline+ " % totale =" +valore);}

}
