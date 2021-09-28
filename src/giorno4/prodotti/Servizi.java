package giorno4.prodotti;

public class Servizi {

    public void consegnaDomicilio(Vendita spesa1) {
        spesa1.setOnlineFlag(true);
        double spesaTotale = spesa1.getVenditaTotale();
        double scontoDomicilio = spesaTotale * 0.03;
        if (spesaTotale < 50) {
            spesaTotale = spesaTotale + scontoDomicilio;
            spesa1.setVenditaTotale(spesaTotale);

        } else if (spesaTotale > 50 && spesaTotale < 100) {
            spesa1.setVenditaTotale(spesaTotale);

        } else {
            spesaTotale = spesaTotale - scontoDomicilio;
            spesa1.setVenditaTotale(spesaTotale);

        }

    }

    public void spesaOnline(Vendita spesa1) {
        spesa1.setOnlineFlag(true);
        double sovraprezzoOnline = spesa1.getVenditaTotale() * 0.03;
        spesa1.setVenditaTotale(spesa1.getVenditaTotale() + sovraprezzoOnline);


    }


}
