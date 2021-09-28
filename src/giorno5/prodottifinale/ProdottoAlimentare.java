package giorno5.prodottifinale;

public class ProdottoAlimentare extends Prodotto{

    public ProdottoAlimentare(String codice, String nome, int prezzoUnitario) {
        super(codice, nome, prezzoUnitario);
        super.setScontoPercentuale(10);
    }
}   
