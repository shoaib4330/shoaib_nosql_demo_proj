package example.shoaib.mongodb.projections;

import java.util.Collection;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;


interface CustomerRepository extends CrudRepository<Customer, ObjectId> {

//kuch methods removed hen, also placed on demo version on bitbucket.
	Collection<CustomerProjection> findAllProjectedBy();

	Collection<CustomerSummary> findAllSummarizedBy();

	Collection<CustomerDto> findAllDtoedBy();
}
