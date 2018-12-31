package example.shoaib.mongodb.customer;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.GeoResults;
import org.springframework.data.geo.Point;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<Customer, String> {

	List<Customer> findByLastname(String lastname, Sort sort);

	// ye method, me use nahi krha, it will throw an error, have to figure out what and why that is!
	GeoResults<Customer> findByAddressLocationNear(Point point, Distance distance);
}
