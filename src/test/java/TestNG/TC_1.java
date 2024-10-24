package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


  @Test(dataProvider = "dp")
  public class TC_1 {

	    WebDriver driver;

	    // Test method that runs the login test with different sets of credentials
	    @Test(dataProvider = "dp")
	    public void f(String username, String password) throws InterruptedException {
	        System.out.println("This is the test");
	        
	        // Enter email and password
	        driver.findElement(By.id("input-email")).sendKeys(username);
	        driver.findElement(By.id("input-password")).sendKeys(password);
	        
	        // Click login button
	        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	        
	        // Adding a wait time for login to complete
	        Thread.sleep(20000); 
	    }

	    // DataProvider supplies data (username and password) to the test method
	    @DataProvider(name = "dp")
	    public Object[][] dp() {
	        return new Object[][] {
	            {"jhasachin2025@gmail.com", "Opencart@2025"},  // Correct credentials
	            {"testuser@example.com", "incorrectPassword"}       // Incorrect credentials for negative testing
	        };
	    }

	    // This method runs before every test method
	    @BeforeMethod
	    public void beforeMethod() {
	        // Setting up Edge browser using WebDriverManager
	        WebDriverManager.edgedriver().setup();
	        driver = new EdgeDriver();
	        
	        // Maximize the browser window and navigate to the login page
	        driver.manage().window().maximize();
	        driver.get("https://demo.opencart.com/en-gb?route=account/login");
	        
	        System.out.println("This is the @BeforeMethod");
	    }

	    // This method runs after every test method
	    @AfterMethod
	    public void afterMethod() {
	        System.out.println("This is the @AfterMethod");
	        
	        // Close the browser after each test
	        driver.quit();
	    }

	    // This method runs before the first test method in the current class
	    @BeforeClass
	    public void beforeClass() {
	        System.out.println("This is the @BeforeClass");
	    }

	    // This method runs after the last test method in the current class
	    @AfterClass
	    public void afterClass() {
	        System.out.println("This is the @AfterClass");
	    }

	    // This method runs before any test method in the current suite is executed
	    @BeforeTest
	    public void beforeTest() {
	        System.out.println("This is the @BeforeTest");
	    }

	    // This method runs after all test methods in the current suite have run
	    @AfterTest
	    public void afterTest() {
	        System.out.println("This is the @AfterTest");
	    }

	    // This method runs before the entire test suite starts
	    @BeforeSuite
	    public void beforeSuite() {
	        System.out.println("This is the @BeforeSuite");
	    }

	    // This method runs after the entire test suite ends
	    @AfterSuite
	    public void afterSuite() {
	        System.out.println("This is the @AfterSuite");
	    }
	}