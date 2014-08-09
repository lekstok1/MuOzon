package dk.webdriver.framework.dk_framework;

import org.openqa.selenium.By;

public class OzonMusicPage extends OzonPage {
	
	private Link popularMusic;
	
	
	public OzonMusicPage(BrowserDk br){
		
		super.browser = br;
				
	}

	
	public void navigateToPopularMusic(){
		
		
		this.popularMusic = new Link(By.xpath("//a[contains(text(), 'Популярная музыка') and @class='bLeftMainMenu_eLink']"), super.getBrowserDk());
		this.popularMusic.navigateTo();
		
		
	}
	
	
	public boolean isPopularMucic(){
		
		if(super.browser.getCurrentDriver().getTitle().contains("Популярная музыка"))
			   return true;
			
			return false;   
		
		
	}
}
