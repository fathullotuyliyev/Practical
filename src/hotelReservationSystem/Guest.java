package hotelReservationSystem;

/**
 * @project Practical
 * @author: Fathullo To'yliyev on 20/02/2023.
 */
//MEHMONLAR-KLIENTLAR
public class Guest {

    private String name;//ISMI
    private String phoneNumber;//TELEFON RAQAMI
    private String email;//ELEKTRON POCHTASI

    public Guest(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Guest(String john_smith, String phoneNumber) {

    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
