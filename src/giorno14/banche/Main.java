package giorno14.banche;

public class Main {
    public static void main(String[] args) {

        Cliente p1 = new Cliente("Marco Rossi","RSSMRCC22");
        Cliente p2 = new Cliente("Luca Simone","SMNLC321");
        Cliente p3 = new Cliente("Giorgio Neri","NERGRG6372");

        Banca b1 = new Banca("BNL",500);

        b1.aperturaConto(p1,300);
        b1.aperturaConto(p2,5000);
        b1.aperturaConto(p3,500);
        b1.aperturaConto(p1,503);

        Banca b2 = new Banca("Unicredit", 300);

        b2.aperturaConto(p2,600);
        b2.aperturaConto(p1,100);

        b2.prelievo(p1,222);
        b2.estrattoConto(p1);

        System.out.println(Banca.getContiAttivi());






    }
}
