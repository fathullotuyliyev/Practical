package hotelReservationSystem;

/**
 * @project Practical
 * @author: Fathullo To'yliyev on 20/02/2023.
 */
public enum RoomType {
    SINGLE("Single"),
    DOUBLE("Double"),
    TWIN("Twin"),
    SUITE("Suite");

    private String displayName;

    RoomType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
