package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnew;
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement newcus;
	@FindBy(xpath ="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement createcus;
	@FindBy(xpath ="//textarea[@placeholder='Enter Customer Description']")
	private WebElement createDesc;
	@FindBy(xpath ="//div[.='Create Customer']")
	private WebElement createCusBtn;
	
	@FindBy(xpath ="//div[@class='titleEditButtonContainer']/../div/div[1]")
	private WebElement actData;
	
	
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement addTask() {
		return addnew;
		
	}
	public WebElement newCus() {
		return newcus;
		
	}
	public WebElement newCusName() {
		return createcus;
		
		
	}
	public WebElement newCustomerDes() {
		return createDesc;	
	}
	public WebElement createCustomeBtn() {
		return createCusBtn;	
	}
	public WebElement expetedData() {
		return actData;	
	}
	

}
