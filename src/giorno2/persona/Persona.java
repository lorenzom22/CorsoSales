package giorno2.persona;

public class Persona {


    private String nome;
    private String cognome;
    private String cf;
    private int eta;




    public Persona(String nome, String cognome){
        this.nome=nome;
        this.cognome=cognome;
    }
//overloading
    public Persona(String nome, String cognome, String cf){
        this.nome=nome;
        this.cognome=cognome;
        this.cf=cf;
    }
//overloading possibile ma tipi di variabili diversi
    public Persona(String nome, int eta){
        this.nome=nome;
        this.eta=eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

}
