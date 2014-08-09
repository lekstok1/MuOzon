package dk.webdriver.framework.dk_framework.tests;

import junit.framework.Assert;

import org.junit.Test;

import dk.webdriver.framework.dk_framework.BrowserDk;
import dk.webdriver.framework.dk_framework.OzonCartPage;
import dk.webdriver.framework.dk_framework.OzonLoginPage;
import dk.webdriver.framework.dk_framework.OzonMainPage;

public class DeleteFromCartTest {

	
	@Test
	public void deleteFromCart(){
		
		BrowserDk br = new BrowserDk();
		OzonMainPage omp = new OzonMainPage(br);
		omp.navigateToLogin();
		OzonLoginPage olp = new OzonLoginPage(omp.getBrowserDk());
		olp.LogIn("lekstok1@gmail.com", "vivian27");
		Assert.assertEquals(olp.isSuccessLogin(), true);
		olp.goToMainPage();
		olp.navigateToCartPage();
		OzonCartPage ocp = new OzonCartPage(olp.getBrowserDk());
		ocp.deleteFromCart();
		Assert.assertEquals(ocp.IsEmpty(), true);
		br.getCurrentDriver().quit();

	}
	
	
}
