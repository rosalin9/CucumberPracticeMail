package com.cucumber.steps;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStep 
{
	WebDriver driver;
	HashMap<String, By> ObjectRepo;
	
	@Given("User launch the application")
	public void user_launch_the_application() {
		if(driver==null)
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://selenium-prd.firebaseapp.com/");
		}
	}
	
	@Then("User enter the user name")
	public void user_enter_the_username() {
	   WebElement username = driver.findElement(By.id("email_field"));
	   username.sendKeys("admin123@gmail.com");
	}
	
	@Then("User enter the password")
	public void user_enter_the_password() {
		WebElement password = driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
	}
	
	@Then("User enter the username {string}")
	public void user_enter_the_username(String strusername) {
		WebElement username = driver.findElement(By.id("email_field"));
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(username));
		   username.sendKeys(strusername);
	}
	
	@Then("User enter the password {string}")
	public void user_enter_the_password(String strpassword) {
		WebElement password = driver.findElement(By.id("password_field"));
		password.sendKeys(strpassword);
	}
	
	@Then("User click on login button")
	public void user_click_on_login_button() {
		WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		login.click();
	}
	
	@Then("User click on home button")
	public void user_click_on_home_button() {
		WebElement home = driver.findElement(By.xpath("//a[text()='Home']"));
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(home));
		home.click();
	}
	
	public WebElement getelement(String key)
	{
		ObjectRepo = new HashMap<String, By>();
		ObjectRepo.put("username", By.id("email_field"));
		ObjectRepo.put("password", By.id("password_field"));
		By object = ObjectRepo.get(key);
		return driver.findElement(object);
	}
	@After
	public void closeBrowser()
	{
		driver.close();
		driver=null;
	}
	
}
