package example.shoaib.cassandra.udt;

import lombok.AllArgsConstructor;
import lombok.Data;

import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@Data
@UserDefinedType
@AllArgsConstructor
public class Address {

	String street, zip, city;
}
