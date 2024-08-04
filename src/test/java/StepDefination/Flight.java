package StepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Flight {
	WebDriver driver;
	@Given("User navigates on flight Page")
	public void user_navigates_on_flight_page() throws Exception {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
	}

	@Given("clicks types")
	public void clicks_types() {
	    driver.findElement(By.xpath("//input[@value='oneway']")).click();
	}

	@Given("Select passenger count")
	public void select_passenger_count() {
		driver.findElement(By.xpath("//select[@name='passCount']")).sendKeys("3");
	   
	   
	}

	@Given("Select Departing From Country")
	public void select_departing_from_country() {
	    WebElement D_Country=driver.findElement(By.xpath("//select[@name='fromPort']"));
	    Select Country=new Select(D_Country);
	    Country.selectByVisibleText("London");
	  
	}

	@Given("Select Departing on Date")
	public void select_departing_on_date() {
	   WebElement Dmonth= driver.findElement(By.xpath("//select[@name='fromMonth']"));
	  Select Month=new Select(Dmonth);
	  Month.selectByIndex(5);
	  WebElement D_Date=driver.findElement(By.xpath("//select[@name='fromDay']"));
	  Select Day=new Select(D_Date);
	  Day.selectByIndex(16);
	 
	 }
	
	@Given("Select Arriving in Country")
	public void select_arriving_in_country() {
	    WebElement A_Country=driver.findElement(By.xpath("//select[@name='toPort']"));
	    Select ACountry=new Select(A_Country);
	    ACountry.selectByValue("Paris");
	    
	}

	@Given("Select Returning on Date")
	public void select_returning_on_date() {
		 WebElement Rmonth= driver.findElement(By.xpath("//select[@name='toMonth']"));
		  Select Month=new Select(Rmonth);
		  Month.selectByIndex(7);
		  WebElement R_Date=driver.findElement(By.xpath("//select[@name='toDay']"));
		  Select Day=new Select(R_Date);
		  Day.selectByIndex(12);
	}

	@Given("Selecting Preference Service Class")
	public void selecting_preference_service_class() {
		 driver.findElement(By.xpath("//input[@value='Business']")).click();
	}

	@Given("Selecting Airelines")
	public void selecting_airelines() {
	   WebElement Aireline_S=driver.findElement(By.xpath("//select[@name='airline']"));
	   Select Airline_Service=new Select(Aireline_S);
	   Airline_Service.selectByVisibleText("Pangea Airlines");
	  
	}

	@Given("Click on Continue")
	public void click_on_continue() {
	    driver.findElement(By.xpath("//input[@name='findFlights']")).click();
	}

}
