package pages;
/*
 * This is for Login or Home Page 
 * 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	
	
	public LoginPage()
	{
		//PageFactory.initElements(driver, this);
		super();
	}
	
	// WebElements or Variables 
	// we use Page Factory 
	
	//WebElement usernameTextbox = driver.findElement(By.xpath("input[@name='username']"));
	
	//for username textbox
	@FindBy(xpath="//input[@name='username']") 	
	WebElement usernameTextbox;
	
	@FindBy(xpath="//input[@name='password']") 	
	WebElement passwordTextbox;
	
	@FindBy(xpath="//input[@name='login']") 	
	WebElement loginButton;
	
	@FindBy(xpath="//a[text()='Forgot Password?']") 	
	WebElement forgotPasswordLink;
	
	public void usernameTextbox(String text)
	{
		//usernameTextbox.sendKeys(text);
		type(usernameTextbox, text);
	}
	
	public void passwordTextbox(String text)
	{
		//passwordTextbox.sendKeys(text);
		type(passwordTextbox, text);
	}
	
	public void loginButton()
	{
		//loginButton.click();
		click(loginButton);
	}
    
	
	//Methods 
	
	public void login()
	{
		type(usernameTextbox, configProp.getProperty("username"));
		type(passwordTextbox, configProp.getProperty("password"));
		click(loginButton);
	}

}
