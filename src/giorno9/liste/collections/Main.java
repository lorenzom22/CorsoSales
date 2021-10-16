package giorno9.liste.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Macchina> listaMacchine = new ArrayList<>();

        Macchina auto1 = new Macchina("fiat", 2002);
        Macchina auto2 = new Macchina("ferrari", 2002);
        Macchina auto3 = new Macchina("nissan", 2003);
        Macchina auto4 = new Macchina("skoda", 2005);
        Macchina auto5 = new Macchina("audi", 2005);

        listaMacchine.add(auto1);
        listaMacchine.add(auto2);
        listaMacchine.add(auto3);
        listaMacchine.add(auto4);
        listaMacchine.add(auto5);

        for (Macchina automobile : listaMacchine) {
        if ( automobile.getAnno()==2005 ){
            System.out.println("Il modello della macchina è "+automobile.getModello());}
        }
    }
}
