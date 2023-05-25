package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement unbox;
	
	@FindBy(name="pwd")
	private WebElement pwbox;
	
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement login;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setLogIn(String un, String pw) {
		unbox.sendKeys(un);
		pwbox.sendKeys(pw);
		login.click();
	}
}
