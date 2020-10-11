package stepDefs;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.FirefoxBinary;
import static org.testng.Assert.assertEquals;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	WebDriver driver;
	
	@Given("^Browser is launched and user is on application page$")
	public void set_up() throws Throwable {
		
		
		
	/***************************** Block of code to execute in Chrome Browser***************************/   
		try {
			
			System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
    		FirefoxBinary firefoxBinary = new FirefoxBinary();
    		firefoxBinary.addCommandLineOptions("--headless");
    	    FirefoxProfile profile=new FirefoxProfile();
    	    //profile.setPreference("marionette.logging", "TRACE");
    		FirefoxOptions firefoxOptions = new FirefoxOptions();
    		firefoxOptions.setBinary(firefoxBinary);
    		firefoxOptions.setProfile(profile);
    	    driver=new FirefoxDriver(firefoxOptions);
    	    //System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	//	driver = new ChromeDriver();
			 			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	   
	    driver.get("http://webapps.tekstac.com/CucumberHostelFeeCalc/");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	/**************************************************************************************************/
	
		/**************************** Code to execute in Firefox **************************************/
		/*driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://apps.qa2qe.cognizant.e-box.co.in/CucumberHostelFeeCalc/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
	/*****************************************************************************************************/	
		
	    
	}
	
	@When("^User Enters student name,\"([^\"]*)\",\"([^\"]*)\"$")
	public void enter_details(String student_type, String no_of_rooms) throws Throwable {
	   driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[2]/td[2]/input["+student_type+"]")).click();
	   driver.findElement(By.xpath("//tr[3]//input[@id='number']")).sendKeys(no_of_rooms);
		 
	}
	
	@When("^User clicks on the calculate fee  button$")
	public void submit_details() throws Throwable {
	   driver.findElement(By.id("getFee")).click();
	}
	
	@Then("^\"([^\"]*)\" ,\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" should be correctly displayed$")
	public void verify_details(String college_fee, String hostel_fee, String additional_fee,String total_fee) throws Throwable {
	   String actcollegefee = driver.findElement(By.xpath("//*[@id='feeTable']/tbody/tr[1]/td[2]")).getText();
	  String acthostelfee = driver.findElement(By.xpath("//*[@id='feeTable']/tbody/tr[2]/td[2]")).getText();
	  String actadditionalfee = driver.findElement(By.xpath("//*[@id='feeTable']/tbody/tr[3]/td[2]")).getText();
	  String acttotalfee = driver.findElement(By.xpath("//*[@id='feeTable']/tbody/tr[4]/td[2]")).getText();
	  assertEquals(actcollegefee, college_fee);
	  assertEquals(acthostelfee, hostel_fee);
	  assertEquals(actadditionalfee,additional_fee);
	  assertEquals(acttotalfee,total_fee);
	 
	}
	
	@After
	public void tearDown() {
		
		driver.close();
	}

}