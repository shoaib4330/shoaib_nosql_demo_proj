package example.shoaib.cassandra.projection;

import org.springframework.beans.factory.annotation.Value;

interface CustomerSummary {

	@Value("#{target.firstname + ' ' + target.lastname}")
	String getFullName();
}
