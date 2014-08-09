package dk.webdriver.framework.dk_framework;

import org.openqa.selenium.By;

public class Link extends PageElement {

	public Link(By loc, BrowserDk page) {
		super(loc, page);
		// TODO Auto-generated constructor stub
	}
	
	
	public void navigateTo(){
		if(super.isElementPresent())
		super.getElement().click();
		
	}

}
