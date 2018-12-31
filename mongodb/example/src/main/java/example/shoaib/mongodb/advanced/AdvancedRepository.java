package example.shoaib.mongodb.advanced;

import java.util.List;

import org.springframework.data.mongodb.repository.Meta;

import example.shoaib.mongodb.customer.Customer;
import example.shoaib.mongodb.customer.CustomerRepository;

public interface AdvancedRepository extends CustomerRepository {

	// ye ignored he, borrowed that wese b, look into it later.
	String META_COMMENT = "s2gx-2014-rocks!";

	@Meta(comment = META_COMMENT)
	List<Customer> findByFirstname(String firstname);
}
