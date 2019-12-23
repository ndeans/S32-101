package us.deans.springstudy.tests;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import us.deans.springstudy.operations.OpAverages;

public class OpAveragesTest {

	@Test
	public void testAverages() {
		
		OpAverages av = new OpAverages();
		double x = av.average(2, 1);
		System.out.println(av.average(2,1));
		assertTrue(x == 1.5);
	}

}
