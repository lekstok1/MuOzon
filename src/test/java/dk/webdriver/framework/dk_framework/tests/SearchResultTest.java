package dk.webdriver.framework.dk_framework.tests;

import java.util.Arrays;
import java.util.Collection;

import junit.framework.Assert;






import org.junit.Before;
//import org.junit.After;
//import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import dk.webdriver.framework.dk_framework.BrowserDk;
import dk.webdriver.framework.dk_framework.OzonMainPage;
import dk.webdriver.framework.dk_framework.OzonSearchResultPage;
@RunWith(Parameterized.class)
public class SearchResultTest {
	
	
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {

                 {"b", true }, { "cdfclsrmcsrmfr", false }, { "Lg", true }, { "Дмитрий", true }  
           });
    }
	
	private String inputString;
	private boolean expectedResult;
	private BrowserDk br;

	@Before
	public void initialize() {
		br = new BrowserDk();
	}
	
	public SearchResultTest(String input, boolean expected) {
		inputString= input;
		expectedResult= expected;
    }
	
	
	
	@Test
	public void viewSearchResult(){
		
		
		OzonMainPage omp = new OzonMainPage(br);
		omp.searchGoods(inputString);
		OzonSearchResultPage osrp = new OzonSearchResultPage(omp.getBrowserDk());
		Assert.assertEquals(osrp.isSuccessSearch(), expectedResult);
		br.getCurrentDriver().quit();

		
	}
	

}
