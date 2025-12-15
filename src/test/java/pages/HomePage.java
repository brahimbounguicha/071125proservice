package pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePage {
	
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/section/div/div[2]/div/div/div/nav[1]/ul/li/a")
	List<WebElement> menus; 
	
	public HomePage() {
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
	
	public void verif(String menutitle) {
		
		String verif = Config.driver.getCurrentUrl();
		System.out.println(verif);
		
		Assert.assertTrue("la verification du menu a echoué",verif.contains(menutitle.toLowerCase()));
		
		
	}
	

}
