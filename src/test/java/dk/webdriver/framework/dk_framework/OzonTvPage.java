package dk.webdriver.framework.dk_framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OzonTvPage extends OzonPage{
	
	private Link lgTvLink;
	private List<WebElement> searchResult;
	
	public OzonTvPage(BrowserDk br){
		super.browser = br;
		//init(br);
				
	}
	
	private void init(BrowserDk br){
		
		
		//searchResult = br.getCurrentDriver().findElements(By.xpath("//div[contains(text(), 'В корзину')and @class='bBuyButton mAddToCart js_add']"));
		
	}
	
	public void selectLgTv(){
		this.lgTvLink = new Link(By.xpath("//li/a[contains(text(), 'LG')]"), super.browser);
		this.lgTvLink.navigateTo();
		
	}
	
	public void putInCart(BrowserDk br){
		
	//	System.out.println(searchResult.get(11).isEnabled());
		searchResult = br.getCurrentDriver().findElements(By.xpath("//div[contains(text(), 'В корзину')and @class='bBuyButton mAddToCart js_add']"));
		searchResult.get(10).click();;
		
		
	}
	
	public boolean isLgTv(){
		//System.out.println(super.browser.getCurrentDriver().getTitle());
		//Assert.assertTrue(mainPage.getCurrentDriver().getPageSource().contains("Дмитрий Кияткин"), true);
		if(super.browser.getCurrentDriver().getTitle().contains("Телевизоры LG"))
			   return true;
			
			return false;   
		
		
	}

}
