package hotelReservationSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @project Practical
 * @author: Fathullo To'yliyev on 18/02/2023.
 */
//XONA
public class Room {
    private int roomNumber;//XONA RAQAMI
    private RoomType roomType;//XONA TURI
    private List<Reservation> reservations;//BRON QILISH RO'YAXATI


    // Berilgan raqam va turdagi va bo'sh bandlov ro'yxati bilan xonani ishga tushiradigan konstruktor
    public Room(int roomNumber, RoomType roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.reservations = new ArrayList<>();

    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    // MIJOZNING KELGAN SANASI VA KETGAN SANASI MAVJUDLIGINI TEKSHIRISH
    public boolean isAvailable(Date startDate, Date endDate) {
        for (Reservation reservation : reservations) { // MIJOZNINIG KELGAN SANASI VA KETGAN SANASINI FOR ICHIDA BITTALAB AYLANIB TEKSHIRIB CHIQADI
            if (reservation.overlapsWith(startDate, endDate)) { //AGAR BIRON QILINGAN
                return false;
            }
        }
        return true;
    }

    // Xonani band qilish roʻyxatiga bandlov qoʻshadi.
    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }



}
