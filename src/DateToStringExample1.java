import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @project Practical
 * @author: Fathullo To'yliyev on 14/02/2023.
 * Company: Technologic ASBT
 */
//SANANI STRING FORMATGA O'TKAZISH
public class DateToStringExample1 {

    public static void main(String args[]) {
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String strDate = dateFormat.format(date);
        System.out.println("Converted String: " + strDate);

    }
}
