package giorno6.array.podistica;

import java.util.Objects;

public class Atleta {

    private String nome;
    private String cognome;
    private String cf;
    private String email;
    private int pettorale;


    public Atleta(String nome, String cognome, String cf, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.cf = cf;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPettorale() {
        return pettorale;
    }

    public void setPettorale(int pettorale) {
        this.pettorale = pettorale;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", cf='" + cf + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object oAtleta) {
        if (this == oAtleta) return true;
        if (oAtleta == null || getClass() != oAtleta.getClass()) return false;
        Atleta atleta = (Atleta) oAtleta;
        return Objects.equals(this.email, atleta.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}
