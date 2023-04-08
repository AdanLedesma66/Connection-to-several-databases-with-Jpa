package py.com.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import py.com.db.config.MySqlDataSourceConfig;
import py.com.db.config.PostgreDataSourceConfig;

@SpringBootApplication
@Import({MySqlDataSourceConfig.class, PostgreDataSourceConfig.class})
public class DatebasesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatebasesApplication.class, args);
	}

}
