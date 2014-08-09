package dk.webdriver.framework.dk_framework;

import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;





import com.opera.core.systems.OperaDriver;

public class BrowserDk {
	
	public final static String OPERA = "opera";
	public final static String FIREFOX = "firefox";
	public final static String IE = "ie";
	public final static String CHROME = "chrome";
	public final static int DEFAULT_IMLICIT_WAIT = 10;
	

	
	private static BrowserDk browser;
	private WebDriver driver;
	private PageElement element;
	private System systemProperty;
	
	public BrowserDk(){
		
		this.driver = new FirefoxDriver();
		this.driver.manage().timeouts().implicitlyWait(DEFAULT_IMLICIT_WAIT, TimeUnit.SECONDS);
		
		
	}
	
	
	public BrowserDk(String type){
		
		try{
		if(type == FIREFOX){
			this.driver = new FirefoxDriver();			
		}else if(type == OPERA){
			this.driver = new OperaDriver();			
		}else if(type == IE){
			systemProperty.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
			this.driver = new InternetExplorerDriver();
			
		}else if(type == CHROME){
			systemProperty.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			this.driver = new ChromeDriver();
			
		}
		
		this.driver.manage().timeouts().implicitlyWait(DEFAULT_IMLICIT_WAIT, TimeUnit.SECONDS);
		
		} catch (Exception e){
			
			//e.printStackTrace();
			System.err.println(String.format("Unsupported browser  name : \"%1$s\" ", type));
		}
		
	}
	
	
	public WebDriver getCurrentDriver(){
		
		if(this.isBrowserAlive())
			return this.driver;
		
		return null;
		
	}
	
	public boolean isBrowserAlive() {
		return this != null;
	}
	
	public void getPage(String url){
	// if(this.isBrowserAlive())
	//	if(Patterns.WEB_URL.matcher("ddd").matches())
		    this.driver.get(url);
	//	else 
		//	System.out.println("baaad");
		
	}
	
	//public PageElement getElementByLoc(By loc){	
		
		//this.element = this.driver.findElement(loc);		
		//return element;
	//}
	
	public void setImlicitlyWait(int seconds){
		
		this.driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
		
	}
	
	public void getBrowserInfo(){
		
		Capabilities capabilities = ((RemoteWebDriver)this.driver).getCapabilities();
		System.out.println("--------Browser Info--------");
		System.out.println("Name: " + capabilities.getBrowserName()+ "\n" + "Version: " + capabilities.getVersion());
		
	}
	
	public WebElement findElementOnPage(By loc){
		
		
		return this.driver.findElement(loc);
		
	}


     
	

}
