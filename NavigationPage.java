package Application.LennoxApp;

public class NavigationPage {

	
	WebDriver driver;
	public NavigationPage(WebDriver driver) {
		this.driver=driver;
}
	By navigation = By.class("far fa-bars v2-hamburger-menu");
	
	By Salesbtn = By.class("btn-v2");
	
	By Proposal = By.xpath(//div[@class='col-md-4 level-1-title']/div/div[2]/div/col-md-12 level-2-title);
	
	public void navigationclick() {
		
		driver.find(navigation).click();
		
	}
	
	public void Salesbtn() {
		
		driver.find(Salesbtn).click();
		
	}
	
	public void Proposal()
{

		
		driver.find(Proposal).click();
		
		driver.findElement(By.class("LACKS_AUTHENTICATION button button-default create-lead-btn")).click();
}
}
