package stepdefination;

import javax.swing.text.html.parser.Element;

import com.adactin.Baseclass.Baseclass;

import PageObjectManager.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends Baseclass {
	PageObjectManager obj = new PageObjectManager(driver);
	@Given("User open the Chrome")
	public void user_open_the_chrome() {
		browserLaunch();
	}
	@Given("User enter the navigate")
	public void user_enter_the_navigate() {
		getUrl("https://adactinhotelapp.com/");                           
	}

	@Given("User enter the UserName")
	public void user_enter_the_user_name() {
	   elementSendkeys(obj.getLogin().getUsername(), "Anbarasananbu143");
	   
	}
	@Given("User enter the PAssword")
	public void user_enter_the_p_assword() {
	   elementSendkeys(obj.getLogin().getPassword(), "anbu@12345");
	   
	}

@When("User click the login button")
public void user_click_the_login_button() {
	   elementClick(obj.getLogin().getLogin());

}
  
	
	@Then("Login Successfull")
	public void login_successfull() {
	   
	   
	}
	//2scenario

@Given("User click the Select location")
public void user_click_the_select_location() {
	SelectDropdown(obj.getSearch().getLocation(), "index", "7");
   

}
@Given("User click the select Hotel")
public void user_click_the_select_hotel() {
   SelectDropdown(obj.getSearch().getHotels(), "text", "Hotel Sunshine");

}
@Given("User select the Room Type")
public void user_select_the_room_type() {
 SelectDropdown(obj.getSearch().getRoom_type(), "text", "Super Deluxe");  

}
@Given("User select number of rooms")
public void user_select_number_of_rooms() {
  SelectDropdown(obj.getSearch().getRoom_nos(), "text", "2 - Two"); 

}
@Given("User check In date")
public void user_check_in_date() {
 elementSendkeys(obj.getSearch().getDatepick_in(), "24/01/2022");  

}
@Given("User check out date")
public void user_check_out_date() {
  elementSendkeys(obj.getSearch().getDatepick_out(), "26/01/2022");

}
@Given("Select adults per Room")
public void select_adults_per_room() {
   SelectDropdown(obj.getSearch().getAdult_room(), "text", "2 - Two");

}
@Given("Select Child per Room")
public void select_child_per_room() {
   SelectDropdown(obj.getSearch().getChild_room(), "text", "0 - None");

}
@Then("User enter the search button")
public void user_enter_the_search_button() {
	elementClick(obj.getSearch().getSubmit());
   
}
//3 scenario

@Given("User select the Hotel")
public void user_select_the_hotel() {
elementClick(obj.getSelectHotel().getRadiobutton_0());
}
@Then("User click the continue button")
public void user_click_the_continue_button() {
elementClick(obj.getSelectHotel().getContinue_Btn());
}
//4scenario
@Given("User Enter the First Name")
public void user_enter_the_first_name() {
elementSendkeys(obj.getBook().getFirst_name(), "S.Anbarasan");

}
@Given("User Enter the last Name")
public void user_enter_the_last_name() {
elementSendkeys(obj.getBook().getLast_name(), "raj");

}
@Given("User Enter the Address")
public void user_enter_the_address() {
	elementSendkeys(obj.getBook().getAddress(), "5816,TNHB,Ayyapakkam");

}
@Given("User Enter the Credit Number")
public void user_enter_the_credit_number() {
	elementSendkeys(obj.getBook().getCc_num(), "1122334455667788");


}
@Given("User click the credit Card type")
public void user_click_the_credit_card_type() {
SelectDropdown(obj.getBook().getCc_type(), "text", "American Express");

}
@Given("User Enter the Expiry Month")
public void user_enter_the_expiry_month() {
SelectDropdown(obj.getBook().getCc_exp_month(), "text", "March");

}
@Given("User Enter the Expiry Year")
public void user_enter_the_expiry_year() {
SelectDropdown(obj.getBook().getCc_exp_year(), "text", "2022");

}
@Given("User Enter the cvv number")
public void user_enter_the_cvv_number() {
elementSendkeys(obj.getBook().getCc_cvv(), "1234");

}

@Then("User click the booknow button")
public void user_click_the_booknow_button() {
	elementClick(obj.getBook().getBook_now());
}








}
