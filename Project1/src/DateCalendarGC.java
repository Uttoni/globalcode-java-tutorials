import java.util.Date;
import java.util.Calendar;

public class DateCalendarGC {
    public void metodoDateCalendar(){
        Date data = new Date();
        data.setYear(data.getYear() + 5);
        System.out.println(data);

        // CALENDARIO
        Calendar cal = Calendar.getInstance();
        Date dataCal = cal.getTime();
        System.out.println("Calendario: " + dataCal);
        dataCal.setYear(99);
        cal.setTime(dataCal);
        System.out.println("Data ajustada: " + cal.getTime());

        Calendar calendario = Calendar.getInstance();
        System.out.println("DIA DO MÊS: " + calendario.get(Calendar.DAY_OF_MONTH));
        System.out.println("DIA DA SEMANA: " + calendario.get(Calendar.DAY_OF_WEEK));
        System.out.println("MÊS: " + calendario.get(Calendar.MONTH));
        System.out.println("ANO: " + calendario.get(Calendar.YEAR));
        System.out.println("HORA DO DIA: " + calendario.get(Calendar.HOUR_OF_DAY));

        int minutos = calendario.get(Calendar.MINUTE);
        int mes = calendario.get(Calendar.MONTH);
        System.out.println("AGORA É: " + calendario.getTime());

        calendario.add(Calendar.YEAR, -3);
        calendario.set(Calendar.DAY_OF_MONTH, 10);
        calendario.set(Calendar.HOUR_OF_DAY, 21);
        System.out.println("DIA 10 AS 21H A 3 ANOS ATRAS: " + calendario.getTime());

        calendario.add(Calendar.HOUR_OF_DAY, 5);
        System.out.println("Mais 5 horas: " + calendario.getTime());

        calendario.add(Calendar.HOUR_OF_DAY, -5);
        System.out.println("Voltando ao dia 10 as 21: " + calendario.getTime());

        calendario.roll(Calendar.HOUR_OF_DAY, 5);
        System.out.println("Adiciona 5 horas de novo: " + calendario.getTime());
    }
}
