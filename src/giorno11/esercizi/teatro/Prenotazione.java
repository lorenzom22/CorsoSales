package giorno11.esercizi.teatro;

import java.util.List;

public class Prenotazione {

    private List<Persona> componenti;
    private int codiceP;

    public Prenotazione(int codicep,List<Persona> famiglia){
        this.codiceP = codicep;
        this.componenti = famiglia;
    }


    public List<Persona> getComponenti() {
        return componenti;
    }

    public void setComponenti(List<Persona> componenti) {
        this.componenti = componenti;
    }

    public int getCodiceP() {
        return codiceP;
    }

    public void setCodiceP(int codiceP) {
        this.codiceP = codiceP;
    }
}
