package dk.webdriver.framework.dk_framework;

import junit.framework.Assert;

import org.junit.Test;


//@Suite.SuiteClasses( LoginTest.class)
//@RunWith(Suite.class)
public class AppTest {
	
	public static void main(String[] args) {
		 
		BrowserDk br = new BrowserDk();
		OzonMainPage omp = new OzonMainPage(br);
		omp.navigateToElectronicSection();
		OzonElectronicPage oep = new OzonElectronicPage(omp.getBrowserDk());
		oep.navigateToTvSection();
		OzonTvPage otp = new OzonTvPage(oep.getBrowserDk());
		otp.selectLgTv();
		Assert.assertEquals(otp.isLgTv(), true);
		otp.putInCart(otp.getBrowserDk());
		otp.navigateToCartPage();
		OzonCartPage ocp = new OzonCartPage(otp.getBrowserDk());
		Assert.assertEquals(ocp.IsEmpty(), false);
	}
 

}
