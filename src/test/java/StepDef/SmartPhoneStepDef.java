package StepDef;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SmartPhonePage;

public class SmartPhoneStepDef {
	@Given("utilisateur est sur la page smartPhone")
	public void utilisateur_est_sur_la_page_smart_phone() {
	    Config.driver = new ChromeDriver();
	    
	    Config.maximize();
	    
	    String url = "https://www.xiaomistore.tn/smartphones/";
	    
	    Config.driver.get(url);
	    
	    
	}
	@When("utilisateur clique sur le produit {string}")
	public void utilisateur_clique_sur_le_produit(String menutitle) {
		SmartPhonePage s = new SmartPhonePage();
		
		s.clickOnProduct(menutitle);
	}
	@Then("utilisateur est derige ves la page du smartPhone {string}")
	public void utilisateur_est_derige_ves_la_page_du_smart_phone(String menutitle) {
		SmartPhonePage s = new SmartPhonePage();
		s.verifProd(menutitle);
		Config.driver.quit();
	}

}
