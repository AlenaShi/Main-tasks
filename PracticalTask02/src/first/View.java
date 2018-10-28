package first;

import org.apache.log4j.Logger;

public class View {
	public static final Logger LOG = Logger.getRootLogger();
	public static void log(String msg) {
		LOG.info(msg);
	}
}
