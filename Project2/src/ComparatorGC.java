import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import Model.Cliente;
import Model.ComparatorClienteId;
import Model.ComparatorClienteNome;
import Model.ComparatorClienteQtdPedidos;

public class ComparatorGC {
    
    public void metodoComparatorGC(){
        Cliente c1 = new Cliente("Lavínia", 1, 2);
        Cliente c2 = new Cliente("Miguel", 2, 4);
        Cliente c3 = new Cliente("Victor Antônio", 3, 3);

        ComparatorClienteId comparadorId = new ComparatorClienteId();
        ComparatorClienteNome comparadorNome = new ComparatorClienteNome();
        ComparatorClienteQtdPedidos comparadorPedidos = new ComparatorClienteQtdPedidos();

        Set ts1 = new TreeSet(comparadorId);
        Set ts2 = new TreeSet<>(comparadorNome);
        Set ts3 = new TreeSet<Cliente>(comparadorPedidos);

        ts1.add(c1);
        ts1.add(c2);
        ts1.add(c3);
        ts2.addAll(ts1);
        ts3.addAll(ts2);

        Iterator it1 = ts1.iterator();
        Iterator it2 = ts2.iterator();
        Iterator it3 = ts3.iterator();

        System.out.println("Por id: ");
        while(it1.hasNext()){
            System.out.println(it1.next());
        }

        System.out.println();
        System.out.println("Por nome: ");
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        System.out.println();
        System.out.println("Por pedido: ");
        while (it3.hasNext()) {
            System.out.println(it3.next());
        }

    }
}
