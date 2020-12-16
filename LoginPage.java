package Application.LennoxApp;


public class LoginPage {


		WebDriver driver;
		public LoginPage(WebDriver driver) {
			this.driver=driver;
		}
		
		By Signin = By.linkText("signin");
		
		public void clickLogin() {
			driver.findElement Signin.click();
		}
		
}
		
	