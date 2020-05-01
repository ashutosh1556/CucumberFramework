package com.stepDefinition;

import com.baseClass.library;
import com.seleniumUtility.SelUtil;
import com.testPages.OrangeHRM_Login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRM_Steps extends library {

	OrangeHRM_Login login = new OrangeHRM_Login();
	SelUtil u = new SelUtil();

	@Given("^the user launch the web browser$")
	public void the_user_launch_the_web_browser() {

	}

	@When("^the user gives username \"([^\"]*)\"$")
	public void the_user_gives_username(String arg1) {
	}

	@When("^the user gives password \"([^\"]*)\"$")
	public void the_user_gives_password(String arg1) {
	}

	@Then("^Orange HRM home page should be displayed$")
	public void orange_HRM_home_page_should_be_displayed() {
	}

}
