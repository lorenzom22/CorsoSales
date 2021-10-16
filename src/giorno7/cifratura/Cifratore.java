package giorno7.cifratura;

public class Cifratore {

    private char[] parolaCifrata;


    public int posizioneAlfabeto(char lettera) {
        return Character.toUpperCase(lettera) - 64;
    }

    public char posizioneLettera(int posizione) {
        char lettera = (char) (posizione + 64);
        return lettera;
    }


    public void cifra(char[] parolaDaCifrare, int[] chiaveCifratura) {

        parolaCifrata = new char[parolaCifrata.length];

        for (int i = 0; i < parolaDaCifrare.length; i++) {
            for (int c = 0; i < chiaveCifratura.length; i++) {
                int nuovoIndice = this.posizioneAlfabeto(parolaDaCifrare[i]) + chiaveCifratura[c];
                parolaCifrata[i] = this.posizioneLettera(nuovoIndice);
            }

        }


    }
}
