package testNgPract;

import org.testng.Assert;
import org.testng.annotations.Test;

public class retryPrac {

	@Test(retryAnalyzer=generalUtility.retry_analyser.class)
	
	public void t1(){
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void t2(){
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void t3(){
		Assert.assertEquals(true, true);
	}
	
}
