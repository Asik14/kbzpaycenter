package org.Flows;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


	public class FlipkartLoginTest {

	    WebDriver driver;

	    @BeforeClass
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }

	    @Test
	    @Epic("User Management")
	    @Feature("Login")
	    @Story("Valid Login")
	    @Severity(SeverityLevel.BLOCKER)
	    @Description("Verify Flipkart login with valid credentials")
	    public void loginTest() {

	        Allure.step("Open Flipkart login page");
	        driver.get("https://www.flipkart.com/");

	        Allure.step("Enter username (mobile/email)");
	        WebElement username = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	        username.sendKeys("Iphone 16"); // 🔹 Replace with real data

	        Allure.step("Enter password");
	        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	        password.sendKeys("your_password"); // 🔹 Replace with real data

	        Allure.step("Click Login button");
	        WebElement loginBtn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	        loginBtn.click();

	        Allure.step("Validate successful login by checking account section");
	        WebElement accountMenu = driver.findElement(By.xpath("//div[contains(text(),'My Account') or contains(text(),'Your Account')]"));
	        Assert.assertTrue(accountMenu.isDisplayed(), "Login failed - Account menu not visible");
	    }

	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}


	
	

