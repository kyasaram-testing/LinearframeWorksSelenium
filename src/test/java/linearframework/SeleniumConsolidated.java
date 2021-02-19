package linearframework;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumConsolidated 
{

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name");
		String bn=sc.nextLine();
	  //Declare object 
		RemoteWebDriver driver = null;
		//open browser
		if(bn.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
		      driver=new ChromeDriver();		      
		}
		else if(bn.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
		      driver=new FirefoxDriver();
		}
		else if(bn.equalsIgnoreCase("opera"))
		{
			WebDriverManager.operadriver().setup();
		      driver=new OperaDriver();
		}
		else if(bn.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
		      driver=new EdgeDriver();
		}
		else if(bn.equalsIgnoreCase("ie"))
		{
			WebDriverManager.iedriver().setup();
		      driver=new InternetExplorerDriver();
		}
		else 
		{
			System.out.println("Enter correct browser name");
			System.exit(0);
		}
		
		//launch site
		driver.get("https://www.google.com");
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		driver.findElement(By.name("q")).sendKeys("virat"," kholi",Keys.ENTER);
		Thread.sleep(3000);
		
		// close site
		driver.close();
		
	}

}
