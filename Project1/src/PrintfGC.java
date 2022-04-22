import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class PrintfGC {
    public void metodoPrintfGC(){

        String nome = "Uttoni Brandani";
        Date data = new Date();
        Locale local = new Locale("pt", "BR");
        double pagamento = 250;


        //COM FORMATADORES COMUNS
        
        SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy, EEEE");        
        NumberFormat formatadorNumerico = NumberFormat.getCurrencyInstance(local);
        System.out.println(nome + " pagou " + formatadorNumerico.format(pagamento) + " em " +
        formatadorData.format(data));
        

        //COM PRINTF
        System.out.printf("%s pagou R$ %.2f em %td/%<tm/%<tY, %<tA %n", nome, pagamento, data);
        System.out.printf("%s pagou R$ %.2f em %td/%3$tm/%3$tY, %3$tA", nome, pagamento, data);
    }
}
