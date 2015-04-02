package se.patrikbergman.java.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BandBean {

	public void book(Band band) {
		Logger logger = LoggerFactory.getLogger(BandBean.class);
		logger.info("Hello World");
	}


	public static void main(String args[]) {
		Band blackFlag = new Band("Black Flag", "An American hardcore punk band formed in 1976 in Hermosa Beach");
		BandBean bandBean = new BandBean();
		bandBean.book(blackFlag);


	}
}
