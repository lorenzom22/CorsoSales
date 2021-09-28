package giorno6.array.podistica;

public class Gara {
    public static final int NR_MAX_ATLETI = 50;

    private String nome;
    private int lunghezzaGara;
    private Atleta[] registroPartecipanti;
    private int posizioneRegistro;
    private int numeroPettoraleContatore;

    public Gara(String nome, int lunghezza) {

        this.nome = nome;
        this.lunghezzaGara = lunghezza;
        //inizializzo array che ho dichiarato sopra
        this.registroPartecipanti = new Atleta[NR_MAX_ATLETI];
        this.posizioneRegistro = 0;
        this.numeroPettoraleContatore = 1;

    }

    public void iscrizioneGara(Atleta partecipante) {
        // controllo con == null migliore di != null
        if (partecipante == null) {
            System.out.println("Atleta non valido");
            return;
        }
        for (Atleta elemento : this.registroPartecipanti) {
            if (elemento != null) {
                //if (elemento.getEmail().equals(partecipante.getEmail())) {
                if (elemento.equals(partecipante)) {
                    System.out.println("Atleta già registrato");
                    return;
                }
            }
        }

        this.registroPartecipanti[posizioneRegistro] = partecipante;
        this.posizioneRegistro++;
        partecipante.setPettorale(numeroPettoraleContatore);
        this.numeroPettoraleContatore++;
    }

    public void cancellaIscrizione(Atleta partecipante) {
        if (partecipante == null) {
            System.out.println("Atleta non valido");
            return;
        }
        // ciclo for standard per aver possibilità di vedere indice
        for (int i = 0; i < NR_MAX_ATLETI; i++) {
            if (this.registroPartecipanti[i] != null) {
                if (partecipante.equals(registroPartecipanti[i])) {
                    // equals implementato nella classe oggetto da cui proviene
                    //if (partecipante.getEmail().equals(this.registroPartecipanti[i].getEmail())) {
                    this.registroPartecipanti[i] = null;
                    System.out.println(partecipante + "deregistrato correttamente");
                    return;
                }
            }
        }
        System.out.println("Atleta non registrato");
    }

    public void stampaRegistro() {
        System.out.println("Registro atleti: ");
        for (Atleta elemento : this.registroPartecipanti) {
            if (elemento != null) {
                System.out.println(elemento + " con pettorale " + elemento.getPettorale());
            }
        }
    }

    ;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLunghezzaGara() {
        return lunghezzaGara;
    }

    public void setLunghezzaGara(int lunghezzaGara) {
        this.lunghezzaGara = lunghezzaGara;
    }
}
