package corejava;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;

public class Logger1 {
	public static Logger logger = Logger.getLogger(Logger.class.getName());
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("info");
		logger.error("error");
		logger.warn("warn");
		logger.fatal("fatal");
	}
}
