package giorno9.liste.macchina2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Macchina> macchine= new ArrayList<>();
        macchine.add(new Macchina("Fiat 500", 2001, new Motore(500)));
        macchine.add(new Macchina("Fiesta 505", 2001, new Motore(500)));
        macchine.add(new Macchina("Ferrari GT", 2005, new Motore(1400)));
        macchine.add(new Macchina("Yaris I", 2005, new Motore(1400)));
        macchine.add(new Macchina("Punto X", 2005, new Motore(500)));

        for ( Macchina mach : macchine){
            if ( mach.getCilindrata().getCilindrata()==1400){
                System.out.println("auto "+mach.getNome()+" anno "+mach.getAnno());
            }
        }



    }
}
