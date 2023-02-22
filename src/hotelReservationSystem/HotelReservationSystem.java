package hotelReservationSystem;

import java.util.Date;
import java.util.List;

/**
 * @project Practical
 * @author: Fathullo To'yliyev on 20/02/2023.
 */
//MEHMONXONA BIRON QILISH SISTEMASI
public class HotelReservationSystem {
    public static void main(String[] args) {
        //ba'zi sinov ma'lumotlarini yaratamiz
        Room room1 = new Room(101, RoomType.SINGLE);
        Room room2 = new Room(102, RoomType.DOUBLE);
        Room room3 = new Room(103, RoomType.SUITE);

        Guest guest1 = new Guest("Java Springov", "+998991234567", "javaspring@gmail.com");
        Guest guest2 = new Guest("Java Testov", "+998991234567", "javaprospring@gmail.com");

        //BRON QILISHLAR
        Reservation reservation1 = new Reservation(guest1, room1, new Date(2023, 02, 20), new Date(2023, 02, 25));
        room1.addReservation(reservation1);

        Reservation reservation2 = new Reservation(guest2, room2, new Date(2023, 01, 20), new Date(2023, 01, 25));
        room2.addReservation(reservation2);

        //MEHMONAXONA YARATISH VA QO'SHISH
        Hotel hotel = new Hotel();
        hotel.addRoom(room1);
        hotel.addRoom(room2);
        hotel.addRoom(room3);

        //MAVJUD XONALARNI TOPISH,VA XONA BRON QILISH
        List<Room> availableRooms = hotel.getAvailableRooms(new Date(2023, 02, 10), new Date(2023, 02, 13));
        if (availableRooms.size() > 0) {
            Room availableRoom = availableRooms.get(0);
            Reservation reservation3 = new Reservation(guest1, availableRoom, new Date(2023, 02, 10), new Date(2023, 02, 13));
            availableRoom.addReservation(reservation3);
            System.out.println("Xona uchun qilingan biron" + availableRoom.getRoomNumber());
        } else {
            System.out.println("Ushbu sanalar uchun xonalar mavjud emas");
        }
    }
}
