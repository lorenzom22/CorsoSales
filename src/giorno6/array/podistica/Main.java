package giorno6.array.podistica;

public class Main {
    public static void main(String[] args) {

        Atleta prova = new Atleta("marco", "rossi", "rssmrc", "marcomail");
        Atleta prova2 = new Atleta("luca", "rossi", "rsslc", "lucamail");
        Atleta prova3 = new Atleta("giorgio", "simone", "smngrg", "giorgiomail");
        Atleta prova4 = new Atleta("giorgia", "mauro", "grgmr", "giorgiamail");
        Gara garaProva = new Gara("maratona", 50);


        garaProva.iscrizioneGara(prova);
        garaProva.iscrizioneGara(prova2);
        garaProva.iscrizioneGara(prova3);
        garaProva.iscrizioneGara(prova4);

        garaProva.stampaRegistro();

        garaProva.cancellaIscrizione(prova3);

        garaProva.stampaRegistro();

        garaProva.iscrizioneGara(prova3);
        garaProva.iscrizioneGara(prova4);
        garaProva.iscrizioneGara(null);

        garaProva.stampaRegistro();
    }
}
