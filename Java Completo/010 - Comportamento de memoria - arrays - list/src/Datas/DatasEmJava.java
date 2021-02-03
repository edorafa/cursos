package Datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DatasEmJava {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("25/06/2018 15:45:07");

        System.out.println("x1: " + sdf2.format(x1));
        System.out.println("x2: " + sdf2.format(x2));
        System.out.println("x3: " + sdf2.format(x3));
        System.out.println("y1: " + sdf2.format(y1));
        System.out.println("y2: " + sdf2.format(y2));

        System.out.println();
        System.out.println("Calendar");
        System.out.println();
        System.out.println();

        Calendar cal = Calendar.getInstance();
        cal.setTime(x1);
        cal.add(Calendar.HOUR_OF_DAY,4);
        x1 = cal.getTime();

        System.out.println("x1: " + sdf2.format(x1));

        int minutos = cal.get(Calendar.MINUTE);
        System.out.println("Minutos: " + minutos);
    }
}
