package example.shoaib.cassandra.convert;

import lombok.Data;

import java.util.Currency;
import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@Table
public class Addressbook {

	@Id String id;

	Contact me;
	List<Contact> friends;

	Address address;
	Map<Integer, Currency> preferredCurrencies; //ye populate nai horha, refer bookmarked stackoverflow link on this
}
