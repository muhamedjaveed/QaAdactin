package com.adactin.stepdefinition;

import java.io.IOException;

import com.adac.basepack.BaseClassAdac;
import com.adactin.pagefactory.RoomBookingPgFact;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RoomBookingStepDef {
	@Given("To load the Adactin Browser and Login with credential")
	public void to_load_the_Adactin_Browser_and_Login_with_credential() throws IOException {
		BaseClassAdac.launch();
	    BaseClassAdac.urlLoad(BaseClassAdac.getProp("adactinUrl"));
	}
	
	@When("providing the customer details for room booking")
	public void providing_the_customer_details_for_room_booking() throws IOException {
		RoomBookingPgFact rb = new RoomBookingPgFact();
		rb.userName.sendKeys(BaseClassAdac.getProp("adacUserName"));
		rb.passWord.sendKeys(BaseClassAdac.getProp("adacPassWord"));
		rb.login.click();
		BaseClassAdac.selectByValue(rb.location, "Sydney");
		BaseClassAdac.selectByValue(rb.hotel, "Hotel Sunshine");
		BaseClassAdac.selectByValue(rb.room, "Deluxe");
		BaseClassAdac.selectByIndex(rb.roomNum, 2);
		rb.checkIn.clear();
		rb.checkIn.sendKeys("13/05/2023");
		rb.checkOut.clear();
		rb.checkOut.sendKeys("14/05/2023");
		BaseClassAdac.selectByIndex(rb.adultRoom, 1);	
		BaseClassAdac.selectByIndex(rb.childRoom, 3);	
        rb.search.click();
        rb.radioBtn.click();
        rb.radioBtn.click();
        rb.continueBtn.click();
        rb.first.sendKeys("Muhamed");
        rb.last.sendKeys("Javeed");
        rb.address.sendKeys("Australia road 123 melbourne");
        rb.card.sendKeys("2222405343248877");
		BaseClassAdac.selectByValue(rb.cardType, "MAST");
		BaseClassAdac.selectByIndex(rb.cardExp, 3);
		BaseClassAdac.selectByValue(rb.cardExpYear,"2022");
		rb.cardCVV.sendKeys("567");
		rb.bookNow.click();
		System.out.println("1-Adult booked successfully");
		
	}

	@Given("To load the Adactin Browser and Login with second credential")
	public void to_load_the_Adactin_Browser_and_Login_with_second_credential() throws IOException {
		BaseClassAdac.launch();
	    BaseClassAdac.urlLoad(BaseClassAdac.getProp("adactinUrl"));
	}

	@When("providing the second customer detail for room booking")
	public void providing_the_second_customer_detail_for_room_booking() throws IOException {
		RoomBookingPgFact rb = new RoomBookingPgFact();
		rb.userName.sendKeys(BaseClassAdac.getProp("adacUserName"));
		rb.passWord.sendKeys(BaseClassAdac.getProp("adacPassWord"));
		rb.login.click();
		BaseClassAdac.selectByValue(rb.location, "Sydney");
		BaseClassAdac.selectByValue(rb.hotel, "Hotel Sunshine");
		BaseClassAdac.selectByValue(rb.room, "Deluxe");
		BaseClassAdac.selectByIndex(rb.roomNum, 2);
		rb.checkIn.clear();
		rb.checkIn.sendKeys("13/05/2023");
		rb.checkOut.clear();
		rb.checkOut.sendKeys("14/05/2023");
		BaseClassAdac.selectByIndex(rb.adultRoom, 2);	
		BaseClassAdac.selectByIndex(rb.childRoom, 3);	
        rb.search.click();
        rb.radioBtn.click();
        rb.radioBtn.click();
        rb.continueBtn.click();
        rb.first.sendKeys("Muhamed");
        rb.last.sendKeys("Heera");
        rb.address.sendKeys("Australia road 123 melbourne");
        rb.card.sendKeys("2222405343248877");
		BaseClassAdac.selectByValue(rb.cardType, "MAST");
		BaseClassAdac.selectByIndex(rb.cardExp, 3);
		BaseClassAdac.selectByValue(rb.cardExpYear,"2022");
		rb.cardCVV.sendKeys("567");
		rb.bookNow.click();
		System.out.println("2-Adult booked successfully");
	}
	@Given("To load the Adactin Browser and Login with third credential")
	public void to_load_the_Adactin_Browser_and_Login_with_third_credential() throws IOException {
		BaseClassAdac.launch();
	    BaseClassAdac.urlLoad(BaseClassAdac.getProp("adactinUrl"));
	}

	@When("providing the third customer detail for room booking")
	public void providing_the_third_customer_detail_for_room_booking() throws IOException {
		RoomBookingPgFact rb = new RoomBookingPgFact();
		rb.userName.sendKeys(BaseClassAdac.getProp("adacUserName"));
		rb.passWord.sendKeys(BaseClassAdac.getProp("adacPassWord"));
		rb.login.click();
		BaseClassAdac.selectByValue(rb.location, "Sydney");
		BaseClassAdac.selectByValue(rb.hotel, "Hotel Sunshine");
		BaseClassAdac.selectByValue(rb.room, "Deluxe");
		BaseClassAdac.selectByIndex(rb.roomNum, 2);
		rb.checkIn.clear();
		rb.checkIn.sendKeys("13/05/2023");
		rb.checkOut.clear();
		rb.checkOut.sendKeys("14/05/2023");
		BaseClassAdac.selectByIndex(rb.adultRoom, 2);	
		BaseClassAdac.selectByIndex(rb.childRoom, 3);	
        rb.search.click();
        rb.radioBtn.click();
        rb.continueBtn.click();
        rb.first.sendKeys("Sanmu");
        rb.last.sendKeys("Nambi");
        rb.address.sendKeys("Australia road 123 melbourne");
        rb.card.sendKeys("2222405343248877");
		BaseClassAdac.selectByValue(rb.cardType, "MAST");
		BaseClassAdac.selectByIndex(rb.cardExp, 3);
		BaseClassAdac.selectByValue(rb.cardExpYear,"2022");
		rb.cardCVV.sendKeys("567");
		rb.bookNow.click();
		System.out.println("2-Adult booked successfully");
	}
	@Then("To close the adactin browser")
	public void to_close_the_adactin_browser() {
	  BaseClassAdac.browserClose();
	}
}
