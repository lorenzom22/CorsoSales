package giorno5.age;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         Persona marco = new Persona("Marco");
        System.out.println(marco.getEta());
         Guesser guess = new Guesser();
         guess.guess(marco);

    }

}
