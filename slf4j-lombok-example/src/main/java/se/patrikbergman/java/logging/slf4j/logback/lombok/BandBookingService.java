package se.patrikbergman.java.logging.slf4j.logback.lombok;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class BandBookingService {

	void book(Band band) {

		//Should not be executed since level for current logger is info
		log.debug("Successfully booked " + band);

		//This should show though
		log.info("Successfully booked " + band);
	}
}
