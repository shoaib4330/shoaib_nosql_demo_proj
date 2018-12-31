package example.shoaib.cassandra.events;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EntityScan(basePackageClasses = User.class)
class BasicConfiguration {

//bean creation ka dekho, aksr msla krta he (missing attributes)
	@Bean
	LoggingEventListener listener() {
		return new LoggingEventListener();
	}
}
