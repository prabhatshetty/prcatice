package com.genric.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.practice.utils.BaseClass;
import com.practice.utils.Ipath;
import com.practice.utils.WebDriverActions;

public class LoginPage {
WebDriver driver;
	WebDriverActions webDriverActions=new WebDriverActions();
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//input[@placeholder='Username']")
	private WebElement usernametextfield;

	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement passwordtextfield;
	
	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement loginbutton;

	public WebElement getUsernametextfield() {
		return usernametextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	public void login()
	{
		usernametextfield.sendKeys(Ipath.username);
		passwordtextfield.sendKeys(Ipath.password);
		loginbutton.click();
	}
	
	
}
