package util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Utilities {

    private Utilities() {}

    public static String getTomorrowDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat( "yyyy/MM/dd" );
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add( Calendar.DATE, 1 );
        String convertedDate=dateFormat.format(cal.getTime());
        return convertedDate;
    }

}
