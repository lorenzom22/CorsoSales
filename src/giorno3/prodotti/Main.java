package giorno3.prodotti;

public class Main {
    public static void main(String[] args) {

        Prodotto pane = new Pane();
        Prodotto detersivo = new Detersivo();
        Prodotto prosciutto = new Prosciutto();
        Prodotto scottex = new Scottex();

        Vendita spesa1 = new Vendita();

        double totalepane = spesa1.esegui(pane, 4);
        //System.out.println(totalepane);

        double totaledetersivi = spesa1.esegui(detersivo, 12);
        //System.out.println(totaledetersivi);

        Vendita spesa2 = new Vendita();

        double totalecot = spesa2.esegui(scottex,3);
        System.out.println(totalecot);
        double totalepros = spesa2.esegui(prosciutto,5);
        System.out.println(totalepros);
        System.out.println(spesa2.getVenditatotale());
    }
}
