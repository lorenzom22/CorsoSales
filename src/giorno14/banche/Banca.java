package giorno14.banche;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Banca {

    private String nome;
    private Set<ContoCorrente> conti;
    private int massimoScoperto;
    private static int contiAttivi;
    private static int contiChiusi;

    public Banca(String nome, int massimoScoperto) {
        this.nome = nome;
        this.conti = new HashSet<>();
        this.massimoScoperto = massimoScoperto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<ContoCorrente> getConti() {
        return conti;
    }

    public void setConti(Set<ContoCorrente> conti) {
        this.conti = conti;
    }

    public int getMassimoScoperto() {
        return massimoScoperto;
    }

    public void setMassimoScoperto(int massimoScoperto) {
        this.massimoScoperto = massimoScoperto;
    }

    public static int getContiAttivi() {
        return contiAttivi;
    }

    public static void setContiAttivi(int contiAttivi) {
        Banca.contiAttivi = contiAttivi;
    }

    public static int getContiChiusi() {
        return contiChiusi;
    }

    public static void setContiChiusi(int contiChiusi) {
        Banca.contiChiusi = contiChiusi;
    }

    public void aperturaConto(Cliente cliente, int depositoIniziale) {
        for (ContoCorrente conto : conti) {
            if (conto.getPropietario().equals(cliente)) {
                System.out.println(cliente.getNomeCognome() + " possiede gia un conto!");
                return;
            }
        }

        conti.add(new ContoCorrente(cliente, depositoIniziale, massimoScoperto));
        contiAttivi++;
    }

    public void prelievo(Cliente cliente, Integer importo) {
        for (ContoCorrente conti : conti) {
            if (conti.getPropietario().equals(cliente)) {
                conti.preleva(importo);
                break;
            }
        }
    }

    public void deposito(Cliente cliente, int importo) {
        for (ContoCorrente conti : conti) {
            if (conti.getPropietario().equals(cliente)) {
                conti.deposita(importo);
                break;
            }
        }
    }

    public void estrattoConto(Cliente cliente){
        for(ContoCorrente conti :conti){
            if (conti.getPropietario().equals(cliente)){
                conti.estrattoConto();
            }
        }
    }

    public void chiudiConto(Cliente cliente) {
        Iterator<ContoCorrente> contiIterator = conti.iterator();
        while (contiIterator.hasNext()) {
            ContoCorrente conto = contiIterator.next();
            if (conto.getPropietario().equals(cliente)) {
                contiIterator.remove();
                contiChiusi++;
                contiAttivi--;
                break;
            }
        }
    }

    public ContoCorrente conto(Cliente cliente){
        for(ContoCorrente conto : conti){
            if (conto.getPropietario().equals(cliente)){
                return conto;
            }
        }
        return null;
    }
}
