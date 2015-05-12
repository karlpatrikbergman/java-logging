package se.patrikbergman.java.logging.slf4j.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class BandBookingService {

	void book(Band band) {
		Logger logger = LoggerFactory.getLogger(BandBookingService.class);
		logger.info("Successfully booked " + band);
	}
}
