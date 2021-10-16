package giorno9.liste.collections;

public class Macchina {

    private String modello;
    private Integer anno;

    public Macchina(String modello, Integer anno){
        this.modello = modello;
        this.anno = anno;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public Integer getAnno() {
        return anno;
    }

    public void setAnno(Integer anno) {
        this.anno = anno;
    }
}
