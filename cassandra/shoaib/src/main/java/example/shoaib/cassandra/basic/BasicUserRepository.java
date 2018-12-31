package example.shoaib.cassandra.basic;

import java.util.List;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface BasicUserRepository extends CrudRepository<User, Long> {

	String testString = "Shoaib";
	
	@Query("SELECT * from users where user_id in(?0)")
	User findUserByIdIn(long id);

	User findUserByUsername(String username);

	List<User> searchnameShoaib(String lastnamePrefix);
	
	List<User> findUsersByLastnameStartsWith(String lastnamePrefix);
}
