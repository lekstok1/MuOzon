package dk.webdriver.framework.dk_framework;

public class OzonSearchResultPage extends OzonPage{
	
	
	public OzonSearchResultPage(BrowserDk browser){
		
		super.browser = browser;
				
		
	}

	public boolean isSuccessSearch(){
		
		if(super.browser.getCurrentDriver().getPageSource().contains("Нашли")&&
				super.browser.getCurrentDriver().getPageSource().contains("товаров"))
			   return true;
			
			return false;   
		
		
	}
	
	
}
