package se.patrikbergman.java.logging.slf4j.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class BandBookingService {

	void book(Band band) {
		Logger logger = LoggerFactory.getLogger(BandBookingService.class);

		//Should not be executed since level for current logger is info
		logger.debug("Successfully booked " + band);

		//This should show though
		logger.info("Successfully booked " + band);
	}
}
