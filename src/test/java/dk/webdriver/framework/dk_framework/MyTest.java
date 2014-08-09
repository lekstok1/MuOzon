package dk.webdriver.framework.dk_framework;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;


public class MyTest {
	
	
//	private int i;
//	private int b;
//	
//	@Before 	
//	public void init(){
//		
//		i = 3;
//		b = 5;
//		
//	}
	
	
	@Test
	public void myTest() {
        int i = 3;
        int b = 5;
		int c = i+b;
		Assert.assertEquals(My.sum(), c);
 
	}

}
