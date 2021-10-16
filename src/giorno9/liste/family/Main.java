package giorno9.liste.family;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona("marco", "rossi", "rssmrc", 'm');
        Persona p2 = new Persona("luca", "rossi", "rsslca", 'm');
        Persona p3 = new Persona("giovanni", "rossi", "rssgvn", 'm');
        Persona p4 = new Persona("giorgio", "rossi", "rssgrg", 'm');
        Persona p5 = new Persona("giulia", "rossi", "rssgla", 'f');
        Persona p6 = new Persona("anna", "rossi", "rssnna", 'f');
        Persona p7 = new Persona("sara", "rossi", "rsssra", 'f');
        Persona p8 = new Persona("camilla", "rossi", "rsscml", 'f');

        Famiglia f1 = new Famiglia();
        Famiglia f2 = new Famiglia();
        Famiglia f3 = new Famiglia();
        Famiglia f4 = new Famiglia();


        List<Persona> popolazione = new ArrayList<Persona>();
        List<Famiglia> listaFamiglie = new ArrayList<Famiglia>();

        popolazione.add(p1);
        popolazione.add(p5);
        popolazione.add(p2);
        popolazione.add(p6);
        popolazione.add(p3);
        popolazione.add(p7);
        popolazione.add(p4);
        popolazione.add(p8);


        stampaPopolazione(popolazione);


        Iterator<Persona> pIterator = popolazione.iterator();
        Iterator<Famiglia> fIterator = listaFamiglie.iterator();

        Persona marito = null;
        Persona moglie = null;

        while (pIterator.hasNext()) {
            Persona a = pIterator.next();

            if (a.getGenere() == 'm') {
                marito = a;
                pIterator.remove();
            } else {
                moglie = a;
                pIterator.remove();
            }

            if (marito != null && moglie != null) {
                Famiglia famiglia = new Famiglia();
                famiglia.setMoglie(moglie);
                famiglia.setMarito(marito);
                listaFamiglie.add(famiglia);
                marito = null;
                moglie = null;

            }

        }

        stampaFamiglie(listaFamiglie);
        stampaPopolazione(popolazione);


    }

    public static void stampaPopolazione(List<Persona> popolazione) {
        for (Persona persona : popolazione) {
            System.out.println(persona);
        }
    }

    public static void stampaFamiglie(List<Famiglia> listaFamiglie) {
        for (Famiglia famiglia : listaFamiglie) {
            System.out.println(famiglia.getMarito() + " sposato con " + famiglia.getMoglie());
        }
    }
}
