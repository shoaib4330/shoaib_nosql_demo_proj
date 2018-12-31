
package example.shoaib.cassandra.udt;

import lombok.Data;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Table;

import com.datastax.driver.core.DataType.Name;
import com.datastax.driver.core.UDTValue;


@Data
@Table
public class Person {

	@Id int id;

	String firstname, lastname;
	Address current;
	List<Address> previous;

	@CassandraType(type = Name.UDT, userTypeName = "address")
	UDTValue alternative;
}
