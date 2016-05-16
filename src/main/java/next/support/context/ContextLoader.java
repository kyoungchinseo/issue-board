package next.support.context;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.stereotype.Component;

@Component
public class ContextLoader {
	
	private static final Logger log = LoggerFactory.getLogger(ContextLoader.class);
	
	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	public void contextInitialized() {
		ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
		populator.addScript(new ClassPathResource("issue-board-create.sql"));
		populator.addScript(new ClassPathResource("issue-board-insert.sql"));
		DatabasePopulatorUtils.execute(populator, dataSource);
		
		log.debug("database initialized");
		
	}
}
