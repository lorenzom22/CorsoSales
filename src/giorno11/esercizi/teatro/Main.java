package giorno11.esercizi.teatro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        Persona p1 = new Persona("marco", "aadasda");
        Persona p2 = new Persona("luca", "aasdadf");
        Persona p3 = new Persona("simone", "aasda");
        Persona p4 = new Persona("anna", "aadd");
        Persona p5 = new Persona("marta", "aassd");
        Persona p6 = new Persona("garbiele", "aass");
        Persona p7 = new Persona("giovanni", "aaww");

        List<Persona> componenti = new ArrayList<>();
        List<Persona> prenotazioni = new ArrayList<>();

        int contaPrenot = 1;

        componenti.add(p1);
        componenti.add(p2);
        componenti.add(p3);

        stampaComponenti(componenti);

        creaPrenotazione(componenti, prenotazioni);

        stampaPrenotati(prenotazioni);

        componenti.add(p4);
        componenti.add(p7);
        componenti.add(p5);
        componenti.add(p6);

        creaPrenotazione(componenti, prenotazioni);

        componenti.add(p4);
        componenti.add(p7);
        componenti.add(p5);
        componenti.add(p6);

        creaPrenotazione(componenti, prenotazioni);




    }

    public static void creaPrenotazione(List<Persona> famiglia, List<Persona> prenotazioni) {

        while (famiglia.size() > 0) {
            Iterator<Persona> famigliaIterator = famiglia.listIterator();

            int code = ThreadLocalRandom.current().nextInt(200, 400 + 1);


            if (prenotazioni.size() < 10) {
                Persona p = famigliaIterator.next();
                prenotazioni.add(p);
                famigliaIterator.remove();
                System.out.println(p.getNome() + " Prenotato");

            } else {
                System.out.println("Impossibile prenotare "+famigliaIterator.next().getNome()+", posti terminati");

                break;
            }


        }
        System.out.println("Posti rimanteni " + (10 - prenotazioni.size()));

    }

    public static void rimuoviPrenotazione(Prenotazione famiglia,List<Persona> prenotazione,Persona per){
        if (famiglia.getComponenti().contains(per)){
            famiglia.getComponenti().remove(per);
            prenotazione.remove(per);
        }

    }

    public static void stampaComponenti(List<Persona> componenti) {
        for (Persona p : componenti) {
            System.out.println("Nome " + p.getNome());
        }
    }

    public static void stampaPrenotati(List<Persona> prenotazioni) {
        for (Persona p : prenotazioni) {
            System.out.println("Prenotato a nome " + p.getNome());
        }
    }
}
