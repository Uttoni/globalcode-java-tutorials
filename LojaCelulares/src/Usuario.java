import java.util.Calendar;
import java.util.Date;

import javax.management.relation.Relation;

public class Usuario {
    public String nome;
    public String email;
    public String cpf;
    public Date dataNasc;
    public int idade;

    public void calculaIdade(){

        int idade = 0;
        
        //DATA ATUAL
        Calendar dataAtual = Calendar.getInstance();
        int diaAtual = dataAtual.get(Calendar.DAY_OF_MONTH);
        int mesAtual = dataAtual.get(Calendar.MONTH);
        int anoAtual = dataAtual.get(Calendar.YEAR);
        
        Calendar dataAntiga = Calendar.getInstance();
        dataAntiga.setTime(dataNasc);
        int diaAntigo = dataAntiga.get(Calendar.DAY_OF_MONTH);
        int mesAntigo = dataAntiga.get(Calendar.MONTH);
        int anoAntigo = dataAntiga.get(Calendar.YEAR);
        
        idade = anoAtual - anoAntigo;
        if(mesAtual < mesAntigo){
            idade -= 1;
        }
        else if(mesAtual == mesAntigo){
            if(diaAtual < diaAntigo){
                idade -= 1;
            }
        }

        this.idade = idade;
    }

    public void gerarRelatorio(Celular[] lista){
        StringBuilder relatorio = new StringBuilder();
        for(int i=0; i<lista.length; i++){
            if(lista[i] != null){
                relatorio.append(lista[i].toString());
            }
        }

        System.out.println(relatorio);
    }
}
