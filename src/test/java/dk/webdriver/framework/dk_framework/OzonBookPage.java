package dk.webdriver.framework.dk_framework;

import org.openqa.selenium.By;

public class OzonBookPage extends OzonPage {
	
	private Link techLit;
	
	public OzonBookPage(BrowserDk br){
		
		super.browser = br;
				
	}
	
	
	public void navigateToTechBooks(){
		
		
		this.techLit = new Link(By.xpath("//a[contains(text(), 'Наука. Техника') and @class='bLeftMainMenu_eLink']"), super.getBrowserDk());
		this.techLit.navigateTo();
		
		
	}
	
	public boolean isTechBooks(){
		//System.out.println(super.browser.getCurrentDriver().getTitle());
		//Assert.assertTrue(mainPage.getCurrentDriver().getPageSource().contains("Дмитрий Кияткин"), true);
		if(super.browser.getCurrentDriver().getPageSource().contains("Научная и техническая литература "))
			   return true;
			
			return false;   
		
		
	}
	

}
