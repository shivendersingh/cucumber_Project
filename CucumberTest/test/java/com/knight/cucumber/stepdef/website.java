package com.knight.cucumber.stepdef;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.knight.cucumber.Runner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class website extends Runner
{
	WebDriver driver=null;

	@Given("Open the chrome and launch the application")
	public void Open_the_chrome_and_launch_the_application() throws FileNotFoundException, IOException
	{
		//		WebDriverManager.chromedriver().version("79.0.3945.130").setup();
		//		ChromeOptions options = new ChromeOptions();
		Properties prop = new Properties();
		prop.load(new FileInputStream("E:/eclipse-new-ws/CucumberTest/application.properties"));
		String ch = prop.getProperty("Path");
		System.setProperty("webdriver.chrome.driver", ch);
		driver = new ChromeDriver();
		System.out.println("open chrome driver");
	}

	@When("Enter the url of a website")
	public void Enter_the_url_of_a_website()
	{
		driver.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googinabkvernac-21&ascsubtag=_k_Cj0KCQiAs67yBRC7ARIsAF49CdVaJkg2loVYbSMXK29U0ynbsvvWSbUQkY_3F56ygrQRwze1RWFRPeAaAuBmEALw_wcB_k_&ext_vrnc=hi&gclid=Cj0KCQiAs67yBRC7ARIsAF49CdVaJkg2loVYbSMXK29U0ynbsvvWSbUQkY_3F56ygrQRwze1RWFRPeAaAuBmEALw_wcB");
	}
	@Then("website should running")
	public void website_should_running() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
		System.out.println("website is running sucessfully");
	}
}
