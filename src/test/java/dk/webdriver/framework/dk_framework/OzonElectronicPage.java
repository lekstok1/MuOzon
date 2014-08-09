package dk.webdriver.framework.dk_framework;

import org.openqa.selenium.By;

public class OzonElectronicPage extends OzonPage{

	private Link tvLink;
	private Link smartphoneLink;
	private Link notebookLink;
	
	//bLeftMainMenu_eLink
	
	
	public OzonElectronicPage(BrowserDk br){
		super.browser = br;
		init(br);
		
	}
	
	
	private void init(BrowserDk br){
		
		//tvLink = new Link(By.xpath("//a[contains(text(), 'Телевизоры') and @class='bLeftMainMenu_eLink']"),br);
		smartphoneLink = new Link(By.xpath("//a[contains(text(), 'Смартфоны') and @class='bLeftMainMenu_eLink']"),br);
		notebookLink = new Link(By.xpath("//a[contains(text(), 'Ноутбуки') and @class='bLeftMainMenu_eLink']"),br);
	}
	
	
	public void navigateToTvSection(){
		tvLink = new Link(By.xpath("//a[contains(text(), 'Телевизоры') and @class='bLeftMainMenu_eLink']"),super.browser);
		this.tvLink.navigateTo();
		
	}
	
	public void navigateToSmartphoneSection(){
		
		this.smartphoneLink.navigateTo();
		
	}
	
	
	public void navigateToNotebookSection(){
		
		this.notebookLink.navigateTo();
		
	}
	
}
