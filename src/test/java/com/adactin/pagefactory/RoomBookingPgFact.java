package com.adactin.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adac.basepack.BaseClassAdac;

public class RoomBookingPgFact extends BaseClassAdac {
public RoomBookingPgFact() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@id='username']")
public WebElement userName;

@FindBy(xpath = "//input[@id='password']")
public WebElement passWord;

@FindBy(xpath="//input[@id='login']")
public WebElement login;

@FindBy(xpath="//select[@id='location']")
public WebElement location;

@FindBy(xpath="//select[@id='hotels']")
public WebElement hotel;

@FindBy(xpath="//select[@id='room_type']")
public WebElement room;

@FindBy(xpath="//select[@id='room_nos']")
public WebElement roomNum;

@FindBy(xpath="//input[@id='datepick_in']")
public WebElement checkIn;

@FindBy(xpath="//input[@id='datepick_out']")
public WebElement checkOut;

@FindBy(xpath="//select[@id='adult_room']")
public WebElement adultRoom;

@FindBy(xpath="//select[@id='child_room']")
public WebElement childRoom;

@FindBy(xpath="//input[@id='Submit']")
public WebElement search;

@FindBy(xpath="//input[@id='radiobutton_0']")
public WebElement radioBtn;

@FindBy(xpath="//input[@id='continue']")
public WebElement continueBtn;

@FindBy(xpath="//input[@id='first_name']")
public WebElement first;

@FindBy(xpath="//input[@id='last_name']")
public WebElement last;

@FindBy(xpath="//textarea[@id='address']")
public WebElement address;

@FindBy(xpath="//input[@id='cc_num']")
public WebElement card;

@FindBy(xpath="//select[@id='cc_type']")
public WebElement cardType;

@FindBy(xpath="//select[@id='cc_exp_month']")
public WebElement car;

@FindBy(xpath="//select[@id='cc_exp_month']")
public WebElement cardExp;

@FindBy(xpath="//select[@id='cc_exp_year']")
public WebElement cardExpYear;

@FindBy(xpath="//input[@id='cc_cvv']")
public WebElement cardCVV;

@FindBy(xpath="//input[@id='book_now']")
public WebElement bookNow;
}

