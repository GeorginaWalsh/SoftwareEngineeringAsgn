import App.Room;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class roomTest {


    private Room room1, room2;

    /*
     * Method to set up data for testing.
     */

    /*
            * Test method for Booking constructor
=======
private booking booking1, booking2;

     /
     * Method to set up data for testing.
     */
    @BeforeEach
    void setUp() {
        room1 = new Room("A2", "2", "Elevator");
        room2 = new Room("B7", "1", "Wheelchair Access Queues");
    }

    /*
            * Test method for Booth constructor
     */
    @Test
    public void testConstructor() {

        assertEquals("A2", room1.getId());
        assertEquals("2", room1.getFloor());
        assertEquals("Elevator", room1.getAccessible());

    }

    /**
     * Test method for getter methods
     */

    @Test
    void getId() {
        assertEquals("B7", room2.getId());
    }

    @Test
    void getFloor() {
        assertEquals("1", room2.getFloor());
    }

    @Test
    void getAccessible() {
        assertEquals("Wheelchair Access Queues", room2.getAccessible());
    }
}