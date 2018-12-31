package example.shoaib.cassandra.convert;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.cassandra.core.mapping.Element;
import org.springframework.data.cassandra.core.mapping.Tuple;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Tuple
public class Address {

//isko badme remove krke dekhna he, if still works
	@Element(0) String address;
	@Element(1) String city;
	@Element(2) String zip;
}
