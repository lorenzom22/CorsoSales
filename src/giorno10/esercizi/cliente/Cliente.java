package giorno10.esercizi.cliente;

public class Cliente {
    private String nome;
    private String cf;

    public Cliente(String nome,String cf){
        this.cf = cf;
        this.nome = nome;
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
