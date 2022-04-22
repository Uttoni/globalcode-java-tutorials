import java.util.ArrayDeque;
import java.util.Deque;

public class DequeGC {
    public void metodoDequeGC(){
        
        Deque nomes = new ArrayDeque();
        nomes.addFirst("ana");
        nomes.addFirst("beatriz");
        //ADD = ADDLAST
        nomes.add("carla");
        nomes.addLast("dora");

        while(!nomes.isEmpty()){
            System.out.println(nomes.poll());
        }
    }
}
