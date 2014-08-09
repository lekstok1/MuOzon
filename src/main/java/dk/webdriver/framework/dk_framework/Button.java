package dk.webdriver.framework.dk_framework;

import org.openqa.selenium.By;

public class Button extends PageElement {

	public Button(By loc, BrowserDk page) {
		super(loc, page);
		// TODO Auto-generated constructor stub
	}
	
	
	public void submit(){
	    
		if(super.isElementPresent())
		   super.getElement().click();		
	}

}
