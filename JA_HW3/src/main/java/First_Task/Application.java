package First_Task;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Application {

	private static Logger Log = Logger.getLogger(Application.class);
	
	public static void main(String[] args) {
		logWithDomConfigurator();
	}
	
	public static void  logWithDomConfigurator(){
        DOMConfigurator.configure("LoggerConfig.xml");
        
        Log.debug("Debug logger message of project");
        Log.info("Info logger message of project");
        Log.warn("Warn logger message of project");
        Log.error("Error logger message of project");
    }

}
