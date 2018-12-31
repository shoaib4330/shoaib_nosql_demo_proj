package example.shoaib.mongodb.customer;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import org.springframework.data.geo.Point;

@Getter
@RequiredArgsConstructor
public class Address {

	private final Point location;
	private String street;
	private String zipCode;
}
