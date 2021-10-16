package giorno11.esercizi.teatroFinale;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teatro teatrop = new Teatro("Teatro Massimo",0);



        Persona p1 = new Persona("Marco", "1256");
        Persona p2 = new Persona("Luca", "4231");
        Persona p3 = new Persona("Anna", "2314");
        Persona p4 = new Persona("Giovanni", "2131");
        Persona p5 = new Persona("Marta", "2356");
        Persona p6 = new Persona("Sara", "9832");
        Persona p7 = new Persona("Simone", "6452");
        Persona p8 = new Persona("Paolo", "2314");
        Persona p9 = new Persona("Maria", "5434");
        Persona p10 = new Persona("Davide", "2315");

        List<Persona> f1 = new ArrayList<>();

        f1.add(p1);
        f1.add(p2);

        List<Persona> f2 = new ArrayList<>();

        f2.add(p4);
        f2.add(p5);
        f2.add(p6);





       Prenotazione prenotazione1 =teatrop.creaPrenotazione(f1,teatrop);

        System.out.println(teatrop.getPostiOccupati());

        teatrop.aggiungiAPrenotazione(prenotazione1,teatrop,p3);

        Prenotazione prenotazione2 =teatrop.creaPrenotazione(f2,teatrop);

        System.out.println(teatrop.getPostiOccupati());

        teatrop.RimuoviDaPrenotazione(prenotazione2,teatrop,p5);

        System.out.println(teatrop.getPostiOccupati());

        teatrop.stampaPrenotazioni();

        Prenotazione prenotazione3 =teatrop.creaPrenotazione(f2,teatrop);
        System.out.println(teatrop.getPostiOccupati());

        Prenotazione prenotazione4 =teatrop.creaPrenotazione(f2,teatrop);












    }
}
