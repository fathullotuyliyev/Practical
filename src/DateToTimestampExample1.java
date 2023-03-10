import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;


//SANANI TIMESTAMPGA O'TKAZISH
public class DateToTimestampExample1 {

    public static void main(String args[]) {
        Date date = new Date();
        Timestamp ts = new Timestamp(date.getTime());
        System.out.println(ts);
    }

    public static class DateToTimestampExample2 {
        public static void main(String args[]) {
            Date date = new Date();
            Timestamp ts = new Timestamp(date.getTime());
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(formatter.format(ts));
        }
    }
}
