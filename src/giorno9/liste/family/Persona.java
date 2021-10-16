package giorno9.liste.family;

import java.util.Objects;

public class Persona {

    private String nome;
    private String cognome;
    private String cf;
    private char genere;

    public Persona(String nome, String cognome, String cf, char genere){
        this.nome = nome;
        this.cognome = cognome;
        this.cf = cf;
        this.genere = genere;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(cf, persona.cf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cf);
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

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public char getGenere() {
        return genere;
    }

    public void setGenere(char genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", cf='" + cf + '\'' +
                ", genere=" + genere +
                '}';
    }
}
