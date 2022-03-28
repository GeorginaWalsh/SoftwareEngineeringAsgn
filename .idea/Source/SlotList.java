import java.util.ArrayList;

public class SlotList {

    private ArrayList<Booking> bookings;

    public SlotList() {
        this.bookings = new ArrayList<Booking>();
    }

    public boolean addBooking(Booking booking) {
        for(Booking existing : bookings) {
            if(existing.getDate() == booking.getDate()) {
                System.out.println("Timeslot for this room is already taken");
                return false;
            }
        }

        this.bookings.add(booking);
        System.out.println("Timeslot booked");
        return true;
    }

    public boolean deleteBooking(Booking booking) {
        bookings.remove(booking);
        return true;
    }
}
