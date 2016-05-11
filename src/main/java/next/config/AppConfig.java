package next.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages= {"next.service","next.dao"})
public class AppConfig {

	private static final String DB_DRIVER = "org.h2.driver";
	private static final String DB_URL = "jdbc:h2:~/issue-board;AUTO_SERVER=TRUE";
	private static final String DB_USERNAME = "sa";
	private static final String DB_PW = "";
	

	@Bean
	public DataSource dataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(DB_DRIVER);
		ds.setUrl(DB_URL);
		ds.setUsername(DB_USERNAME);
		ds.setPassword(DB_PW);
		return ds;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
	
}
