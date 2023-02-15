/**
 * @project Practical
 * @author: Fathullo To'yliyev on 14/02/2023.
 * Company: Technologic ASBT
 */
public class StringToBooleanExample2 {

    public static void main(String args[]) {
        String s1 = "true";
        String s2 = "TRUE";
        String s3 = "ok";
        Boolean b1 = Boolean.valueOf(s1);
        Boolean b2 = Boolean.valueOf(s2);
        Boolean b3 = Boolean.valueOf(s3);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }

    //KATA YOKI KICHIK HARF BO'LISHIDAN QAT'IY NAZAR TRUE YOKI FALSE SO'ZINI PARSE QILGANDA O'QIY OLADI
}
