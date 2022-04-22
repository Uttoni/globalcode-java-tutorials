package Model;

import java.util.Comparator;

public class ComparatorClienteId implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Cliente c1 = (Cliente) o1;
        Cliente c2 = (Cliente) o2;
        return c1.getId() - c2.getId();
    }
    
}
