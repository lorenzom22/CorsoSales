package giorno9.liste.capoluoghi;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Citta, Regione> mappaCapoloughi = new HashMap<Citta, Regione>();

        Regione Lazio = new Regione("Lazio");
        Regione Lombardia = new Regione("Lombardia");
        Regione Campania = new Regione("Campania");
        Regione Piemonte = new Regione("Piemonte");
        Regione Sicilia = new Regione("Sicilia");
        Regione Emilia = new Regione("Emilia");

        Citta Roma = new Citta("Roma");
        Citta Milano = new Citta("Milano");
        Citta Napoli = new Citta("Napoli");
        Citta Torino = new Citta("Torino");
        Citta Palermo = new Citta("Palermo");
        Citta Bologna = new Citta("Bologna");

        mappaCapoloughi.put(Roma, Lazio);
        mappaCapoloughi.put(Milano, Lombardia);
        mappaCapoloughi.put(Napoli, Campania);
        mappaCapoloughi.put(Torino, Piemonte);
        mappaCapoloughi.put(Palermo, Sicilia);
        mappaCapoloughi.put(Bologna, Emilia);

        for (Map.Entry<Citta, Regione> luogo : mappaCapoloughi.entrySet()) {
            System.out.println(luogo.getKey().getNome() + " CAPOLUOGO DI " + luogo.getValue().getNome());
        }


    }
}
