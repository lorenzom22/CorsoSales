package giorno14.banche;

import java.util.Objects;

public class Cliente {
    private String nomeCognome;
    private String cf;

    public Cliente(String nomeCognome, String cf) {
        this.cf = cf;
        this.nomeCognome = nomeCognome;
    }

    public String getNomeCognome() {
        return nomeCognome;
    }

    public void setNomeCognome(String nomeCognome) {
        this.nomeCognome = nomeCognome;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(cf, cliente.cf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cf);
    }
}
