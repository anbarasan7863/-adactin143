package com.adactin.Baseclass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	public static WebDriverWait wait; 
	public static void browserLaunch() {
		try {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			//ooWebDriverWait wb = new WebDriverWait(driver, Duration.ofSeconds(20));
		} catch (Exception e) {
			System.err.println("browserLaunch error :" +e);		}
	}
	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			System.out.println("invalid url :"+e);
		}
	}
	public static void elementSendkeys(WebElement element,String sendkeys) {
		try {
			element.sendKeys(sendkeys);
		} catch (Exception e) {
			System.out.println("invalid Sendkeys :"+e);
		}
	}
	public static void elementClick(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			System.out.println("element didnt click btn :"+e);
		}
	}
	public static  void SelectDropdown(WebElement element , String option , String value ) {
		Select sc = new Select(element)	;
		if(option.equals("value")) {
			sc.selectByValue(value);
		}else if (option.equals("text")) {
			sc.selectByVisibleText(value);
		}else if (option.equals("index")) {
			sc.selectByIndex(Integer.parseInt(value));
		}

	}}
