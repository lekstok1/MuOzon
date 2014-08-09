package dk.webdriver.framework.dk_framework;

import org.openqa.selenium.By;

public class OzonCartPage extends OzonPage{
	
	
	private CheckBox checks;
	private Button deleteFromCartButton;
	
	public OzonCartPage(BrowserDk br){
		
		super.browser = br;			
		
	}
	
	

	public boolean IsEmpty(){
		
		if(super.browser.getCurrentDriver().getPageSource().contains("Корзина пуста"))
		   return true;
		
		return false;   
		
	}
	
	
	public void checkGoods(){
		
		if(!IsEmpty()){
			
			checks = new CheckBox(By.id("ctl35_ctl01_CartRepeater_chkSelect_0"), super.browser);
			checks.check();
			
		}
		
	}
	
	
	public void deleteFromCart(){
		
		checkGoods();
		deleteFromCartButton = new Button(By.id("ctl35_ctl01_CartRepeater_DeleteLinkButtonMulti"),super.browser);
		deleteFromCartButton.submit();
		
	}
	
	
}
