package dk.webdriver.framework.dk_framework.tests;

import junit.framework.Assert;

import org.junit.Test;

import dk.webdriver.framework.dk_framework.BrowserDk;
import dk.webdriver.framework.dk_framework.OzonLoginPage;
import dk.webdriver.framework.dk_framework.OzonMainPage;
import dk.webdriver.framework.dk_framework.OzonPersonalAreaPage;

public class ChangeDataTest {

	
	@Test
	public void changeDataT(){
		
		BrowserDk br = new BrowserDk();
		OzonMainPage omp = new OzonMainPage(br);
		omp.navigateToLogin();
		OzonLoginPage olp = new OzonLoginPage(omp.getBrowserDk());
		olp.LogIn("lekstok1@gmail.com", "vivian27");
		Assert.assertEquals(olp.isSuccessLogin(), true);
		olp.goToMainPage();
		olp.navigateToPersonalPage();
		OzonPersonalAreaPage opap = new OzonPersonalAreaPage(olp.getBrowserDk());
		opap.changeData();
		Assert.assertEquals(opap.isSuccessChangeData(), true);
		br.getCurrentDriver().quit();

	}
	
}
