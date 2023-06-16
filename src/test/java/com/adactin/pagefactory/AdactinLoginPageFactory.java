package com.adactin.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adac.basepack.BaseClassAdac;

public class AdactinLoginPageFactory extends BaseClassAdac {
public 	AdactinLoginPageFactory() {
	PageFactory.initElements(driver, this);
	}
	@FindBy (name = "username")
	public  WebElement userName;

	@FindBy (name = "password")
	public WebElement passWord;

	@FindBy (name  = "login")
	public WebElement signUp;

}

