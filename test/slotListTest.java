import App.Booking;
import App.Room;
import App.SlotList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class slotListTest {
    private SlotList list1, list2;
    Booking booking1 = new Booking("Tom", "March 02", "2:00", "library", 2);
    Booking booking2 = new Booking("Jerry", "April 20", "4:00", "ITG01", 4);

    @BeforeEach
    void setUp() {
        list1 = new SlotList();
        list2 = new SlotList();
    }

    @Test
    public void testAdd() {
        list1.addBooking(booking1);
        list2.addBooking(booking2);

        assertTrue(list1.getBookings().contains(booking1));
        assertFalse(list1.getBookings().contains(booking2));

        assertTrue(list2.getBookings().contains(booking2));
        assertFalse(list2.getBookings().contains(booking1));
    }

    @Test
    public void testDelete(){
        list1.addBooking(booking1);
        list1.addBooking(booking2);

        assertTrue(list1.getBookings().contains(booking1));
        list1.deleteBooking(booking1);
        assertFalse(list1.getBookings().contains(booking1));

        assertTrue(list1.getBookings().contains(booking2));
    }

    @Test
    public void testListSetter(){
        list1.addBooking(booking1);
        assertEquals("Tom", list1.getBookings().get(0).getName());
        list2.addBooking(booking2);
        assertEquals("Jerry", list2.getBookings().get(0).getName());

        list2.setBookings(list1.getBookings());
        assertEquals("Tom", list2.getBookings().get(0).getName());
    }

    @Test
    public void testBookingSetter(){
        list1.addBooking(booking1);
        assertEquals("Tom", list1.getBookings().get(0).getName());

        list1.getBookings().get(0).setName("Brutus");
        assertEquals("Brutus", list1.getBookings().get(0).getName());
    }
}
