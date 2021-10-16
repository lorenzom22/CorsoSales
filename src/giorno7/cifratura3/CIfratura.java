package giorno7.cifratura3;



import java.util.Arrays;
import java.util.Scanner;

public class CIfratura {

    Scanner s = new Scanner(System.in);

    public int[] chiaveCifratura;
    public char[] parolaCifrata;


    public char[] cifra(char[] parolaDaCifrare) {


        System.out.println("La parola da cifrare è " + Arrays.toString(parolaDaCifrare));


        chiaveCifratura = new int[6];
        chiaveCifratura[0] = 1;
        chiaveCifratura[1] = 3;
        chiaveCifratura[2] = 5;
        chiaveCifratura[3] = 4;
        chiaveCifratura[4] = 2;
        chiaveCifratura[5] = 7;

        parolaCifrata = new char[parolaDaCifrare.length];

        if (parolaDaCifrare.length > chiaveCifratura.length) {
            int c = 0;
            for (int i = 0; i < parolaDaCifrare.length; i++) {
                parolaCifrata[i] = this.cifraLettere(parolaDaCifrare[i], chiaveCifratura[c]);
                c++;
                if (c > (chiaveCifratura.length-1)) {
                    c = 0;
                }
            }
            System.out.println("La parola cifrata è " + Arrays.toString(parolaCifrata));
            System.out.println("Con chiave " + Arrays.toString(chiaveCifratura));
            return parolaCifrata;
        }
        else {

            for (int i = 0; i < parolaDaCifrare.length; i++) {
                parolaCifrata[i] = this.cifraLettere(parolaDaCifrare[i], chiaveCifratura[i]);
            }
            System.out.println("La parola cifrata è " + Arrays.toString(parolaCifrata));
            System.out.println("Con chiave "+ Arrays.toString(chiaveCifratura));

            return parolaCifrata;

        }

    }

    public char cifraLettere(char lettera, int indice) {
        char letteraCifrata;
        if (Character.isUpperCase(lettera)) {
            lettera = Character.toLowerCase(lettera);
            letteraCifrata = (char) (((int) lettera + indice - 97) % 26 + 97);
            letteraCifrata = Character.toUpperCase(letteraCifrata);
            return letteraCifrata;
        }
        letteraCifrata = (char) (((int) lettera + indice - 97) % 26 + 97);
        return letteraCifrata;

    }

}
