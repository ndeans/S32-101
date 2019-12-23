package us.deans.springstudy.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiClientAnnotated {

	private IGreetingService service;
	
	@Autowired
	public void setService(IGreetingService gs){
		this.service = gs;
	}
	
	public String hello() {
		return service.getGreeting();
	}
}
