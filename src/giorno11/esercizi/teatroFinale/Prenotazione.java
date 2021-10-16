package giorno11.esercizi.teatroFinale;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Prenotazione {
    private int codice;
    private List<Persona> famiglia;



    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public List<Persona> getFamiglia() {
        return famiglia;
    }

    public void setFamiglia(List<Persona> famiglia) {
        this.famiglia = famiglia;
    }



    public void stampaFamiglia(){
        for(Persona p: this.famiglia){
            System.out.println("Nome "+p.getNome());

        }
    }
}
