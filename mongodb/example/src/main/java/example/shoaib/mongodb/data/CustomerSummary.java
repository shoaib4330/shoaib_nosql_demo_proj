package example.shoaib.mongodb.projections;

import org.springframework.beans.factory.annotation.Value;

interface CustomerSummary {

	@Value("#{target.firstname + ' ' + target.lastname}")
	String getFullName();
}
