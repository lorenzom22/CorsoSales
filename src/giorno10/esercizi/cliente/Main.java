package giorno10.esercizi.cliente;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Set<Vendita> setVendite = new HashSet<>();
        List<Cliente> listaClienti = new ArrayList<>();
        List<Prodotto> listaProdotti = new ArrayList<>();


        Prodotto prod1 = new Prodotto("prod1","1234");
        Prodotto prod2 = new Prodotto("prod2","1245");
        Prodotto prod3 = new Prodotto("prod3","1256");
        Prodotto prod4 = new Prodotto("prod4","1267");

        Cliente clie1 = new Cliente("cliente1","cfar");
        Cliente clie2 = new Cliente("cliente2","cfds");
        Cliente clie3 = new Cliente("cliente3","cfda");
        Cliente clie4 = new Cliente("cliente4","cfjh");

        listaClienti.add(clie1);
        listaClienti.add(clie2);
        listaClienti.add(clie3);
        listaClienti.add(clie4);

        listaProdotti.add(prod1);
        listaProdotti.add(prod2);
        listaProdotti.add(prod3);
        listaProdotti.add(prod4);


        setVendite.add(new Vendita(listaProdotti.get(2),listaClienti.get(0),12));
        setVendite.add(new Vendita(listaProdotti.get(1),listaClienti.get(2),32));
        setVendite.add(new Vendita(listaProdotti.get(1),listaClienti.get(3),122));
        setVendite.add(new Vendita(listaProdotti.get(0),listaClienti.get(1),1));
        setVendite.add(new Vendita(listaProdotti.get(3),listaClienti.get(3),13));
        setVendite.add(new Vendita(listaProdotti.get(3),listaClienti.get(1),1222));
        setVendite.add(new Vendita(listaProdotti.get(2),listaClienti.get(0),2));


        //GENERA REPORT LEGATO AD UN CLIENTE



        stampaVendite(setVendite);





    }

    public static void stampaVendite(Set<Vendita> setVendite){
        for( Vendita vendita : setVendite){
            System.out.println( " venduti "+vendita.getQuantita() +" "+vendita.getProdotto().getNome()+" ad "+vendita.getCliente().getNome());
        }
    }

    public static Map<Cliente,Integer> reportCliente(Set<Vendita> setVendite){
        Map<Cliente,Integer> report= new HashMap<>();
        for(Vendita vendita : setVendite){
            report.put(vendita.getCliente(),vendita.getQuantita());
        }
    return report;
    }

    public static void stampaReport(Map<Cliente,Integer> reportCliente){
        for (Cliente cliente: reportCliente.keySet()){
            System.out.println("il cliente "+cliente.getNome()+"ha venduto "+reportCliente.get(cliente)+" prodotti ");
        }
    }

}
