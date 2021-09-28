package giorno5.prodottifinale.vendite;

import giorno5.prodottifinale.Prodotto;

public class VenditaADomicilio extends Vendita {


    public void esegui(Prodotto prodotto, int qta) {
        float valore = prodotto.calcolaPrezzoVendita(qta);
        Float costoConsegna = null;
        if (costoConsegna == null)
            costoConsegna = maggiorazioneBaseConsegna(valore);
        valore = costoConsegna + valore;
        if (costoConsegna == null)
            costoConsegna = scontoBaseConsegna(valore);
        valore = valore - costoConsegna;
        if (costoConsegna == null)
            costoConsegna = scontoMaxiConsegna(valore);
        valore = valore - costoConsegna;
        if (costoConsegna == null)
            costoConsegna = 0f;

        super.setTotaleComplessivoVendite(getTotaleComplessivoVendite() + (valore + costoConsegna));
        System.out.println("--- vendita di " + prodotto.getNome() + " qta = " + qta + " al p.unitario = "
                + prodotto.getPrezzoUnitario() + " con sconto = " + prodotto.getScontoPercentuale() + "% = " + valore +
                " applicato tassa consegna");
    }

    private Float maggiorazioneBaseConsegna(float valore) {
        Float result = null;
        if (valore < 50.0) {
            result = valore * 3 / 100;
        }
        return result;
    }

    private Float scontoBaseConsegna(float valore) {
        Float result = null;
        if (valore == 100.0) {
            result = valore * 3 / 100;
        }
        return result;
    }

    private Float scontoMaxiConsegna(float valore) {
        Float result = null;
        if (valore > 100.0) {

            // torna un numero negativo per favorire la somma algebrica con il valore del prodotto.
            result = valore * 6 / 100;
        }
        return result;
    }
}
