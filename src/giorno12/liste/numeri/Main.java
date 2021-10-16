package giorno12.liste.numeri;

import coloring.ColoringConsole;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<Integer> numeri = new ArrayList<>();

        numeri.add(6);
        numeri.add(230);
        numeri.add(6);
        numeri.add(33);
        numeri.add(44);
        numeri.add(92);
        numeri.add(230);
        numeri.add(6);
        numeri.add(13);


        sommaInteri(numeri);

        sommaPari(numeri);

        cercaMinimo(numeri);

        cercaMassimo(numeri);

        listaPari(numeri);

        stampaOccorrenze(numeri);


    }

    public static Integer sommaInteri(List<Integer> lista) {
        Integer totale = 0;
        for (Integer numero : lista) {
            totale += numero;
        }
        System.out.println(ColoringConsole.CYAN + "Il totale è " + totale);
        return totale;
    }

    public static Integer sommaPari(List<Integer> lista) {
        Integer totale = 0;
        for (Integer numero : lista) {
            if ((numero % 2) == 0) {
                totale += numero;
            }

        }
        System.out.println(ColoringConsole.BLUE + "Il totale dei numeri pari è " + totale);
        return totale;
    }

    public static Integer cercaMinimo(List<Integer> lista) {
        Integer minimo = 1000;
        for (Integer numero : lista) {
            if (minimo > numero) {
                minimo = numero;
            }
        }
        System.out.println(ColoringConsole.GREEN + "Il numero piu basso è " + minimo);
        return minimo;
    }


    public static Integer cercaMassimo(List<Integer> lista) {
        Integer massimo = 0;
        for (Integer numero : lista) {
            if (massimo < numero) {
                massimo = numero;
            }
        }
        System.out.println(ColoringConsole.PURPLE + "Il numero piu alto è " + massimo);
        return massimo;
    }


    public static List<Integer> listaPari(List<Integer> lista) {
        List<Integer> listaPari = new ArrayList<>();
        for (Integer numero : lista) {
            if ((numero % 2) == 0) {
                listaPari.add(numero);
            }

        }
        System.out.println(ColoringConsole.RED + "LISTA PARI");
        for (Integer numeroPari : listaPari) {
            System.out.print(ColoringConsole.RED + numeroPari + " ");
        }
        return listaPari;
    }

    public static void stampaOccorrenze(List<Integer> lista) {
        Map<Integer, Integer> mappa = new HashMap<>();
        for (Integer numero : lista) {
            Integer occorrenza = mappa.get(numero);
            if (occorrenza == null) {
                occorrenza = 1;
            } else {
                occorrenza += 1;
            }
            mappa.put(numero, occorrenza);
        }
        System.out.println();

        for (Map.Entry<Integer, Integer> numero : mappa.entrySet()) {
            System.out.println(ColoringConsole.GREEN+"Trovato il numero " + numero.getKey() + " -> " + numero.getValue() + " volte ");
        }
    }


}
