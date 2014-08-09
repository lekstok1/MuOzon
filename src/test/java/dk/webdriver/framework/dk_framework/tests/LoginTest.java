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
import dk.webdriver.framework.dk_framework.OzonLoginPage;
import dk.webdriver.framework.dk_framework.OzonMainPage;

@RunWith(Parameterized.class)
public class LoginTest{

	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {

                 {"lekstok1@gmail.com", "vivian27", true }, {"cdfclsrmcsrmfr", " dfdfdf",  false }  
           });
    }
	
	private String login;
	private String password;
	private boolean expectedResult;
	private BrowserDk br;

	@Before
	public void initialize() {
		br = new BrowserDk();
	}
	
	public LoginTest(String myLogin, String myPassword, boolean expected) {
		login = myLogin;
		password = myPassword;
		expectedResult= expected;
    }
	
	
	@Test
	public void LogInOzon(){
		
		OzonMainPage omp = new OzonMainPage(br);
		omp.navigateToLogin();
		OzonLoginPage olp = new OzonLoginPage(omp.getBrowserDk());
		olp.LogIn(login, password);
		olp.goToMainPage();
		Assert.assertEquals(olp.isSuccessLogin(), expectedResult);
		br.getCurrentDriver().quit();

		
	}
	
}
