package com.actitime.testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImlements.class)
public class CreateCus extends BaseClass {
	@Test
	public void testCreateCus() throws IOException, InterruptedException {
		Reporter.log("createcus",true);
		FileLib f=new FileLib();
		String cusname = f.getExcelData("create cus", 1, 2);
		String cusDes = f.getExcelData("create cus", 1, 3);
		HomePage h=new HomePage(driver);
		h.setTaskTab();
		TaskListPage t=new TaskListPage(driver);
		t.addTask().click();
		t.newCus().click();
		t.newCusName().sendKeys(cusname);
		t.newCustomerDes().sendKeys(cusDes);
		t.createCustomeBtn().click();
		Thread.sleep(5000);
		String actualdata = t.expetedData().getText();
		//System.out.println(actualdata);
		Assert.assertEquals(actualdata, cusname);
	}
	

}
