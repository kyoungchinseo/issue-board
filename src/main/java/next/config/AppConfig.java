package next.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.core.JdbcTemplate;

//@ComponentScan(basePackages= {"next.service","next.dao"})


@Configuration
@PropertySource("classpath:/application.properties")
@ComponentScan(basePackages= {"next.support","next.dao"})
public class AppConfig {

	@Value("${DB_DRIVER:default}")
	private String DB_DRIVER;
	
	@Value("${DB_URL:default}")
	private String DB_URL;
	
	@Value("${DB_USERNAME:default}")
	private String DB_USERNAME;
	
	@Value("${DB_PW:default}")
	private String DB_PW;
	

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
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
