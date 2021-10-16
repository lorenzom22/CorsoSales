package giorno7.cifratura2;

public class Main {
    public static void main(String[] args) {


        cifratura prova = new cifratura();
        System.out.println(prova.codifica('z',2));

        char[] cane = new char[4];
        int[] chiaveProva = new int[4];

        cane[0]='c';
        cane[1]='a';
        cane[2]='n';
        cane[3]='e';

        chiaveProva[0]=1;
        chiaveProva[1]=2;
        chiaveProva[2]=3;
        chiaveProva[3]=4;
        for(char elemento : prova.cifraParola(cane,chiaveProva) ){
            System.out.println(elemento);
        }





    }
}
