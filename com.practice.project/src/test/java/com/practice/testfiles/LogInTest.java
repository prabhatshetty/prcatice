package com.practice.testfiles;

import org.testng.annotations.Test;

import com.genric.pageobjectmodel.LoginPage;
import com.practice.utils.BaseClass;

public class LogInTest extends BaseClass{

	@Test
	public void logInOrangeHRM()
	{
		LoginPage loginpage=new LoginPage(driver);
		loginpage.login();
	}
}
