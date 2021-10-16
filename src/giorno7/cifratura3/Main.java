package giorno7.cifratura3;

import giorno7.cifratura.Cifratore;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CIfratura prova1 = new CIfratura();

       Scanner s = new Scanner(System.in);

       System.out.println("inserisci caratteri");
       char[] a = s.next().toCharArray();
        prova1.cifra(a);


        //char[] dog = {'C', 'i', 'a', 'o'};

        //char[] dog2 = {'J','u','n','g','l','e','r'};


        //prova1.cifra(dog);

        //prova1.cifra(dog2);

    }
}
