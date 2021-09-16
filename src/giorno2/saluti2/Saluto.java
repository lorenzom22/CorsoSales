package giorno2.saluti2;

public class Saluto {
    private String nome;
    private String linguaFinale;

    public Saluto(Lingua linguaggio){
        this.nome="mario";
        this.linguaFinale=linguaggio.getLingua();

    }

    public String getNome() {
        return nome;
    }


    public String getLinguaFinale() {
        return linguaFinale;
    }

    public void setLinguaFinale(String linguaFinale) {
        this.linguaFinale = linguaFinale;
    }
}

