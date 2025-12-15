package StepDef;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BoutiquePage;
import pages.SmartPhonePage;

public class BoutiqueStepDef {
	@Given("utilisateur est sur la page boutique")
	public void utilisateur_est_sur_la_page_boutique() {
		Config.driver = new ChromeDriver();
		Config.maximize();
		String url = "https://www.xiaomistore.tn/shop/";
		Config.driver.get(url);
		
	 
	}
	@When("utilisateur effectue le tri1 {string} le tri2 {string} et le tri3 {string}")
	public void utilisateur_effectue_le_tri1_le_tri2_et_le_tri3(String tri1, String tri2, String tri3) throws Exception {
	 BoutiquePage b = new BoutiquePage();
	 
	 b.effectuerTri(tri1, tri2, tri3);
	}
	@When("clique sur le produit {string}")
	public void clique_sur_le_produit(String productNmae) {
		 BoutiquePage b = new BoutiquePage();
		 b.clickOnProduct(productNmae);
	  
	}
	@Then("utilisateur est derige vers la page du produit {string}")
	public void utilisateur_est_derige_vers_la_page_du_produit(String productNmae) {
		SmartPhonePage s = new SmartPhonePage();
		s.verifProd(productNmae);
		Config.driver.quit();
	}

}
