import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class bookingTest {

    private booking booking1, booking2;

        /**
         * Method to set up data for testing.
         */
        @BeforeEach
        void setUp() {
            booking1 = new booking("ry100", "Nov 12", "12:00", "Library", 5);
            booking2 = new booking("lelio0", "Jan 26", "13:45", "CMLC", 1);
        }

        /**
         * Test method for Booking constructor
         */
        @Test
        public void testConstructor() {

            assertEquals("ry100",  booking1.getName());
            assertEquals("Nov 12", booking1.getDate());
            assertEquals("12:00", booking1.getTime());
            assertEquals("Library", booking1.getLocation());
            assertEquals(5, booking1.getGroup());

        }

        /**
         * Test method for getter methods
         */

        @Test
        public void getName(){
            assertEquals("lelio0", booking2.getName());
        }

        @Test
        public void getDate(){
            assertEquals("Jan 26", booking2.getDate());
        }

        @Test
        public void getTime(){
            assertEquals("13:45", booking2.getTime());
        }

        @Test
        public void getLocation(){
            assertEquals("CMLC", booking2.getLocation());
        }

        @Test
        public void getGroup(){
            assertEquals(1, booking2.getGroup());
        }
}

