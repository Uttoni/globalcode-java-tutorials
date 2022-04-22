import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatGC {
    public void metodoNumberFormat(){
        Locale localidade = new Locale("pt", "BR");

        NumberFormat formatadorNumerico = NumberFormat.getNumberInstance(localidade);
        NumberFormat formatadorMonetario = NumberFormat.getCurrencyInstance(localidade);
        NumberFormat formatadorPercentual = NumberFormat.getPercentInstance(localidade);
        
        formatadorNumerico.setMinimumFractionDigits(2);

        System.out.println("Numero: " + formatadorNumerico.format(1000));
        System.out.println("Moeda: " + formatadorMonetario.format(150.4));
        System.out.println("Percentual: " + formatadorPercentual.format(0.53));


        try{
            Number valor = formatadorNumerico.parse("1500");
            System.out.println("Numero lido: " + valor);
        }catch(ParseException e){
            e.printStackTrace();
        }

    }
}
