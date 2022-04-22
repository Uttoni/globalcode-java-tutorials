import java.util.PriorityQueue;
import java.util.Queue;

import javax.swing.plaf.synth.SynthSpinnerUI;

import Model.Cliente;
import Model.ComparatorClienteQtdPedidos;

public class PriorityQueueGC {
    
    public void metodoPriorityQueue(){
        ComparatorClienteQtdPedidos comparadorPedidos = new ComparatorClienteQtdPedidos();
        Queue clientes = new PriorityQueue(13, comparadorPedidos);
        clientes.add(new Cliente("Zhao", 2, 35));
        clientes.add(new Cliente("Yue", 1, 142));
        clientes.offer(new Cliente("Ling", 7, 80));

        System.out.println("Primeiro elemento da lista? " + clientes.peek());

        while(!clientes.isEmpty()){
            System.out.println(clientes.poll());
        }

        System.out.println("Primeiro elemento da lista? " + clientes.peek());

        clientes.add(new Cliente("Aang", 79, 10));
        clientes.add(new Cliente("Sun", 3, 2));

        System.out.println("Primeiro elemento da lista? " + clientes.peek());

        while(!clientes.isEmpty()){
            System.out.println(clientes.poll());
        }

    }
}
