package dk.webdriver.framework.dk_framework.tests;

import junit.framework.Assert;

import org.junit.Test;

import dk.webdriver.framework.dk_framework.BrowserDk;
import dk.webdriver.framework.dk_framework.OzonCartPage;
import dk.webdriver.framework.dk_framework.OzonElectronicPage;
import dk.webdriver.framework.dk_framework.OzonLoginPage;
import dk.webdriver.framework.dk_framework.OzonMainPage;
import dk.webdriver.framework.dk_framework.OzonTvPage;

public class AddToCartTest {
	
	
	@Test
	public void addToCart(){
		
		BrowserDk br = new BrowserDk();
		OzonMainPage omp = new OzonMainPage(br);
		omp.navigateToLogin();
		OzonLoginPage olp = new OzonLoginPage(omp.getBrowserDk());
		olp.LogIn("lekstok1@gmail.com", "vivian27");
		Assert.assertEquals(olp.isSuccessLogin(), true);
		olp.goToMainPage();
		olp.navigateToElectronicSection();
		OzonElectronicPage oep = new OzonElectronicPage(olp.getBrowserDk());
		oep.navigateToTvSection();
		OzonTvPage otp = new OzonTvPage(oep.getBrowserDk());
		otp.selectLgTv();
		Assert.assertEquals(otp.isLgTv(), true);
		otp.putInCart(otp.getBrowserDk());
		otp.navigateToCartPage();
		OzonCartPage ocp = new OzonCartPage(otp.getBrowserDk());
		Assert.assertEquals(ocp.IsEmpty(), false);
		br.getCurrentDriver().quit();

	}
		
		
	

}
