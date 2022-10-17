package com.inetBankingProject.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(xpath="//a[normalize-space()='New Customer']") 
	WebElement newCustomer;
	
	@FindBy(xpath="//input[@name='name']") 
	 WebElement cusname;
	
	@FindBy(xpath="//input[@id='dob']")
	WebElement dob;
	
	@FindBy(xpath="//textarea[@name='addr']") 
	WebElement addr;
	
	@FindBy(xpath="//input[@name='city']") 
	WebElement city;
	
	@FindBy(xpath="//input[@name='state']") 
	WebElement state;
	
	@FindBy(xpath="//input[@name='pinno']") 
	WebElement pinno;
	
	@FindBy(xpath="(//input[@name='telephoneno'])[1]") 
	WebElement telephoneno;
	
	@FindBy(xpath="(//input[@name='emailid'])[1]") 
	WebElement emailid;
	
	@FindBy(xpath="//input[@name='password']") 
	WebElement password;
	
	@FindBy(xpath="//input[@name='sub']") 
	WebElement sub;
	
	



}
