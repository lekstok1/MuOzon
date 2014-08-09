package dk.webdriver.framework.dk_framework.tests;

import junit.framework.Assert;

import org.junit.Test;

import dk.webdriver.framework.dk_framework.BrowserDk;
import dk.webdriver.framework.dk_framework.OzonBookPage;
import dk.webdriver.framework.dk_framework.OzonMainPage;
import dk.webdriver.framework.dk_framework.OzonMusicPage;

public class BooksPageTest {
	
	
	@Test
	public void searchBooksPage(){
		
		BrowserDk br = new BrowserDk();
		OzonMainPage omp = new OzonMainPage(br);
		omp.navigateToBookSection();
		OzonBookPage obp = new OzonBookPage(omp.getBrowserDk());
		obp.navigateToTechBooks();
		Assert.assertEquals(obp.isTechBooks(), true);
		br.getCurrentDriver().quit();
		
	}

}
