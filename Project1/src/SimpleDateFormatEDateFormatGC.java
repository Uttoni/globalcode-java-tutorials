import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatEDateFormatGC {
    public void metodoSimpleDateFormatEDateFormatGC(){
        Date data = new Date();

        Locale china = Locale.CHINA;
        Locale france = Locale.FRANCE;
        Locale germany = Locale.GERMANY;
        Locale italy = Locale.ITALY;
        Locale japan = Locale.JAPAN;
        Locale korea = Locale.KOREA;
        Locale taiwan = Locale.TAIWAN;
        Locale uk = Locale.UK;
        Locale brazil = new Locale("bn-IN", "IN");
        Locale finland = new Locale("fi", "FI");

        Locale[] lugares = { china, france, germany, italy, japan, korea, taiwan, uk, brazil, finland };

        for (int i = 0; i < lugares.length; i++) {
            Locale lugar = lugares[i];
            DateFormat form = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT, lugar);
            System.out.println(form.format(data));

            SimpleDateFormat formatador = new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy", lugar);
            System.out.println(formatador.format(data));
        }
    }
}
