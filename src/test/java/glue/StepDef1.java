package glue;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.core.gherkin.Scenario;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef1 
{
	public Scenario s;
	ChromeDriver driver;
 @Given("^open browser$")
 public void method2()
 {
	 WebDriverManager.chromedriver().setup();
	 ChromeDriver driver=new ChromeDriver();
 }
}
