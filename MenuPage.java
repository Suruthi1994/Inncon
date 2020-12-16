package Application.LennoxApp;

public class MenuPage {

	WebDriver driver;
	public MenuPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By uName = By.id("j_username");
	
	By password = By.id("j_password");
	
	By signinbtn = By.id("loginSubmit");
	
	
	public void enteruname(String user) {
		
		driver.findElement(uName).sendKeys("lenproautomation8@lenqat.com");
	}
	
public void password(String pass) {
		
		driver.findElement(password).sendKeys("Community17");
	}

public void clicksignin() {
	
	driver.findElement(signinbtn).click();
}

}
