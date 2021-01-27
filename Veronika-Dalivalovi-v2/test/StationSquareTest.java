import ge.edu.btu.Passenger;
import ge.edu.btu.Train;
import org.junit.Test;

import static org.junit.Assert.*;

public class StationSquareTest {
    @Test
    public void haveTicketTest(){
        Passenger veronika = new Passenger("Veronika", true);
        Train train = new Train();
        train.addPassenger(veronika);
        assertTrue(veronika.haveTicket());
        assertTrue(train.getPassengerList().contains(veronika));
    }

    @Test
    public void haveNoTicketTest(){
        Passenger nata = new Passenger("Nata", false);
        Train train = new Train();
        train.addPassenger(nata);
        assertFalse(nata.haveTicket());
        assertFalse(train.getPassengerList().contains(nata));
    }
}
