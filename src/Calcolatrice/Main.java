package Calcolatrice;



public class Main {
    public static void main(String[] args) {

        Operazione somma = new Addizione();

        System.out.println(somma.calcola(5,3));

        Sottrazione prova = new Sottrazione();

        System.out.println(prova.calcola(8,4));

        Operazione prova2 = new Divisione();

        System.out.println(prova2.calcola(10,2));

    }
}