package pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class SmartPhonePage {
	
	@FindBy(xpath="/html/body/div[1]/div[5]/div/div/section[4]/div/div/div/div[1]/div/h2")
	List<WebElement> menus; 
	
	@FindBy(xpath="/html/body/div[2]/div[4]/div[3]/div/div/div/section[1]/div/div[2]/div/section/div/div/div/div[1]/div/h2")
	               
	WebElement verif;
	
	public SmartPhonePage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	
	public void clickOnProduct(String menutitle) {
		try {
			for(WebElement menu:menus) {
				System.out.println(menu.getText());
				if(menu.getText().contains(menutitle)) {
					menu.click();
				}
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void verifProd(String menutitle) {
		Config.attente();
		Assert.assertEquals(verif.getText(), menutitle);
	}

}
