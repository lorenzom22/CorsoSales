package giorno9.liste.macchina;

public class Macchina {

    private String nome;
    private int anno;

    public Macchina(String nome, int anno) {
        this.nome = nome;
        this.anno = anno;
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

    @Override
    public String toString() {
        return "Macchina{" +
                "nome='" + nome + '\'' +
                ", anno=" + anno +
                '}';
    }
}
