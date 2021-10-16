package giorno9.liste.macchina;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Macchina m1 = new Macchina("audi",2002);
        Macchina m2 = new Macchina("bmw",2002);
        Macchina m3 = new Macchina("skoda",2003);
        Macchina m4 = new Macchina("nissan",2004);

        List<Macchina> listaMacchine = new ArrayList<>();

        listaMacchine.add(new Macchina("ferrari",2002));
        listaMacchine.add(m1);
        listaMacchine.add(m2);
        listaMacchine.add(m3);
        listaMacchine.add(m4);

        for (Macchina macchina : listaMacchine){
            System.out.println(macchina);
        }

        Iterator<Macchina> macchIter =listaMacchine.iterator();
        while(macchIter.hasNext()){
            if (macchIter.next().getAnno()==2002){
                macchIter.remove();
            }
        }

        for (Macchina macch:listaMacchine){
            System.out.println("Auto "+macch.getNome()+" anno "+macch.getAnno());
        }







    }
}
