package giorno14.banche;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ContoCorrente {

    private Cliente propietario;
    private int saldoIniziale;
    private int saldoAttuale;
    private List<Integer> operazioni;
    private int massimoScoperto;

    public ContoCorrente(Cliente propietario, int saldoIniziale, int massimoScoperto) {
        this.propietario = propietario;
        this.saldoIniziale = saldoIniziale;
        List<Integer> operazioni = new ArrayList<>();
        this.operazioni = operazioni;
        this.saldoAttuale = saldoIniziale;
        this.massimoScoperto = massimoScoperto;

    }

    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    public int getSaldoIniziale() {
        return saldoIniziale;
    }

    public void setSaldoIniziale(int saldoIniziale) {
        this.saldoIniziale = saldoIniziale;
    }

    public int getSaldoAttuale() {
        return saldoAttuale;
    }

    public void setSaldoAttuale(int saldoAttuale) {
        this.saldoAttuale = saldoAttuale;
    }

    public List<Integer> getOperazioni() {
        return operazioni;
    }

    public void setOperazioni(List<Integer> operazioni) {
        this.operazioni = operazioni;
    }

    public int getMassimoScoperto() {
        return massimoScoperto;
    }

    public void setMassimoScoperto(int massimoScoperto) {
        this.massimoScoperto = massimoScoperto;
    }

    public void deposita(Integer importo) {
        if (importo == null) {
            System.out.println("Importo non valido");
            return;
        }
        this.operazioni.add(importo);
        this.saldoAttuale += importo;
    }

    public void preleva(Integer importo) {
        if (importo == null) {
            System.out.println("Importo non valido");
            return;
        }
        if (importo > 1000) {
            System.out.println("Importo oltre il limite");
            return;

        }
        if (importo > (saldoAttuale + massimoScoperto)) {
            System.out.println("Importo troppo elevato");
            return;

        }
        this.operazioni.add(importo * (-1));
        this.saldoAttuale -= importo;
    }

    public void estrattoConto() {
        System.out.println("Estratto Conto attuale");
        for (Integer importo : operazioni) {
            if (importo > 0) {
                System.out.println("DEPOSITO " + importo);
            } else {
                System.out.println("PRELIEVO " + importo);
            }
        }
        System.out.println("SALDO FINALE " + saldoAttuale);
    }


}
