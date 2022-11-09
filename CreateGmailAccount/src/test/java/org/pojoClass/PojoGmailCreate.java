package org.pojoClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class PojoGmailCreate extends BaseClass{

	
	public PojoGmailCreate() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@class='gLFyf gsfi']")
	private WebElement searchbox;
	
	@FindBy(xpath="//h3[text()='Create a Gmail account - Google Help']")
	private WebElement firstlink;
	
	@FindBy(xpath="//a[text()='Create an account ']")
	private WebElement createanaccount;
	
	@FindBy(id="firstName")
	private WebElement firstname;
	
	@FindBy(id="lastName")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement useremail;
	
	@FindBy(xpath="//input[@name='Passwd']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='ConfirmPasswd']")
	private WebElement confirmpassword;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement next;
	
	@FindBy(id="phoneNumberId")
	private WebElement mobno;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement mobnext;
	
	@FindBy(xpath="//input[@type='tel']")
	private WebElement otpcode;
	
	@FindBy(xpath="(//span[@class='VfPpkd-vQzf8d'])[1]")
	private WebElement otpverify;
	
	@FindBy(xpath="(//select[@class='UDCCJb'])[1]")
	private WebElement month;
	
	@FindBy(xpath="(//input[@class='whsOnd zHQkBf'])[2]")
	private WebElement day;
	
	@FindBy(xpath="(//input[@class='whsOnd zHQkBf'])[3]")
	private WebElement year;
	
	@FindBy(xpath="(//select[@class='UDCCJb'])[2]")
	private WebElement gender;
	
	@FindBy(xpath="(//span[@jsname='V67aGc'])[2]")
	private WebElement nextdobpage;
	
	@FindBy(xpath="(//span[@jsname='V67aGc'])[2]")
	private WebElement yesiam;
	
	
	@FindBy(xpath="(//span[@jsname='V67aGc'])[2]")
	private WebElement iagree;
	
	


	
	
	public WebElement getSearchbox() {
		return searchbox;
	}


	public WebElement getFirstlink() {
		return firstlink;
	}


	public WebElement getCreateanaccount() {
		return createanaccount;
	}


	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getUseremail() {
		return useremail;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmpassword() {
		return confirmpassword;
	}


	public WebElement getNext() {
		return next;
	}

	public WebElement getMobno() {
		return mobno;
	}


	public WebElement getMobnext() {
		return mobnext;
	}


	public WebElement getOtpcode() {
		return otpcode;
	}


	public WebElement getOtpverify() {
		return otpverify;
	}


	public WebElement getMonth() {
		return month;
	}


	public WebElement getDay() {
		return day;
	}


	public WebElement getYear() {
		return year;
	}


	public WebElement getGender() {
		return gender;
	}


	public WebElement getNextdobpage() {
		return nextdobpage;
	}


	public WebElement getYesiam() {
		return yesiam;
	}


	public WebElement getIagree() {
		return iagree;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
