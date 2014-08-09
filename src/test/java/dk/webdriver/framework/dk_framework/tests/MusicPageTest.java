package dk.webdriver.framework.dk_framework.tests;

import junit.framework.Assert;

import org.junit.Test;

import dk.webdriver.framework.dk_framework.BrowserDk;
import dk.webdriver.framework.dk_framework.OzonElectronicPage;
import dk.webdriver.framework.dk_framework.OzonMainPage;
import dk.webdriver.framework.dk_framework.OzonMusicPage;
import dk.webdriver.framework.dk_framework.OzonTvPage;

public class MusicPageTest {
	

	@Test
	public void searchMusicPage(){
		
		BrowserDk br = new BrowserDk();
		OzonMainPage omp = new OzonMainPage(br);
		omp.navigateToMusicSection();
		OzonMusicPage ommp = new OzonMusicPage(omp.getBrowserDk());
		ommp.navigateToPopularMusic();
		Assert.assertEquals(ommp.isPopularMucic(), true);
		br.getCurrentDriver().quit();
		
	}

}
