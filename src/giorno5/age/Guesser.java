package giorno5.age;

import java.util.Scanner;

public class Guesser {

    Scanner input = new Scanner(System.in);

    public void guess(Persona persona) {

        System.out.println("Prova ad indovinare l'eta di "+persona.getNome());
        int eta = persona.getEta();
       /* System.out.println("Inserisci la data");
        int prova1 = input.nextInt();
        if (prova1 == persona.getEta()) {
            System.out.println("bravo hai indovinato");
        } else {
            System.out.println("peccato,2 tentativi rimasti, riprova");
            int prova2 = input.nextInt();
            if (prova2 == persona.getEta()) {
                System.out.println("bravo hai indovinato");
            } else {
                System.out.println("ultimo tentativo,riprova");
                int prova3 = input.nextInt();
                if (prova3 == persona.getEta()) {
                    System.out.println("bravo hai indovinato");
                } else {
                    System.out.println("hai perso,la data corretta era " + persona.getEta());
                }
            }
        }

    }*/

        for (int i = 0; i < 5; i++) {
            System.out.println("inserisci un numero");
            int numero = input.nextInt();
            if (numero == eta) {
                System.out.println("hai indovinato");
                break;
            }
            if (numero > eta) {
                System.out.println("l'eta è inferiore , riprova");

            } else {
                System.out.println("l'eta è superiore , riprova");

            }
            System.out.println("tentativi rimasti " + (5 - i - 1) + "");
            if(i == 4){
                System.out.println("Peccato hai perso!");
                System.out.println(persona.getNome()+" ha "+persona.getEta()+" anni");
            }
        }

    }
}
