import Model.Pessoa;

public class EqualsHashCodeGC {
    
    public void metodoEqualsHashCodeGC(){
        
        Pessoa p1 = new Pessoa("Pedro", 123456789, "10/03/2000");
        Pessoa p2 = new Pessoa("Pedro", 123456789, "10/03/2000");
        
        if(p1.equals(p2)){
            System.out.println("São pessoas iguais!");
            System.out.println("HashCode P1: " + p1.hashCode());
            System.err.println("HashCode P2: " + p2.hashCode());
        }
        else{
            System.err.println("São pessoas diferentes");
        }

    }
}
