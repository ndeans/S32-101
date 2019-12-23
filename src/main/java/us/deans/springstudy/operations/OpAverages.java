package us.deans.springstudy.operations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import us.deans.springstudy.base.BaseOperation;

public class OpAverages extends BaseOperation {

	static Logger LOG; 
	
	public OpAverages() {
		LOG = LoggerFactory.getLogger(this.getClass().getSimpleName());
	}
	
    public double average(int a, int b) {
        int sum = a + b;
        double avg = (double)sum / 2;
    	return avg;
    }

    public void start() {
    	String s = String.format("%f", average(2,1));
    	LOG.info(s);
    	
    }
    
}
