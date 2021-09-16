package giorno2.saluti;

abstract public class Saluto {



    public String salutare(){
        String saluto = saluta();
        return saluto;
    }


    abstract String saluta();


}
