package se.patrikbergman.java.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BandBookingService {

	public void book(Band band) {
		Logger logger = LoggerFactory.getLogger(BandBookingService.class);
		logger.info("Successfully booked " + band);
	}
}
