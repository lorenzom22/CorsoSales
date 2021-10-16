package giorno11.esercizi.teatroFinale;

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Teatro {

    final int POSTI_MASSIMI = 10;

    private String nome;
    private List<Prenotazione> prenotazioni;
    private int postiOccupati;


    public Teatro(String nome, int postiOccupati) {
        this.nome = nome;
        this.postiOccupati = postiOccupati;
        this.prenotazioni = new ArrayList<Prenotazione>();


    }

    public int getPOSTI_MASSIMI() {
        return POSTI_MASSIMI;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Prenotazione> getPrenotazioni() {
        return prenotazioni;
    }

    public void setPrenotazioni(List<Prenotazione> prenotazioni) {
        this.prenotazioni = prenotazioni;
    }

    public int getPostiOccupati() {
        return postiOccupati;
    }

    public void setPostiOccupati(int postiOccupati) {
        this.postiOccupati = postiOccupati;
    }

    public static Prenotazione creaPrenotazione(List<Persona> gruppo, Teatro teatro) {

        List<Prenotazione> prenotazioni = teatro.getPrenotazioni();
        Iterator<Persona> fIterator = gruppo.iterator();
        int code = ThreadLocalRandom.current().nextInt(200, 400 + 1);
        List<Persona> famigliaP = new ArrayList<>();

        while (fIterator.hasNext()) {
            if (gruppo.size() < teatro.POSTI_MASSIMI-teatro.getPostiOccupati()) {
                Persona p = fIterator.next();
                famigliaP.add(p);
                teatro.setPostiOccupati(teatro.getPostiOccupati() + 1);
            } else {
                System.out.println("Impossbile prenotare , posti insufficenti");
                break;
            }
        }

        Prenotazione prenot = new Prenotazione();
        prenot.setFamiglia(famigliaP);
        prenot.setCodice(code);
        System.out.println("Prenotazione effetuata con codice " + prenot.getCodice());
        prenot.stampaFamiglia();
        prenotazioni.add(prenot);
        teatro.setPrenotazioni(prenotazioni);
        return prenot;
    }

    public void RimuoviDaPrenotazione(Prenotazione pre,Teatro teatro,Persona p){
        if (pre.getFamiglia().contains(p)){
            pre.getFamiglia().remove(p);
            teatro.setPostiOccupati(teatro.getPostiOccupati()-1);
            System.out.println(p.getNome()+" rimosso da prenotazione con codice "+pre.getCodice());
        }
    }

    public void aggiungiAPrenotazione(Prenotazione pre,Teatro teatro,Persona p){
        List<Persona> famigliaModificata = pre.getFamiglia();
        famigliaModificata.add(p);
        teatro.setPostiOccupati(teatro.getPostiOccupati()+1);
        System.out.println(p.getNome()+" aggiunto alla prenotazione con codice "+pre.getCodice());

    }


    public void stampaPrenotazioni(){
        for (Prenotazione pren : this.getPrenotazioni()){
            System.out.println("Prenotazione con codice "+pren.getCodice());
        }
    }


}
