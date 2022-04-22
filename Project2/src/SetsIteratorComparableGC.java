import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsIteratorComparableGC {
    
    public void metodoSetsIteratorComparableGC(){
        
        //HASH SET ===============================================================
        Set nomes1 = new HashSet();
        nomes1.add("João");
        nomes1.add("Maria");
        nomes1.add("Ana");
        nomes1.add("Bruno");
        nomes1.add("Maria");

        Iterator iterator1 = nomes1.iterator();

        int i1=0;
        System.out.println("Lista de Nomes fora de ordem: (HASHSET)");
        while(iterator1.hasNext()){
            System.out.println("[" + i1 + "] = " + iterator1.next());
            i1++;
        }

        System.out.println();

        //LINKED HASH SET ===============================================================
        Set nomes2 = new LinkedHashSet();

        nomes2.add("João");
        nomes2.add("Maria");
        nomes2.add("Ana");
        nomes2.add("Bruno");
        nomes2.add("Maria");

        Iterator iterator2 = nomes2.iterator();

        int i2 = 0;
        System.out.println("Lista de Nomes em ordem de inserção: (LINKEDHASHSET)");
        
        while (iterator2.hasNext()) {
            System.out.println("[" + i2 + "] = " + iterator2.next());
            i2++;
        }

        System.out.println();

        //TREE SET ======================================================================
        Set nomes3 = new TreeSet();

        nomes3.add("João");
        nomes3.add("Maria");
        nomes3.add("Ana Paula");
        nomes3.add("Amanda");

        Iterator iterator3 = nomes3.iterator();
        int i3 = 0;

        System.out.println("Lista em ordem alfabética: (TREESET)");
        while (iterator3.hasNext()) {
            System.out.println("[" + i3 + "] = " + iterator3.next());
            i3++;
        }

        System.out.println();

        //NAVIGABLE SET (extensão do SortedSet não usado mais)=========================
        

    }
}
