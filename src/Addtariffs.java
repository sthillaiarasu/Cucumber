import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Addtariffs {
	static WebDriver driver;
	@Given("The user in add tariff plan pages")
	public void the_user_in_add_tariff_plan_pages() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M\\eclipse-1\\Cucumberfirst\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='addtariffplans.php'] [1]")).click();
	}

	@When("user will the validate traiffs")
	public void user_will_the_validate_traiffs(DataTable dataTable) {
		List<Map<String,String>> traiff = dataTable.asMaps(String.class,String.class);
		driver.findElement(By.id("rental1")).sendKeys(traiff.get(1).get("Mrental"));
		driver.findElement(By.id("local_minutes")).sendKeys(traiff.get(1).get("LMinute"));
		driver.findElement(By.id("inter_minutes")).sendKeys(traiff.get(2).get("Iminute"));
		driver.findElement(By.id("sms_pack")).sendKeys(traiff.get(2).get("smspack"));
		driver.findElement(By.id("minutes_charges")).sendKeys(traiff.get(1).get("Lpminutes"));
		driver.findElement(By.id("inter_charges")).sendKeys(traiff.get(0).get("IpMinute"));
		driver.findElement(By.id("sms_charges")).sendKeys(traiff.get(1).get("Smscharge"));
	}

	@When("add the traiff by click the submit")
	public void add_the_traiff_by_click_the_submit() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("congratulations traiff added")
	public void congratulations_traiff_added() {
	    
	}

}
