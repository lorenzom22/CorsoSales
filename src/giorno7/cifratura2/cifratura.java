package giorno7.cifratura2;

public class cifratura {

    public char codifica(char lettera, int posizioneAlfa){
        char nuovaLettera;
        int posizione;
        if ( posizioneAlfa == 0 ){
            nuovaLettera = lettera;
        }
        char letteraMinuscola = Character.toLowerCase(lettera);
        posizione  =(int)letteraMinuscola;
        posizione = posizione+posizioneAlfa;
        nuovaLettera =(char)posizione;
        return nuovaLettera;
    }


    public char[] cifraParola(char[] parolaDaCifrare, int[] chiave){

        char[] parolaCifrata = new char[parolaDaCifrare.length];
        for(int i = 0; i< parolaDaCifrare.length; i++){
            parolaCifrata[i]= this.codifica(parolaDaCifrare[i],chiave[i]);
        }return parolaCifrata;
    }
}
