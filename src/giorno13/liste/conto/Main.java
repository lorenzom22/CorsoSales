package giorno13.liste.conto;

public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona("Luca Rossi","LCRSSC22");

        Conto conto1 = new Conto(p1,3000);




        conto1.deposita(100,conto1);
        conto1.preleva(400,conto1);
        conto1.preleva(1100,conto1);
        conto1.preleva(2800,conto1);
        conto1.deposita(40000,conto1);
        conto1.preleva(900,conto1);

        conto1.estrattoConto(conto1);

    }
}
