package com.inetBankingProject.test_case;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBankingProject.page_object.LoginPage;
import com.inetBankingProject.test_base.TestBase;

public class LoginTC_01 extends TestBase{
	LoginPage lp;
	@Test
	public void TC_001() {
	lp=new LoginPage(driver);
	lp.EnteruserID("mngr448612");
	lp.EnterPass("EnEzynE");
	lp.clickLogButt();
	if (driver.getPageSource().contains("HomePage")) {
		Assert.assertTrue(true);
		System.out.println("Login is Successful......");
	}
	else {
		Assert.assertTrue(false);
		System.out.println("Login is failed.....");
		
	}
		
		
	}
	
	
	
	
	

}
