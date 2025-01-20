package pages;

import org.openqa.selenium.WebDriver;
import pages.orangeHrmDashboardPage;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class orangeHrmLoginPage {
	
	public WebDriver driver;

    public orangeHrmLoginPage(WebDriver driver) {
//        super(driver);
        this.driver = driver;   }
    

    By pageHeader = By.xpath("//img[@alt='company-branding']");
    By usernameInput = By.xpath("//input[@name='username']");
    By passwordInput = By.xpath("//input[@name='password']");
    By loginButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button' and @type='submit']");

    String username = "Admin";
    String password = "admin123";

    public orangeHrmLoginPage navigateToOrangeHrmHomePage() {
    	 System.setProperty("webdriver.edge.driver","C:\\Users\\2000078341\\eclipse-workspace\\orangeHrm\\drivers\\msedgedriver.exe");

         WebDriver driver = new EdgeDriver();
         driver.manage().window().maximize();
         driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");   //("https://google.com");
         System.out.println("At OrangeHRM home page");
        try {
        	Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
         
         return new orangeHrmLoginPage(driver);
    }

    public orangeHrmDashboardPage performLoginByExistingCredentials(){
        driver.findElement(usernameInput).sendKeys(username);
        System.out.println("Entered Username");
        driver.findElement(passwordInput).sendKeys(password);
        System.out.println("Entered password");
        driver.findElement(loginButton).click();
        System.out.println("Clicked on login button");
        return new orangeHrmDashboardPage(driver);
    }
	

}
