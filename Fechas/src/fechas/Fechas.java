package fechas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Fechas {

    public static void main(String[] args) {
      fecha();
    }

    private static void fecha() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String date1String1 = "08/01/2021";
        String date2String2 = "08/02/2021";

        try {
            Date date1 = sdf.parse(date1String1);
            Date date2 = sdf.parse(date2String2);
            long diff = date2.getTime() - date1.getTime();
            
            System.out.println("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
        Calendar c = Calendar.getInstance();
        c.setTime(date2);
        c.add(Calendar.DATE,30);
            System.out.println(sdf.format(c.getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
