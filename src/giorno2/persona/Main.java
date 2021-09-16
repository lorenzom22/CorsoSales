package giorno2.persona;

public class Main {
    public static void main(String[] args) {
        Persona tipo = new Persona("luca","rossi");
        System.out.println(tipo.getNome()+" "+tipo.getCognome());
    }
}
