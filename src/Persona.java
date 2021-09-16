abstract public class Persona {




    private String Nome;
    private String Cognome;
    private String Codice;



    public String getNome() {
        return Nome;
    }

    public String getCognome() {
        return Cognome;
    }

    public String getCodice() {
        return Codice;
    }
    public void setNome(String nome) {
        Nome = nome;
    }

    public void setCognome(String cognome) {
        Cognome = cognome;
    }

    public void setCodice(String codice) {
        Codice = codice;
    }

    public boolean checkCF() {
        if (Codice.length()==16) {
            System.out.println("codice di " + this.Nome + " valido");
            return true;
        } else {
        System.out.println("codice di "+ this.Nome +" non valido");
        return false;
        }
    }

    abstract public String getWork();

    public boolean controllaCF(){
        if(Codice.substring(0, 5).matches("[a-zA-Z]+")){
            return true;
        }else{
            return false;
        }
    }

    public String nomeCognome(){
        String nomecompleto = this.Nome +" "+ this.Cognome;
                return nomecompleto;
    }




}


