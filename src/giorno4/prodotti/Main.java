package giorno4.prodotti;

public class Main {
    public static void main(String[] args) {
        Pane pane = new Pane();
        Prodotto scottex = new Scottex();
        Prodotto pasta = new Pasta();
        Servizi service = new Servizi();
        Prodotto cartaig = new CartaIgenica();

        Vendita spesa1 = new Vendita();

        System.out.println(spesa1.esegui(pane, 10));
        System.out.println(spesa1.esegui(scottex, 5));

        System.out.println(spesa1.getVenditaTotale());

        Vendita spesa2 = new Vendita();
        spesa2.esegui(cartaig, 12);
        System.out.println(spesa2.getVenditaTotale());
        service.consegnaDomicilio(spesa2);
        System.out.println(spesa2.getVenditaTotale());
        service.spesaOnline(spesa2);
        System.out.println(spesa2.getVenditaTotale());

        Vendita spesa3 = new Vendita();
        spesa3.esegui(cartaig,20);
        spesa3.esegui(pane,2);
        System.out.println(spesa3.getVenditaTotale());
        service.consegnaDomicilio(spesa3);
        System.out.println(spesa3.getVenditaTotale());





    }
}
