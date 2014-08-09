package dk.webdriver.framework.dk_framework;

import org.openqa.selenium.By;

public class CheckBox extends PageElement {

	public CheckBox(By loc, BrowserDk page) {
		super(loc, page);
		// TODO Auto-generated constructor stub
	}
	
	
	public void check(){
	  if(super.isElementPresent())
		super.getElement().click();
		
	}
	
	public boolean isChecked(){
		
		if(super.isElementPresent())
			return super.getElement().isSelected();
		
		return false;
	}

}
