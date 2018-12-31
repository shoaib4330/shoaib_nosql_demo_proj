package example.shoaib.cassandra.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(value = "users")
public class User {

	private @PrimaryKey long id;

	private String firstname;
	private String lastname;
}
