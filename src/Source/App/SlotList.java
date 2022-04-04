package App;

import java.util.ArrayList;

public class SlotList {

    private String studentName;
    private String placeBooked;
    private int size;
    public ArrayList<Booking> bookings;

    public SlotList(String studentName, String placeBooked, int size) {
        this.bookings = new ArrayList<>();
        this.studentName = studentName;
        this.placeBooked = placeBooked;
        this.size = size;
    }

    public String getStudentName() {
        return studentName;
    }
    public String getPlaceBooked() {
        return placeBooked;
    }
    public int getSize() {
        return size;
    }
    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setPlaceBooked(String placeBooked) {
        this.placeBooked = placeBooked;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "student name='" + studentName + '\'' +
                ", place booked='" + placeBooked + '\'' +
                ", size of group=" + size +
                ", bookings=" + bookings +
                '}';
    }

    public boolean addPlayer(Booking booking) {
        bookings.add(booking);
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

