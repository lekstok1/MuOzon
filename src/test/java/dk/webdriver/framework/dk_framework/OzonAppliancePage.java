package dk.webdriver.framework.dk_framework;

import org.openqa.selenium.By;

public class OzonAppliancePage extends OzonPage {
	
	private Link vacuumLink;

	
	public OzonAppliancePage(BrowserDk br){
		
		super.browser = br;
				
	}
	
     public void navigateToVacuum(){
		
		
		this.vacuumLink = new Link(By.xpath("//a[contains(text(), 'Пылесосы') and @class='bLeftMainMenu_eLink']"), super.getBrowserDk());
		this.vacuumLink.navigateTo();
		
		
	}
	
	public boolean isVacuumPage(){
		//System.out.println(super.browser.getCurrentDriver().getTitle());
		//Assert.assertTrue(mainPage.getCurrentDriver().getPageSource().contains("Дмитрий Кияткин"), true);
		if(super.browser.getCurrentDriver().getTitle().contains("Пылесосы"))
			   return true;
			
			return false;   
		
	}
	

}
