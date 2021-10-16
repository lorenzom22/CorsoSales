package giorno13.liste.conto;

import java.util.ArrayList;
import java.util.List;

public class Conto {
    private Persona propietario;
    private int saldo;
    private List<Operazione> operazioni;

    public Conto(Persona titolare, int depositoIniziale) {
        this.propietario = titolare;
        this.saldo = depositoIniziale;
        List<Operazione> operazioni = new ArrayList<>();
        this.operazioni = operazioni;
        operazioni.add(new Operazione("deposito", depositoIniziale));
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public List<Operazione> getOperazioni() {
        return operazioni;
    }

    public void setOperazioni(List<Operazione> operazioni) {
        this.operazioni = operazioni;
    }

    public static void preleva(int ammontare, Conto conto) {
        if (conto.getSaldo() < ammontare) {
            System.out.println("Impossibile prelevare saldo insufficiente");
            return;
        }
        if (ammontare > 1000) {
            System.out.println("Importo troppo elevato");
            return;
        }
        conto.setSaldo(conto.getSaldo() - ammontare);
        Operazione operazione = new Operazione("prelievo", ammontare);
        conto.getOperazioni().add(operazione);
        return;

    }


    public static void deposita(int ammontare, Conto conto) {
        conto.setSaldo(conto.getSaldo() + ammontare);
        Operazione operazione = new Operazione("deposito", ammontare);
        conto.getOperazioni().add(operazione);
        return;

    }

    public static void estrattoConto(Conto conto) {
        if (conto.getOperazioni() != null) {
            List<Operazione> movimenti = conto.getOperazioni();
            for (Operazione operazione : movimenti) {
                System.out.println("Effettuato un " + operazione.getTipo() + " di " + operazione.getAmmontare() + " euro");
            }
        }
        System.out.println("Saldo attuale di "+conto.getPropietario().getNomeCognome()+" " + conto.getSaldo() + " Euro");
    }
}
