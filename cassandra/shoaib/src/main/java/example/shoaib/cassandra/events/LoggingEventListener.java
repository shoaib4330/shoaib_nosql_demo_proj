
package example.shoaib.cassandra.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.data.cassandra.core.mapping.event.AbstractCassandraEventListener;
import org.springframework.data.cassandra.core.mapping.event.AfterConvertEvent;
import org.springframework.data.cassandra.core.mapping.event.AfterDeleteEvent;
import org.springframework.data.cassandra.core.mapping.event.AfterLoadEvent;
import org.springframework.data.cassandra.core.mapping.event.AfterSaveEvent;
import org.springframework.data.cassandra.core.mapping.event.BeforeDeleteEvent;
import org.springframework.data.cassandra.core.mapping.event.BeforeSaveEvent;


public class LoggingEventListener extends AbstractCassandraEventListener<Object> {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingEventListener.class);

	@Override
	public void onBeforeSave(BeforeSaveEvent<Object> event) {
		LOGGER.info("onBeforeSave: {}, {}", event.getSource(), event.getStatement());
	}


	@Override
	public void onAfterSave(AfterSaveEvent<Object> event) {
		LOGGER.info("onAfterSave: {}", event.getSource());
	}

	@Override
	public void onBeforeDelete(BeforeDeleteEvent<Object> event) {
		LOGGER.info("onBeforeDelete: {}", event.getSource());
	}

	@Override
	public void onAfterDelete(AfterDeleteEvent<Object> event) {
		LOGGER.info("onAfterDelete: {}", event.getSource());
	}

	@Override
	public void onAfterLoad(AfterLoadEvent<Object> event) {
		LOGGER.info("onAfterLoad: {}", event.getSource());
	}

	@Override
	public void onAfterConvert(AfterConvertEvent<Object> event) {
		LOGGER.info("onAfterConvert: {}", event.getSource());
	}
}
