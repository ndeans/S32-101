package us.deans.springstudy.support;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService{

	public String getGreeting() {
		return "How are you doing today?";
	}
	
}
