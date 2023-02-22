package hotelReservationSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @project Practical
 * @author: Fathullo To'yliyev on 20/02/2023.
 */
//MEHMONXONA
public class Hotel {
    private String name;
    public List<Room> rooms;//XONALAR RO'YXATI LIST TIPIDA

    public Hotel(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();

    }

    public Hotel() {
    }

    public String getName() {
        return name;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    //MAVJUD XONALAR RO'YXATINI OLISH
    public List<Room> getAvailableRooms(Date startDate, Date endDate) {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) { // XONALAR RO'YXATINI FOR ICHIDA AYLANIB CHIQADI
            if (room.isAvailable(startDate, endDate)) {// AGAR USHBU SANADA KELGAN YOKI KETGAN MIJOZLAR BO'LSA XONALAR BO'LIMIGA QO'SH
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    //Mavjud xonalardan birida mehmon uchun bron yaratadi.
    public Reservation makeReservation(Guest guest, RoomType roomType, Date startDate, Date endDate) {
        List<Room> availableRooms = getAvailableRooms(startDate, endDate);
        if (availableRooms.isEmpty()) {
            return null;
        }
        Room room = availableRooms.get(0);
        return new Reservation(guest, room, startDate, endDate);
    }
}