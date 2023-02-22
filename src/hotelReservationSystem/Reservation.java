package hotelReservationSystem;

import java.util.Date;

/**
 * @project Practical
 * @author: Fathullo To'yliyev on 20/02/2023.
 */
public class Reservation {

    private Guest guest;
    private Room room;
    private Date startDate;//KELGAN SANASI
    private Date endDate;//KETGAN SANASI

    public Reservation(Guest guest, Room room, Date startDate, Date endDate) {
        this.guest = guest;
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Guest getGuest() {
        return guest;
    }

    public Room getRoom() {
        return room;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    //bu metod ikkita Date obyektining sanalarini solishtirish uchun ishlatiladi.
    public boolean overlapsWith(Date startDate, Date endDate) {
        return (this.startDate.before(endDate) && startDate.before(this.endDate));
    }
    /**
     Bu kodda qanday ishlaydi:

     this.startDate.before(endDate) overlapsWith metodiga uzatilgan endDate argumenti joriy
     biron qilish misolining boshlanish sanasidan keyin ekanligini tekshiradi.

     startDate.before(this.endDate) overlapsWith metodiga oʻtkazilgan startDate argumenti joriy
     biron qilish instansiyasining tugash sanasidan oldin ekanligini tekshiradi.

     Agar bu tekshirishlarning ikkalasi ham toʻgʻri boʻlsa, bu joriy band qilish sanasi diapazoni
     va overlapsWith metodida koʻrsatilgan sana oraligʻi oʻrtasida biroz oʻxshashlik borligini bildiradi.
     overlapsWith metodi bir-biriga o‘xshashlik mavjudligini ko‘rsatish uchun true qiymatini qaytaradi,
     aks holda u hech qanday o‘xshashlik yo‘qligini bildirish uchun false qiymatini qaytaradi.
     */
}
