package GenricUtility;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class BaseClass {
	
	public WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void launchBrowser(String browser) throws Throwable 
	{
		FileUtil f=new FileUtil();
		//String browser=f.getDataFromProperty("browser");
		
		
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browser.equals("edge")) {
			driver=new EdgeDriver();
		}
		
		System.out.println("Browser is launched");
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
		System.out.println("Browser closed");
	}

}
