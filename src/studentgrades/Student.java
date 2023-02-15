package studentgrades; /**
 * @project studentgrades.Student grades
 * @author: Fathullo To'yliyev on 09/02/2023.
 * Company: Technologic ASBT
 */

import java.util.Scanner;

class Student {

    private String name;//TALABA ISMI
    private int[] marks;//TALABA BAHOSI

    // TALABANING ISMI VA BAHOLARINI BOSHLASH UCHUN KONSTRUKTOR-OOP
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    // O'RTACHA BAHONI HISOBLASH UCHUN
    public double getAverage() {
        int total = 0;
        // HAMMA BAHOLARNI FOR ICHIDA AYLANIB CHIQADI,KEYIN QO'SHADI
        for (int mark : marks) {
            total += mark;
        }
        // DOUBLE(VERGULDAN KEYIN RAQAMLARNI OLADI)QIYMAT QAYTARADI,BARCHA FANLARNI SONINGA BO'LIB O'RTACHA BAHO CHIQARADI.
        return (double) total / marks.length;
    }

    // YUQORI BAHONI OLISH
    public int getHighest() {
        int highest = marks[0];
        for (int mark : marks) {
            if (mark > highest) {
                highest = mark;
            }
        }
        return highest;
    }

    // Talabaning ismini qaytarish metodi
    public String getName() {
        return name;
    }
}


class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TALABA ISMINI KIRTISH UCHUN(QO'LDA)
        System.out.print("TALABA ISMINI KIRITING :");
        String name = scanner.nextLine();

        // FAN NOMINI KIRTISH UCHUN(QO'LDA)
        System.out.print("FANLAR SONINI KIRITING :");
        int numOfSubjects = scanner.nextInt();

        // HAR BIR FANNING BAHOLARINI SAQLASH UCHUN MASSIV
        int[] marks = new int[numOfSubjects];

        //  HAR BIR FAN BO'YICHA BAHOLARNI O'QIB OLISH
        System.out.println("HAR BIR FANDAN OLADIGAN BAHONI KIRITING");
        for (int i = 0; i < numOfSubjects; i++) {
            marks[i] = scanner.nextInt();
        }

        // OBYEKT YARATISH
        Student student = new Student(name, marks);

        // TALABANING O'RTACHA BAHOSINI EKRANGA CHIQARISH
        System.out.println("O'RTACHA BALL " + student.getName() + "  " + student.getAverage());

        // TALABANING YUQORI BAHOSINI EKRANGA CHIQARISH
        System.out.println("YUQORI BALL " + student.getName() + "  " + student.getHighest());
    }
}
