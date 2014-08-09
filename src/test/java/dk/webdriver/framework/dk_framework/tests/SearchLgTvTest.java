package dk.webdriver.framework.dk_framework.tests;

import junit.framework.Assert;


//import org.junit.After;
//import org.junit.Before;
import org.junit.Test;

import dk.webdriver.framework.dk_framework.BrowserDk;
import dk.webdriver.framework.dk_framework.OzonElectronicPage;
import dk.webdriver.framework.dk_framework.OzonMainPage;
import dk.webdriver.framework.dk_framework.OzonTvPage;


public class SearchLgTvTest {
	
	
	@Test
	public void searchLgTv(){
		
		BrowserDk br = new BrowserDk();
		OzonMainPage omp = new OzonMainPage(br);
		omp.navigateToElectronicSection();
		OzonElectronicPage oep = new OzonElectronicPage(omp.getBrowserDk());
		oep.navigateToTvSection();
		OzonTvPage otp = new OzonTvPage(oep.getBrowserDk());
		otp.selectLgTv();
		Assert.assertEquals(otp.isLgTv(), true);
		br.getCurrentDriver().quit();
		
	}
	
	

}
