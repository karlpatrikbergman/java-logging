package se.patrikbergman.java.logging.slf4j.simple;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class FestivalService {

    public FestivalService() {
        log.info("In FestivalService constructor");
    }
}
