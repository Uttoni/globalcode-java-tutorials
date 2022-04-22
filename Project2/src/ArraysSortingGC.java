import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import Model.Cliente;
import Model.ComparatorClienteQtdPedidos;

public class ArraysSortingGC {
    
    public void metodoArraysSortingGC(){

        // AMBOS PODEM PASSAR UM COMPARATOR NO SORT
        //ORDENANDO ARRAYS ===========================================================
        Integer[] numeros = {4, 6, 24, 1, 43, 23, 996, 34, 63, 3};
        Arrays.sort(numeros);
        System.out.println("Array ordenado sem comparator (Usa Comparable): ");
        System.out.println(Arrays.toString(numeros));
        System.out.println();

        //ORDENANDO ARRAYLISTS =======================================================
        List clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente("Hannah", 5, 789));
        clientes.add(new Cliente("Bruce", 8, 456));
        clientes.add(new Cliente("Peter", 2, 123));

        ComparatorClienteQtdPedidos comparador = new ComparatorClienteQtdPedidos();
        Collections.sort(clientes, comparador);
        System.out.println("ArrayList ordenado com comparator (Sem comparable): ");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i));
        }
    }
}
