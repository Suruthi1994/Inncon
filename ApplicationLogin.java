package testcases.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Application.LennoxApp.LeadsPage;
import Application.LennoxApp.LoginPage;
import Application.LennoxApp.MenuPage;
import Application.LennoxApp.NavigationPage;
import excelExportAndFileIO.ExcelFile;

public class ApplicationLogin {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://liidaveqa.com");
		
		
	LoginPage login = new LoginPage(driver);
	
	MenuPage menu = new MenuPage(driver);
	
	NavigationPage navigation = new NavigationPage(driver);
	
	LeadsPage lead = new LeadsPage(driver);
	
	ExcelFile excel = new ExcelFile(driver);
	

	menu.clicksignin();
	
	menu.enteruname("enter username");
	menu.password("enter password");
	
	Thread.sleep(3000);
	
	lead.clicksave();
	
	
	}

}
