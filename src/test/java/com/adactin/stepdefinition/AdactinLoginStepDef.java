package com.adactin.stepdefinition;

import java.io.IOException;

import com.adac.basepack.BaseClassAdac;
import com.adactin.pagefactory.AdactinLoginPageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactinLoginStepDef {
	@Given("To load the Adactin Login page")
	public void to_load_the_Adactin_Login_page() throws IOException {
	    BaseClassAdac.launch();
	    BaseClassAdac.urlLoad(BaseClassAdac.getProp("adactinUrl"));
	}

	@When("providing three credentials {string}, {string}")
	public void providing_three_credentials(String nme, String pw) {
		AdactinLoginPageFactory alp = new AdactinLoginPageFactory();
		alp.userName.sendKeys(nme);
		alp.passWord.sendKeys(pw);
		alp.signUp.click();
	}

	@Then("To close the Adactin Login page")
	public void to_close_the_Adactin_Login_page() {
	 BaseClassAdac.browserClose();
	}
}
