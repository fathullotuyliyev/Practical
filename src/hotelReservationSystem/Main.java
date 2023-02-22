package hotelReservationSystem;

import java.util.Date;

/**
 * @project Practical
 * @author: Fathullo To'yliyev on 21/02/2023.
 */
public class Main {


    public static void main(String[] args) {
        Hotel hotel = new Hotel("My Hotel");

        Room room1 = new Room(101, RoomType.SINGLE);
        Room room2 = new Room(102, RoomType.DOUBLE);
        Room room3 = new Room(103, RoomType.TWIN);
        Room room4 = new Room(104, RoomType.SUITE);

        hotel.addRoom(room1);
        hotel.addRoom(room2);
        hotel.addRoom(room3);
        hotel.addRoom(room4);

        Guest guest3 = new Guest("John Smith", "john@example.com");
        Guest guest4 = new Guest("Jane Doe", "jane@example.com");

        Date startDate1 = new Date(123456789); // replace with actual timestamp
        Date endDate1 = new Date(234567890); // replace with actual timestamp
        Reservation reservation1 = hotel.makeReservation(guest3, RoomType.SINGLE, startDate1, endDate1);

        if (reservation1 != null) {
            System.out.println("Reservation made for " + reservation1.getGuest().getName() +
                    " in room " + reservation1.getRoom().getRoomNumber() +
                    " from " + reservation1.getStartDate() + " to " + reservation1.getEndDate());
        } else {
            System.out.println("No rooms available for the selected dates.");
        }

        Date startDate2 = new Date(345678901); // replace with actual timestamp
        Date endDate2 = new Date(456789012); // replace with actual timestamp
        Reservation reservation2 = hotel.makeReservation(guest3, RoomType.TWIN, startDate2, endDate2);

        if (reservation2 != null) {
            System.out.println("Reservation made for " + reservation2.getGuest().getName() +
                    " in room " + reservation2.getRoom().getRoomNumber() +
                    " from " + reservation2.getStartDate() + " to " + reservation2.getEndDate());
        } else {
            System.out.println("No rooms available for the selected dates.");
        }
    }
}
