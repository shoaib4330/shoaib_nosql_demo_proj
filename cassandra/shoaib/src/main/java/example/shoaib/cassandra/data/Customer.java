package example.shoaib.cassandra.projection;

import lombok.Value;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Table;

@Value
@Table
class Customer {

	@Id String id;
	String firstname, lastname;
}
