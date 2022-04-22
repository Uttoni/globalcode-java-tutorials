import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import Model.Pessoa;

public class CollectionListVectorGC {
    
    public void metodoCollectionListVectorGC(){
        Pessoa p1 = new Pessoa("Lucas", 123456789, "01/07/1998");
        Pessoa p2 = new Pessoa("Maria", 987654, "09/09/1999");
        Pessoa p3 = new Pessoa("Pedro", 135790, "10/10/1984");
        Pessoa p4 = new Pessoa("Luana", 24680, "19/07/2003");
       
        /*
         * ARRAYLIST: NÃO É THREAD SAFE (ASSÍNCRONO) TEM ÍNDICE ACEITA ELEMENTOS
         * DUPLICADOS E NULL NÃO É AUTOMATICAMENTE ORDENADO
         */
        List pessoas1 = new ArrayList<Pessoa>();
        pessoas1.add(p1);
        pessoas1.add(p2);
        pessoas1.add(0, p3);
        pessoas1.add(p4);
        
        System.out.println("Adicionar: ");
        for (int i = 0; i < pessoas1.size(); i++) {
            System.out.println(pessoas1.get(i).toString());
        }

        pessoas1.remove(0);
        pessoas1.remove(p4);

        System.out.println("Remover: ");
        for (int i = 0; i < pessoas1.size(); i++) {
            System.out.println(pessoas1.get(i).toString());
        }

        Collections.sort(pessoas1);
        Collections.reverse(pessoas1);

        System.out.println("Ordenar: ");
        for (int i = 0; i < pessoas1.size(); i++) {
            System.out.println(pessoas1.get(i).toString());
        }

        /*
         * VECTOR: É THREAD SAFE (SÍNCRONO) VEM SENDO MENOS USADO DESE O JAVA 5 É
         * BASICAMENTE UM ARRAYLIST
         */
        List pessoas2 = new Vector<Pessoa>();

        pessoas2.addAll(pessoas1);
        
        System.out.println("Adiciona todos: ");
        for (int i = 0; i < pessoas1.size(); i++) {
            System.out.println(pessoas1.get(i).toString());
        }

        System.out.println("Contém Maria? " + pessoas2.contains(p2));
        
        System.out.println("Contém todo mundo? " + pessoas2.containsAll(pessoas1));

        pessoas2.add(p3);
        pessoas2.add(p4);

        System.out.println("Adiciona de novo todos: ");
        for (int i = 0; i < pessoas2.size(); i++) {
            System.out.println(pessoas2.get(i).toString());
        }

        pessoas2.removeAll(pessoas1);

        System.out.println("Retira todos os elementos do primeiro array: ");
        for (int i = 0; i < pessoas2.size(); i++) {
            System.out.println(pessoas2.get(i).toString());
        }

        pessoas2.retainAll(pessoas1);

        System.out.println("Remove todos que não sejam os do primeiro array: ");
        for (int i = 0; i < pessoas2.size(); i++) {
            System.out.println(pessoas2.get(i).toString());
        }

        pessoas1.clear();
        System.out.println("Primeiro array vazio? " + pessoas1.isEmpty());

        LinkedList linkedList = new LinkedList<>(pessoas2);

        System.out.println("Linked criada poré vazia");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i).toString());
        }

        System.out.println(linkedList.poll());
    }
}
