package example.shoaib.cassandra.projection;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@EntityScan(basePackageClasses = Customer.class)
class ProjectionConfiguration {
}
