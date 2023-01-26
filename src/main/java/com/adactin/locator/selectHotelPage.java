package com.adactin.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.Baseclass.Baseclass;

public class selectHotelPage extends Baseclass{
	public selectHotelPage(WebDriver xdriver) {
	this.driver= xdriver;
	PageFactory.initElements(driver, this);
	}
@FindBy(name = "radiobutton_0")
private WebElement radiobutton_0;
@FindBy(name = "continue")
private WebElement continue_Btn;
public WebElement getRadiobutton_0() {
	return radiobutton_0;
}
public WebElement getContinue_Btn() {
	return continue_Btn;
}

}
