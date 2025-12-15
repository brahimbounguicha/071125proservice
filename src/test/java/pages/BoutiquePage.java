package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Helper.Config;

public class BoutiquePage {
	
	@FindBy(id="woolentor-field-for-613a720")
	WebElement tri1;
	
	@FindBy(id="woolentor-field-for-d4aa387")
	WebElement tri2;
	
	@FindBy(xpath="/html/body/div[2]/div[5]/div/div/section[1]/div/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[3]/select")
	WebElement tri3;
	
	@FindBy(xpath="/html/body/div[2]/div[5]/div/div/section[1]/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]/div/h4")
	List<WebElement> menus; 
	
	public BoutiquePage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void effectuerTri(String triname1, String triname2 , String triname3) throws Exception {
		Config.attente();
		Select select1 = new Select(tri1);
		select1.selectByVisibleText(triname1);
		
		
		Thread.sleep(5000);
		
		Select select2 = new Select(tri2);
		
		select2.selectByVisibleText(triname2);
		
		Config.attente();
		Thread.sleep(5000);
		
		Select select3 = new Select(tri3);
		
		select3.selectByVisibleText(triname3);
		Thread.sleep(5000);
	}
	
	public void clickOnProduct(String productNmae) {
		try {
			for(WebElement menu:menus) {
				
				if(menu.getText().contains(productNmae)) {
					menu.click();
				}
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
