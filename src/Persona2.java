public class Persona2 {

    private String nome;
    private String cognome;
    private String cf;




    public boolean controllaCF() {
        if (cf != null) {
            if (cf.length() == 16 && cf.substring(0, 5).matches("[a-zA-Z]+")) {
                System.out.println("CF di " + nome + " valido");
                return true;
            } else {
                System.out.println("CF di " + this.nome + " NON valido");
                return false;
            }
        } else {
            System.out.println("CF di + " + this.nome + " NON trovato");
            return false;
        }
    }

    public String nomeCognome() {
        String NomeCompleto = this.nome + " " + this.cognome;
        return NomeCompleto;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCognome() {
        return cognome;
    }


    public void setCognome(String cognome) {
        this.cognome = cognome;
    }


    public String getCf() {
        return cf;
    }


    public void setCf(String cf) {
        this.cf = cf;
    }
}

