package StepDef;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomePageStepDef {
	@Given("utilisateur est sur la page dacceuil")
	public void utilisateur_est_sur_la_page_dacceuil() {
		Config.driver = new ChromeDriver();
		
		Config.maximize();
		
		String url ="https://www.xiaomistore.tn/";
		
		Config.driver.get(url);
		
	 
	}
	@When("utilisateur clique sur le menu {string}")
	public void utilisateur_clique_sur_le_menu(String menutitle) {
		HomePage p = new HomePage();
		p.clickOnProduct(menutitle);
	    
	}
	@Then("utilisateur est derige vers la page {string}")
	public void utilisateur_est_derige_vers_la_page(String menutitle) {
		HomePage p = new HomePage();
		p.verif(menutitle);
		Config.driver.quit();
	    
	}

}
