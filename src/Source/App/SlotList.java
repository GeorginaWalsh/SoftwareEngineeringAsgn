package App;

import java.util.ArrayList;

public class SlotList {

    private String studentName;
    private String placeBooked;
    private int size;
    private ArrayList<Booking> bookings;

    public SlotList() {
        bookings = new ArrayList<>();
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }

    public boolean addBooking(Booking booking) {
        this.bookings.add(booking);
        return true;
    }

    public boolean deleteBooking(Booking booking) {
        bookings.remove(booking);
        return true;
    }

    public String listOfBookings() {
        if (bookings.size() == 0) {
            return "There are no bookings currently made.";
        } else {
            StringBuilder bookingList = new StringBuilder();
            for (int i=0; i < bookings.size(); i++) {
                bookingList.append(i).append(": ").append(bookings.get(i)).append("\n");
            }
            return bookingList.toString();
        }
    }

}

