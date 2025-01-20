package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class orangeHrmDashboardPage {

	public WebDriver driver;
	
	public orangeHrmDashboardPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
//		super(driver);
		this.driver = driver;
	}

	By pageHeader = By.xpath("//div[@class='oxd-topbar-header-title']//span[@class='oxd-topbar-header-breadcrumb']//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");
	By userDropdown = By.xpath("//span[@class='oxd-userdropdown-tab']");
	By aboutButton = By.xpath("//ul[@class='oxd-dropdown-menu']//li//a[@role='menuitem' and @href='#']");
	By appVersion = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']//p[text()='OrangeHRM OS 5.7']");
	
	public void clickUserDropdown() {
		try {
        	Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
		driver.findElement(userDropdown).click();
		System.out.println("Clicked user dropdown");
	}
	
	public void clickAboutUser() {
		try {
        	Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
		driver.findElement(aboutButton).click();
		System.out.println("Clicked about button"); 
	}
	
	public String getAppVersion() {
		try {
        	Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
		String applicationVersion = driver.findElement(appVersion).getText();
		System.out.println("Captured application version");
		driver.quit();
		return applicationVersion;
	}
	
	

	
	
}
