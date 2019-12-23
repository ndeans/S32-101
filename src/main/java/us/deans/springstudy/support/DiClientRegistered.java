package us.deans.springstudy.support;

public class DiClientRegistered {

	private IGreetingService service;
	
	public void setService(IGreetingService gs){
		this.service = gs;
	}
	
	public String hello() {
		return service.getGreeting();
	}
}
