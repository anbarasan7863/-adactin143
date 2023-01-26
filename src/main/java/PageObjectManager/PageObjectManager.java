package PageObjectManager;

import org.openqa.selenium.WebDriver;

import com.adactin.Baseclass.Baseclass;
import com.adactin.locator.Bookpage;
import com.adactin.locator.LoginPage;
import com.adactin.locator.SearchPage;
import com.adactin.locator.selectHotelPage;

public class PageObjectManager extends Baseclass {
	public PageObjectManager(WebDriver xdriver) {
this.driver= xdriver;
	}
	private LoginPage login;
	private SearchPage search;
	private selectHotelPage selectHotel;
	private Bookpage Book;
	public LoginPage getLogin() {
		if (login==null)
			login = new LoginPage(driver);
		return login;
	}
	public SearchPage getSearch() {
		if(search==null)
			search = new SearchPage (driver);
		return search;
	}
	public selectHotelPage getSelectHotel() {
		if(selectHotel==null)
			selectHotel = new selectHotelPage(driver);
			return selectHotel;
	}
	public Bookpage getBook() {
		if(Book==null)
			Book = new Bookpage(driver);
		return Book;
	}
}
