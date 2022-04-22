import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

import javax.lang.model.element.Element;

public class NavigableSetGC {
    
    public void metodoNavigableSetGC(){
        //COLECAO DE NOMES DE ALUNOS ====================================================
        String[] alunos = {"Ana", "Lucas", "Bruno", "Felipe", "Carlos", "Anna"};
        NavigableSet colecao1 = new TreeSet<>();
        for(int i=0; i<alunos.length; i++){
            colecao1.add(alunos[i]);
        }

        //METODOS RECEBEM OBJETOS
        String antesFelipe = (String) colecao1.lower("Felipe");
        System.out.println("Antes do Felipe vem o(a)" + antesFelipe);

        String depoisLucas = (String) colecao1.higher("Lucas");
        System.out.println("Depois do Lucas vem o(a) " + depoisLucas);

        //COLECAO DE NUMEROS =============================================================
        Integer[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        NavigableSet colecao2 = new TreeSet<Integer>();
        for(int i=0; i<numeros.length; i++){
            colecao2.add(numeros[i]);
        }

        System.out.println();
        Integer menorIgual6 = (Integer) colecao2.ceiling(6);
        System.out.println("Menor ou igual a 6: " + menorIgual6);

        Integer maiorIgual8 = (Integer) colecao2.floor(8);
        System.out.println("Maior ou igual a 0: " + maiorIgual8);

        System.out.println();
        System.out.println("SUBSET INCLUSIVE: ");
        NavigableSet entreInclusive = colecao2.subSet(3, true, 8, true);

        for (Object num : entreInclusive) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println("SUBSET EXCLUSIVE: ");
        NavigableSet entreExclusive = colecao2.subSet(3, false, 8, false);

        for (Object num : entreExclusive) {
            System.out.print(num + " ");
        }

    }
}
