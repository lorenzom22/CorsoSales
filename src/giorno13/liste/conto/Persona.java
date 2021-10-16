package giorno13.liste.conto;

public class Persona {
    private String nomeCognome;
    private String cf;

    public Persona(String nome,String cf){
        this.nomeCognome = nome;
        this.cf = cf;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public String getNomeCognome() {
        return nomeCognome;
    }

    public void setNomeCognome(String nomeCognome) {
        this.nomeCognome = nomeCognome;
    }
}

