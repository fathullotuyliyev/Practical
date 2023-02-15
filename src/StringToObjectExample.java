/**
 * @project Practical
 * @author: Fathullo To'yliyev on 14/02/2023.
 * Company: Technologic ASBT
 */

//STRINGNI OBYEKTGA AYLANTIRISH
public class StringToObjectExample {

    public static void main(String args[])throws Exception{
        Class c=Class.forName("java.lang.String");
        System.out.println("class name: "+c.getName());
        System.out.println("super class name: "+c.getSuperclass().getName());
    }
}
