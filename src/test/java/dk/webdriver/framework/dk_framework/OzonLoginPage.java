package dk.webdriver.framework.dk_framework;

import junit.framework.Assert;

import org.openqa.selenium.By;

public class OzonLoginPage extends OzonPage{
	
	
	//private BrowserDk mainPage;
	private TextField loginField;
	private TextField passwordField;
	private Button confirmButton;
	private BrowserDk page;
	
	
//	public OzonLoginPage(){
//		this.page = new BrowserDk();
//		this.page.getPage("https://www.ozon.ru/context/login/");
//		init();
//				
//	}
	
	public OzonLoginPage(BrowserDk browser){
        super.browser = browser;
		init(browser);
				
	}
	
//	public void init(){
//		
//		this.loginField = new TextField(By.id("Login"), page);
//		this.passwordField = new TextField(By.id("passw"), page);
//		this.confirmButton = new Button(By.id("Authentication"), page);
//		
//		
//	}
	
	
	public void init(BrowserDk browser){
		
		this.loginField = new TextField(By.id("Login"), browser);
		this.passwordField = new TextField(By.id("Passw"), browser);
		this.confirmButton = new Button(By.id("Authentication"), browser);
		
		
	}
	
	public void LogIn(String login, String password){
		
		this.loginField.type(login);
		this.passwordField.type(password);
		this.confirmButton.submit();
		
		
	}
	
	
	public boolean isSuccessLogin(){
		//System.out.println(super.browser.getCurrentDriver().getTitle());
		//Assert.assertTrue(mainPage.getCurrentDriver().getPageSource().contains("Дмитрий Кияткин"), true);
		if(super.browser.getCurrentDriver().getPageSource().contains("Дмитрий Киятктин"))
			   return true;
			
			return false;   
		
		
	}
	
	

}
