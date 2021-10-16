package giorno11.esercizi.teatroFinale;

public class Persona {
    private String nome;
    private String cf;

    public Persona(String nome, String cf){
        this.nome = nome;
        this.cf = cf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }
}
