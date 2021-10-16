package giorno10.esercizi.libri;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String,Libro> mappa = new HashMap<>();

        Libro libro1 = new Libro("prova1","marco rossi","12-1222-3324");
        Libro libro2 = new Libro("prova2","luca rossi","12-1242-3324");
        Libro libro3 = new Libro("prova3","giovanni rossi","14-1222-3324");
        Libro libro4 = new Libro("prova4","marco rossi","12-6822-3324");
        Libro libro5 = new Libro("prova5","anna rossi","12-1362-3324");

        mappa.put(libro1.getIsbn(),libro1);
        mappa.put(libro2.getIsbn(),libro2);
        mappa.put(libro3.getIsbn(),libro3);
        mappa.put(libro4.getIsbn(),libro4);
        mappa.put(libro5.getIsbn(),libro5);

        stampaMappaOrizz(mappa);
        stampaMappa(mappa);





    }


    public static void stampaMappaOrizz(Map<String,Libro> mappa){
        for ( Map.Entry<String,Libro> libro : mappa.entrySet()){
            System.out.println("libro con titolo "+libro.getValue().getTitolo()+" con chiave "+libro.getKey());
        }
    }

    public static void stampaMappa(Map<String,Libro> mappa){
        for(String chiave :mappa.keySet()){
            System.out.println("libro con titolo "+mappa.get(chiave).getTitolo());
        }
    }
}
