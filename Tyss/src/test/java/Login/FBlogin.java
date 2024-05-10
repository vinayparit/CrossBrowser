package Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GenricUtility.BaseClass;
import GenricUtility.FileUtil;
import ObjectRepo.LoginPage;

public class FBlogin {

	public class FacebookLogin extends BaseClass {
		
		@Test
		public void loginToFB() throws Throwable
		{
			FileUtil f=new FileUtil();
			String username = f.getDataFromProperty("username");
			String password = f.getDataFromProperty("password");
			driver.get(f.getDataFromProperty("url"));
			LoginPage lp = new LoginPage(driver);
			lp.login(username, password);
		
//			driver.findElement(By.id("email")).sendKeys("shivkumar");
		}
		

	}

}
