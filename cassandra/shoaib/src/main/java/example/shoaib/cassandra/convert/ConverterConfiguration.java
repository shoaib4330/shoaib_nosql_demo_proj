package example.shoaib.cassandra.convert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.cassandra.core.convert.CassandraCustomConversions;
import org.springframework.util.StringUtils;

import com.datastax.driver.core.Row;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
@EntityScan(basePackageClasses = Addressbook.class)
class ConverterConfiguration {

	@Bean
	public CassandraCustomConversions customConversions() {

		List<Converter<?, ?>> converters = new ArrayList<>();
		converters.add(new PersonWriteConverter());
		converters.add(new PersonReadConverter());
		converters.add(new CustomAddressbookReadConverter());
		converters.add(CurrencyToStringConverter.INSTANCE);
		converters.add(StringToCurrencyConverter.INSTANCE);

		return new CassandraCustomConversions(converters);
	}

	static class PersonWriteConverter implements Converter<Contact, String> {

		public String convert(Contact source) {

			try {
				return new ObjectMapper().writeValueAsString(source);
			} catch (IOException e) {
				throw new IllegalStateException(e);
			}
		}
	}

	static class PersonReadConverter implements Converter<String, Contact> {

		public Contact convert(String source) {

			if (StringUtils.hasText(source)) {
				try {
					return new ObjectMapper().readValue(source, Contact.class);
				} catch (IOException e) {
					throw new IllegalStateException(e);
				}
			}
			return null;
		}
	}

	//iska converter likhna he, all crap goes to db
	static class CustomAddressbookReadConverter implements Converter<Row, CustomAddressbook> {

		public CustomAddressbook convert(Row source) {

			CustomAddressbook result = new CustomAddressbook();

			result.setTheId(source.getString("id"));
			result.setMyDetailsAsJson(source.getString("me"));

			return result;
		}
	}
}
