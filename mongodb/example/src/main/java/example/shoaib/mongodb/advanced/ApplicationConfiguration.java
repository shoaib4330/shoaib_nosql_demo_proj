package example.shoaib.mongodb.advanced;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoOperations;

import com.mongodb.MongoClient;

@SpringBootApplication
class ApplicationConfiguration {

	static final String SYSTEM_PROFILE_DB = "system.profile";

	@Autowired MongoOperations operations;

	@PostConstruct
	public void initializeWithDefaults() {

		// zruri nai he wese, profiling explanation pri he on, bitbucket-shoaib-tutorial wali repo pr
		setProfilingLevel(2);
	}


	@PreDestroy
	public void cleanUpWhenShuttingDown() {

		setProfilingLevel(0);

		if (operations.collectionExists(SYSTEM_PROFILE_DB)) {
			operations.dropCollection(SYSTEM_PROFILE_DB);
		}
	}

	private void setProfilingLevel(int level) {
		operations.executeCommand(new Document("profile", level));
	}
}
