import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @project Practical
 * @author: Fathullo To'yliyev on 14/02/2023.
 * Company: Technologic ASBT
 */
//TEXTNI SANA FORMATIGA O'ZGARTIRISH
public class StringToDateExample1 {

    public static void main(String[] args) throws Exception {
        String sDate1 = "31/12/1998";
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        System.out.println(sDate1 + "\t" + date1);
    }
}
