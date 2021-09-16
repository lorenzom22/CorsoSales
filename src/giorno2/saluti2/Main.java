package giorno2.saluti2;

public class Main {
    public static void main(String[] args) {

        Lingua provaF = new Francese();
        Lingua provaI = new Italiano();
        Lingua provaS = new Spagnolo();
        Saluto prova2 = new Saluto(provaF);
        Saluto prova3 = new Saluto(provaI);
        Saluto prova4 = new Saluto(provaS);

        System.out.println(prova2.getNome()+" "+prova2.getLinguaFinale());
        System.out.println(prova3.getNome()+" "+prova3.getLinguaFinale());
        System.out.println(prova4.getNome()+" "+prova4.getLinguaFinale());

    }
}
