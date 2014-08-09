package dk.webdriver.framework.dk_framework.tests;

import junit.framework.Assert;

import org.junit.Test;

import dk.webdriver.framework.dk_framework.BrowserDk;
import dk.webdriver.framework.dk_framework.OzonCartPage;
import dk.webdriver.framework.dk_framework.OzonMainPage;

public class CartIsEmptyTest {
	
	
	@Test
	public void cartIsEmpty(){
		
		 BrowserDk br = new BrowserDk();	
		OzonMainPage omp = new OzonMainPage(br);
		omp.navigateToCartPage();
		OzonCartPage ocp = new OzonCartPage(omp.getBrowserDk());
		Assert.assertEquals(ocp.IsEmpty(), true);
		br.getCurrentDriver().quit();

		
	}

}
