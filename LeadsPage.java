package Application.LennoxApp;

public class LeadsPage {
	
	WebDriver driver;
	public LeadsPage(WebDriver driver) {
		this.driver=driver;
}

	By Addlead = By.class("fas fa-plus btn-left");
	
	By SaveLead = by.class("fas fa-save btn-left");
	
	
	public void Addlead() {
		
		driver.find(Addlead).click();
	}
	
	
	public void SaveLead() {
		
		driver.find(SaveLead).click();
	}
	
	}
}


