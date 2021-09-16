package giorno2.saluti;

public class Main {
    public static void main(String[] args) {

        Saluto prova = new SalutoInglese();
        System.out.println(prova.salutare());

        Saluto prova2 = new SalutoFrancese();
        System.out.println(prova2.salutare());

        Saluto prova3 = new SalutoSpagnolo();
        System.out.println(prova3.salutare());


    }
}
