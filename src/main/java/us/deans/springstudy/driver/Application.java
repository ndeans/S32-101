package us.deans.springstudy.driver;

import us.deans.springstudy.operations.OpAverages;
import us.deans.springstudy.operations.OpHelloDI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

	static final Logger LOG = LoggerFactory.getLogger("App");
	
	public static void main(String[] args) {
		
		System.out.println("Hello.");

		// logging
		LOG.trace("Hello World!");
		LOG.debug("How are you today?");
		LOG.info("I am fine.");
		LOG.warn("I love programming.");
		LOG.error("I am programming.");
		
		// averages
		OpAverages a = new OpAverages();
		LOG.info("Print averages (integers to doubles)...");
		a.start();
		
		// Dependency Injection: Spring
		LOG.info("Dependency Injection...");
		OpHelloDI dia = new OpHelloDI();
		
		// Dependency Injection: Spring/Annotation
		dia.start(0);
		
		// Dependency Injection: Spring/XML		
		dia.start(1);
		
	}

}
