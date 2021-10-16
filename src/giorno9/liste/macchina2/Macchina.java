package giorno9.liste.macchina2;

public class Macchina {
    private String nome;
    private int anno;
    private Motore cilindrata;

    public Macchina(String nome , int anno, Motore motore){
        this.nome = nome;
        this.anno = anno;
        this.cilindrata = motore;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public Motore getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(Motore cilindrata) {
        this.cilindrata = cilindrata;
    }
}
