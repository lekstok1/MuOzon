package dk.webdriver.framework.dk_framework;

import org.openqa.selenium.By;

public class OzonMainPage extends OzonPage{
	
	//private BrowserDk mainPage;
	private TextField searchField;
	private Button searchButton;
	private Link loginLink;
	private Link regionLink;
	private TextField changeRegion;
	
	public OzonMainPage(BrowserDk mainPage){
		//super();
		super.browser = mainPage;		
		init(mainPage);
		super.init();
	}
	
	public void init(BrowserDk mainPage){
		
	//  mainPage = new BrowserDk();
	 mainPage.getPage("http://ozon.ru");
		if(mainPage.isBrowserAlive()){

			this.searchField = new TextField(By.id("ctl29_SearchText"), mainPage);
			this.searchButton = new Button(By.id("ctl29_StartSearch"), mainPage);
			this.loginLink = new Link(By.xpath("//a[contains(text(), 'Вход')]"), mainPage);
			
		}
					
	}
	
	public void searchGoods(String goods){
		
		
		this.searchField.type(goods);
		this.searchButton.submit();
		
	}
	
	
	public void navigateToLogin(){
		
		this.loginLink.navigateTo();
		
	}
	
   public void changeRegion(){
	   
	   
	    this.regionLink = new Link(By.xpath("//span[contains(@class, 'bHeaderInfo_city_label js-city-select')]"), super.getBrowserDk());
	    this.regionLink.navigateTo();
		this.changeRegion = new TextField(By.id("js-city-search"), super.getBrowserDk());
		this.changeRegion.type("Италия");
		this.changeRegion.submit();
		
	}
	

}
