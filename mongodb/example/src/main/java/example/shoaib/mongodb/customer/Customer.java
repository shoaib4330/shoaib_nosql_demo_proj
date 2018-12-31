package example.shoaib.mongodb.customer;

import lombok.Data;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.util.Assert;

@Data
@Document
public class Customer {

	private String id, firstname, lastname;
	private Address address;

	public Customer(String firstname, String lastname) {

		Assert.hasText(firstname, "first name khali he");
		Assert.hasText(lastname, "last name khali he");

		this.firstname = firstname;
		this.lastname = lastname;
	}
}
