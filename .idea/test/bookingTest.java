import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class bookingTest {

        /**
         * Method to set up data for testing.
         */
        @BeforeEach
        void setUp() {
            centre1 = new VacCentre("WIT Arena", "Carriganore, Waterford", "X91XD96", "240");
            centre2 = new VacCentre("The Hub Kilkenny", "Cillín Hill, Kilkenny", "R95A4VP", "120");
            booking1 = new Booking("name", "12:00", "lib", false);
        }

        /**
         * Test method for Centre constructor
         */
        @Test
        public void testConstructor() {

            assertEquals("WIT Arena", centre1.getName());
            assertEquals("Carriganore, Waterford", centre1.getAddress());
            assertEquals("X91XD96", centre1.getEircode());
            assertEquals("240", centre1.getCar());

        }

        /**
         * Test method for getter methods
         */

        @Test
        public void getName(){
            assertEquals("The Hub Kilkenny", centre2.getName());
        }

        @Test
        public void getAddress(){
            assertEquals("Cillín Hill, Kilkenny", centre2.getAddress());
        }

        @Test
        public void getEircode(){
            assertEquals("R95A4VP", centre2.getEircode());
        }

        @Test
        public void getCar(){
            assertEquals("120", centre2.getCar());
        }

    }

}
