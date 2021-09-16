package Calcolatrice;

public class Divisione  extends Operazione{
    public int esegui(){
        int quoziente = this.getOperando1() / this.getOperando2();
        return quoziente;
    }
}
