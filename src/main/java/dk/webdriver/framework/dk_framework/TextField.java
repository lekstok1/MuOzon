package dk.webdriver.framework.dk_framework;

import org.openqa.selenium.By;

public class TextField extends PageElement{

	public TextField(By loc, BrowserDk page) {
		super(loc, page);
		// TODO Auto-generated constructor stub
	}

	public void type (String text){
		if(super.isElementPresent())
		super.getElement().sendKeys(text);
		
		
	} 
	
	
	public void submit(){
		if(super.isElementPresent())
		super.getElement().click();;;
		
		
	} 
	
}
