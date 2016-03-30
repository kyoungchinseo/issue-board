package core.mvc;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import next.controller.HomeController;


public class RequestMapping {
	private static final Logger logger = LoggerFactory.getLogger(DispatcherServlet.class);
	private Map<String, Controller> mappings = new HashMap<>();
	
	void initMapping() {
		mappings.put("/", new HomeController());
		logger.info("Initialized Request Mapping!");
	}
	
	public Controller findController(String url) {
		return mappings.get(url);
	}
	
	void put(String url, Controller controller) {
		mappings.put(url, controller);
	}
}
