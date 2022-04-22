package Model;

import java.util.Comparator;

public class ComparatorClienteQtdPedidos implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Cliente c1 = (Cliente) o1;
        Cliente c2 = (Cliente) o2;
        return c1.getQtdPedidos() - c2.getQtdPedidos();
    }
    
}
