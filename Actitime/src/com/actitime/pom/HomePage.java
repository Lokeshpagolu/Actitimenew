package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage {
	@FindBy(id="container_tasks")
	private WebElement taskbtn;
	@FindBy(id="logoutLink")
	private WebElement logOut;
	
public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void setTaskTab() {
	taskbtn.click();
}
public void logOutBtn() {
	logOut.click();
}

}