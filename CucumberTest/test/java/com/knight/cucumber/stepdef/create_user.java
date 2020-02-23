package com.knight.cucumber.stepdef;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Config.configuration;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class create_user extends configuration
{

	WebDriver driver=null;
	public static String ch1=null;
	@Given("goto signup page")
	public void Open_the_chrome_and_launch_the_application() throws InterruptedException, FileNotFoundException, IOException
	{
		//WebDriverManager.chromedriver().version("79.0.3945.130").setup();
		//ChromeOptions options = new ChromeOptions();
		configuration.getproperties();
		System.setProperty("webdriver.chrome.driver", ch1);
		driver = new ChromeDriver();
		System.out.println("open chrome driver");
		driver.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googinabkvernac-21&ascsubtag=_k_Cj0KCQiA-bjyBRCcARIsAFboWg19ZJHjCfnF3a3DaYl4K0Dzbk-f4w3T1L3pkvixHdIBKFQOavbyBLIaAom0EALw_wcB_k_&ext_vrnc=hi&gclid=Cj0KCQiA-bjyBRCcARIsAFboWg19ZJHjCfnF3a3DaYl4K0Dzbk-f4w3T1L3pkvixHdIBKFQOavbyBLIaAom0EALw_wcB");
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		actions.moveToElement(target).perform();
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-newCust\"]/a")).click();
	}
	@When("^Enter the details as \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void Enter_the_details_as(String name, String phone, String email, String password) 
	{
		driver.findElement(By.id("ap_customer_name")).sendKeys(name);
		driver.findElement(By.id("ap_phone_number")).sendKeys(phone);
		driver.findElement(By.id("ap_email")).sendKeys("email");
		driver.findElement(By.id("ap_password")).sendKeys(password);
		//driver.findElement(By.id("continue")).click();
	}
	@And("click on continue button")
	public void click_on_continue_button () 
	{
		driver.findElement(By.id("continue")).click();
	}
	@Then("user is created")
	public void user_is_created() throws InterruptedException
	{
		//Thread.sleep(2000);
		driver.quit();
	}
}

