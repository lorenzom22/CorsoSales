package giorno5.age;

import java.util.Random;

public class Persona {
    private String nome;
    private int eta;


    public Persona(String nome){
        this.nome =nome;
        this.eta = randomEta();

        }

    public int randomEta(){
        int num;
        Random random = new Random();
        return random.nextInt(99)+ 1;

    }



    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }
}
