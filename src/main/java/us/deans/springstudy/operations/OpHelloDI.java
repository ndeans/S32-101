package us.deans.springstudy.operations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import us.deans.springstudy.base.BaseOperation;
import us.deans.springstudy.support.DiClientAnnotated;
import us.deans.springstudy.support.DiClientRegistered;

public class OpHelloDI extends BaseOperation {

	private String greeting;
	static Logger LOG; 
	
	public OpHelloDI() {
		super();
		LOG = LoggerFactory.getLogger(this.getClass().getSimpleName());
	}
	
	public void start(int opt) {
		ApplicationContext context;
		BeanFactory factory;
		
		switch (opt) {
			case 0:
				context = new ClassPathXmlApplicationContext("META-INF/context_scan.xml");
				factory = context;
				DiClientAnnotated clientA = (DiClientAnnotated) factory.getBean("diClientAnnotated");
				
				greeting = clientA.hello();
				LOG.info(greeting);
				break;	
				
			case 1:
				context = new ClassPathXmlApplicationContext("META-INF/context_beans.xml");
				factory = context;
				DiClientRegistered clientB = (DiClientRegistered) factory.getBean("diClientRegistered"); 
				
				greeting = clientB.hello();
				LOG.info(greeting);
				break;
				
		}
	}
}
