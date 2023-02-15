package onlineshopping;

import java.util.ArrayList;
import java.util.List;

/**
 * @project Practical
 * @author: Fathullo To'yliyev on 09/02/2023.
 * Company: Technologic ASBT
 */

//ONLINE XARID QILISH SISTEMASI
public class OnlineShoppingSystem {

    public static void main(String[] args) {
        Customer customer = new Customer("Fathullo To'yliyev", "fathulloto'yliyev@gmail.com");
        Product product1 = new Product("iPhone", 999.99);
        Product product2 = new Product("MacBook Pro", 1999.99);
        Order order = new Order(customer);
        order.addProduct(product1);
        order.addProduct(product2);
        order.printInvoice();
    }
}

//MIJOZ
class Customer {
    private String name;//MIJOZ ISMI
    private String email;//MIJOZ EMAILI

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }


    /**
     * Getter - bu xususiy o'zgaruvchining qiymatini qaytaruvchi metod. U o'zgaruvchiga faqat o'qish uchun ruxsat beradi, tashqi kodga uning qiymatini
     * olish imkonini beradi, lekin uni o'zgartirmaydi.
     * <p>
     * Setter- bu xususiy o'zgaruvchining qiymatini belgilaydigan metoddir. U o'zgaruvchiga faqat yozish uchun ruxsat beradi,
     * tashqi kodga uning qiymatini o'zgartirishga imkon beradi, lekin uni qaytarib olmaydi.
     * <p>
     * Getters va setterlardan foydalanish Java dasturlashda keng tarqalgan amaliyotdir, chunki u class o'zgaruvchilariga kirishni yaxshiroq
     * boshqarish imkonini beradi. O'zgaruvchilarni shaxsiy saqlash va ularga kirish va o'zgartirish uchun qabul qiluvchi va sozlagichlardan
     * foydalanish orqali siz classga tegishli ma'lumotlarga qoidalar yoki cheklovlarni kiritishingiz mumkin.
     */
    // GETTER-SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

// MAXSULOT
class Product {
    private String name;//MAXSULOT NOMI
    private double price;//MAXSULOT NARXI


    /**
     * Konstruktor class ob'ektini yaratish va uning holatini ishga tushirish uchun ishlatiladi. U ob'ekt namunasi o'zgaruvchilari uchun
     * standart qiymatlarni o'rnatish va kerakli sozlash operatsiyalarini bajarish imkonini beradi. Java-da konstruktorlar juda
     * muhim, chunki ular foydalanishdan oldin ob'ektlarning to'g'ri ishga tushirilishini ta'minlaydi, bu  kodingizdagi xatolar
     * va xatolardan qochishga yordam beradi.
     */

    // KONSTRUKTOR
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


// BUYURTMA
class Order {

    private Customer customer;
    private List<Product> products = new ArrayList<Product>();

    public Order(Customer customer) {
        this.customer = customer;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }


    // JAMINI HISOBLASH
    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    //HISOB FAKTURANI CHOP ETISH
    public void printInvoice() {
        System.out.println(" hisob-faktura " + customer.getName());
        for (Product product : products) {
            System.out.println(" - " + product.getName() + ": $" + product.getPrice());
        }
        System.out.println("Jami: $" + calculateTotal());
    }
}

