package logInjection;

import java.util.logging.Logger;

public class LogTest1 {

	private static final Logger log = Logger.getLogger(LogTest1.class.getName());

	public void logTest1(String userInput) {
		log.info("log massage: " + userInput);
	}
}