package dk.webdriver.framework.dk_framework;

import org.openqa.selenium.By;

public class OzonPersonalAreaPage extends OzonPage{
	
	private Link changeData;
	private Link changeCurrency;
	private Button saveData;
	private Button saveCurrency;
	private CheckBox byCurrency;
	private CheckBox ruCurrency;
	
	public OzonPersonalAreaPage(BrowserDk br){
		
		super.browser = br;		
		
	}
	
   public void clickChangeDataLink(){
	   
	   changeData = new Link(By.xpath("//a[contains(text(), 'Изменить регистрационные данные')]"), super.browser);
	   changeData.navigateTo();
	   
	   
   }
	
	
   public void changeData(){
	   
	   clickChangeDataLink();
	   saveData = new Button(By.id("ctl33_ctl00_MyPersonal_Update"), super.browser);
	   saveData.submit();
	   	   
   }
   
   
   public boolean isSuccessChangeData(){
	   
	   if(super.browser.getCurrentDriver().getPageSource().contains("Ваши данные успешно обновлены"))
			   return true;
			
			return false;   
	   
	   
   }
   
   
  public void changeCurrencyLink(){
	  
	  // clickChangeDataLink();
	   saveData = new Button(By.xpath("//a[contains(text(), 'Валюта цен товаров')]"), super.browser);
	   saveData.submit();
	   	   
   }
  
  
 public void changeCurrency(){
	
	
	 changeCurrencyLink();
	 ruCurrency = new CheckBox(By.id("ctl33_CurrencyList_0"), super.browser);
	 byCurrency = new CheckBox(By.id("ctl33_CurrencyList_11"), super.browser);

	 if(ruCurrency.isChecked()){
		 
		 byCurrency.check();
		 
	 }else if(byCurrency.isChecked()){
		 
		 ruCurrency.check();
	 } else {
		 
		 ruCurrency.check();
	 }
	 
	 saveCurrency = new Button(By.id("ctl33_MyCurrency_Update"), super.browser);
	 saveCurrency.submit();
	   	   
   }
	
 
  public boolean isSuccessChangeCurrency(){
	   
	  ruCurrency = new CheckBox(By.id("ctl33_CurrencyList_0"), super.browser);
	  byCurrency = new CheckBox(By.id("ctl33_CurrencyList_11"), super.browser);
	  
	   if(ruCurrency.isChecked() || byCurrency.isChecked())
			   return true;
			
			return false;   
	   
	   
 }
 
}
