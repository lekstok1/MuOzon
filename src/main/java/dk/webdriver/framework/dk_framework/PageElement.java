package dk.webdriver.framework.dk_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public abstract class PageElement {
	
	//protected BrowserDk page;
	protected By locator;
	protected WebElement element;
	protected PageElement pageElement;
	
	public PageElement(By loc, BrowserDk page){
		
		if(page.isBrowserAlive())
			this.element = page.getCurrentDriver().findElement(loc);
		
	}
	
	
	
	public WebElement getElement(){
		
		 return this.element;
		
	}
//	public void click(){
//		System.out.println(this.element.getTagName());
//		this.element.click();
//		
//	}
	
	
	public boolean isElementPresent(){
		
		try{			
			
			getElement();
			return true;
			
			
		} catch(Exception e){
			
			return false;
			
		}
		
		
		
	}

}
