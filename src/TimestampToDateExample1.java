import java.sql.Timestamp;
import java.util.Date;


public class TimestampToDateExample1 {

    public static void main(String args[]) {
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        Date date = new Date(ts.getTime());
        System.out.println(date);
    }

    public static class TimestampToDateExample2 {
        public static void main(String args[]) {
            Timestamp ts = new Timestamp(System.currentTimeMillis());
            Date date = ts;
            System.out.println(date);
        }
    }
}