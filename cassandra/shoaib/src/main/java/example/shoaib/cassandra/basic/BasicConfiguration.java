package example.shoaib.cassandra.basic;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EntityScan(basePackageClasses = User.class)
class BasicConfiguration {
}
