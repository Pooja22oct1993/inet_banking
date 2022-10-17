package com.inetBankingProject.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='uid']") 
	WebElement uid;
		
	@FindBy(xpath="//input[@name='password']") 
	WebElement password;
	
	@FindBy(xpath="//input[@name='btnLogin']") 
	WebElement btnLogin;
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void EnteruserID(String userid) {
		try {
	uid.clear();
	uid.sendKeys(userid);
		}
		catch (Exception e) {
			e.getStackTrace();
			
			
		}
		
	}
	
	public void EnterPass(String pass) {
	
		try {
		password.clear();
		password.sendKeys(pass);
		}
		catch (Exception e) {
			e.getStackTrace();
		}
	}
	public void clickLogButt() {
		btnLogin.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
