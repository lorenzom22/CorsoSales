package giorno13.liste.conto;

public class Operazione {
    private int ammontare;
    private String tipo;

    public Operazione(String tipo, int ammontare){
        this.tipo =tipo;
        this.ammontare = ammontare;
    }

    public int getAmmontare() {
        return ammontare;
    }

    public void setAmmontare(int ammontare) {
        this.ammontare = ammontare;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

