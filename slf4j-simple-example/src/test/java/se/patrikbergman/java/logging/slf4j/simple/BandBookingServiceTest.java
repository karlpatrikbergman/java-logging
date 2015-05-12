package se.patrikbergman.java.logging.slf4j.simple;

import org.junit.Before;
import org.junit.Test;

public class BandBookingServiceTest {

    private BandBookingService bandBookingService;

    @Before
    public void setup() {
        bandBookingService = new BandBookingService();
    }

    @Test
    public void bookBand() {
        final Band blackFlag = new Band("Black Flag", "An American hardcore punk band formed in 1976 in Hermosa Beach");
        bandBookingService.book(blackFlag);
    }
}
