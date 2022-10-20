package com.inetBankingProject.test_case;

import java.io.IOException;
import java.time.Duration;

import javax.swing.Popup;

import org.apache.hc.core5.http2.hpack.HPackDecoder;
import org.checkerframework.checker.units.qual.h;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.inetBankingProject.page_object.HomePage;
import com.inetBankingProject.page_object.LoginPage;
import com.inetBankingProject.test_base.TestBase;
import com.inetBankingProject.utility.Helperclass;

public class Mod_NewCusTC_02 extends TestBase {

	HomePage hp;
	LoginPage lp;
	
@Test()
public void addingNewCus() throws IOException {
	lp=new LoginPage(driver);
	lp.EnteruserID("mngr448612");
	lp.EnterPass("EnEzynE");
	lp.clickLogButt();
	hp=new HomePage(driver);
	hp.createNewCustomer();
	hp.enterCusName("Priya Wane");
		hp.selectGender();
		hp.dobPicker("Mar");
		hp.dobPicker("19");
		hp.dobPicker("2009");
		hp.enterCusAdd("Sai krupa Apartment Alandi road Bhosari Pune");
		hp.enterCity("Pune");
		hp.enterState("Maharashtra");
		hp.enterPin("411039");
		hp.enterMobileNo("9846576764");
		hp.enterCusEmail("poojapwankhade358@gmail.com");
		hp.enterPassword("EnEzynE");
		hp.clickSubButt();
		
		
}
}
	
	
	
	
	
	
	
	
	


