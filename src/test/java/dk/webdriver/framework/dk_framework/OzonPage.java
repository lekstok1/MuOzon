package dk.webdriver.framework.dk_framework;

import org.openqa.selenium.By;

public abstract class OzonPage {
	
	
	protected BrowserDk browser;
	protected final String BOOKS_SECTION = "Книги";
	protected final String ELECTRONIC_SECTION = "Электроника";
	protected final String APPLIANCES_SECTION = "Бытовая техника";
	protected final String MUSIC_SECTION = "Музыка";
	protected final String START_URL = "http://ozon.ru";
	
	protected Link electronicsLink;
	protected Link booksLink;
	protected Link appliancesLink;
	protected Link musicLink;
	protected Link cartLink;
	protected Link personalAreaLink;
	
	
	public OzonPage(){
		//this.browser = new BrowserDk();
		//init();		
			
		
	}
	
	
	public  void init(){
		
		
		//this.browser.getPage(START_URL);
		
		booksLink = new Link(By.xpath("//span[contains(text(), 'Книги') and @class='eCategoryName']"), this.browser);
		appliancesLink = new Link(By.xpath("//span[contains(text(), 'Бытовая техника') and @class='eCategoryName']"), this.browser);
		musicLink = new Link(By.xpath("//span[contains(text(), 'Музыка') and @class='eCategoryName']"), this.browser);
	  //  cartLink = new Link(By.xpath("//span[contains(text(), 'Корзина') and @class='eHeadLine ']"), this.browser);
		
	}
	
	public String getPageTitle(){
		
		if(browser.isBrowserAlive())
			 return browser.getCurrentDriver().getTitle();
		return "";
	}
	
	
    public void navigateToElectronicSection(){
    	electronicsLink = new Link(By.xpath("//span[contains(text(), 'Электроника') and @class='eCategoryName']"), this.browser);
    	this.electronicsLink.navigateTo();
    	
    }
    
 public void navigateToBookSection(){
    	
    	this.booksLink.navigateTo();
    	
    }
 
 public void navigateToMusicSection(){
 	
 	this.musicLink.navigateTo();
 }
 
 public void navigateToAppliancesSection(){
 	
 	this.appliancesLink.navigateTo();
 	
 }
 
 
 public void navigateToCartPage(){
	 	
	    this.cartLink = new Link(By.xpath("//span[contains(text(), 'Корзина')]"), this.browser);
	 	this.cartLink.navigateTo();
	 	
	 }
	
 
 public void navigateToPersonalPage(){
	 	
	    this.personalAreaLink = new Link(By.xpath("//a[contains(text(), 'Личный кабинет')]"), this.browser);
	 	this.personalAreaLink.navigateTo();
	 	
	 }
 
public BrowserDk getBrowserDk(){
		
		return this.browser;
	}


public void goToMainPage(){
	
	
	 this.browser.getPage(START_URL);
	
	
}

}
