package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(xpath="//button[@data-testid=\"royal_login_button\"]")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}
	
	//business
	
	public void login(String username, String pass) 
	{	
		email.sendKeys(username);
		password.sendKeys(pass);
		loginBtn.click();
		
	}

}
