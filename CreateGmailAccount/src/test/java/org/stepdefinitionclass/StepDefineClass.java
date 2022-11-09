package org.stepdefinitionclass;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.pojoClass.PojoGmailCreate;
import org.utilities.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefineClass extends BaseClass {

	@Given("User should launch the browser and maximize the window")
	public void user_should_launch_the_browser_and_maximize_the_window() throws Exception {

		ScreenRecorderUtil.startRecord("user_should_launch_the_browser_and_maximize_the_window");

		launchChrome();
		maximum();
	}

	@When("User should load the url")
	public void user_should_load_the_url() throws Throwable {

		driver.get("https://www.google.com/");
		PojoGmailCreate pj = new PojoGmailCreate();
		sendkey(pj.getSearchbox(), "gmail account create");
		Enter();

	}

	@When("User should click the first link and click create an account button")
	public void user_should_click_the_first_link_and_click_create_an_account_button() {
		implicitwaits();
		PojoGmailCreate pj = new PojoGmailCreate();
		clicks(pj.getFirstlink());
		clicks(pj.getCreateanaccount());

		String parentid = driver.getWindowHandle();
		Set<String> allid = driver.getWindowHandles();
		int count = 0;
		for (String x : allid) {
			if (parentid != x) {
				driver.switchTo().window(x);
			}
		}

	}

	@When("User should fill the details and click next")
	public void user_should_fill_the_details_and_click_next() {
		implicitwaits();
		PojoGmailCreate pj = new PojoGmailCreate();
		sendkey(pj.getFirstname(), "prakash");
		sendkey(pj.getLastname(), "rakesh");
		sendkey(pj.getUseremail(), "vpr21021996");
		sendkey(pj.getPassword(), "VPR21021996");
		sendkey(pj.getConfirmpassword(), "VPR21021996");
		clicks(pj.getNext());

	}

	@When("User should give Mobile number and click next")
	public void user_should_give_Mobile_number_and_click_next() {
		implicitwaits();
		PojoGmailCreate pj = new PojoGmailCreate();
		sendkey(pj.getMobno(), "9384124275");
		clicks(pj.getMobnext());

	}

	@When("User should give OTP and click verify")
	public void user_should_give_OTP_and_click_verify() throws Exception {

		Thread.sleep(8000);

		PojoGmailCreate pj = new PojoGmailCreate();
		clicks(pj.getOtpverify());

	}

	@When("User should give DOB and gender and click next")
	public void user_should_give_DOB_and_gender_and_click_next() {

		implicitwaits();
		PojoGmailCreate pj = new PojoGmailCreate();
		Select s = new Select(pj.getMonth());
		s.selectByIndex(2);
		sendkey(pj.getDay(), "23");
		sendkey(pj.getYear(), "1999");
		Select ss = new Select(pj.getGender());
		ss.selectByVisibleText("Male");
		clicks(pj.getNextdobpage());

	}

	@When("User should click yes i am and click i agree")
	public void user_should_click_yes_i_am_and_click_i_agree() throws Exception {
        implicitwaits();
		PojoGmailCreate pj = new PojoGmailCreate();
		clicks(pj.getYesiam());
		javascriptscrolldown(pj.getIagree());
		clicks(pj.getIagree());
		
		ScreenRecorderUtil.stopRecord();
	}
}