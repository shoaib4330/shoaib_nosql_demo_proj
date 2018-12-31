
package example.shoaib.cassandra.projection;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.repository.CrudRepository;

interface CustomerRepository extends CrudRepository<Customer, String> {

	Collection<CustomerProjection> findAllProjectedBy();
	
	Collection<CustomerSummary> findAllSummarizedBy();
}
