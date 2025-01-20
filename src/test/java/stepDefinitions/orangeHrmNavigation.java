package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import pages.orangeHrmLoginPage;
import pages.orangeHrmDashboardPage;

public class orangeHrmNavigation {

	public WebDriver driver;
	
//	public orangeHrmNavigation() {
//		// TODO Auto-generated constructor stub
//	}
	
	
    //no need of super(driver);

	orangeHrmLoginPage orangeHrmLoginPage = new orangeHrmLoginPage(driver);
	orangeHrmDashboardPage orangeHrmDashboard = new orangeHrmDashboardPage(driver);
	
	
	
    @Given(": We navigate to OrangeHrm website")
    public void navigateToOrangeHrm(){
    	orangeHrmLoginPage = orangeHrmLoginPage.navigateToOrangeHrmHomePage();
    }
    

    @When(": We enter the existing valid credentials and attempt a login")
    public void performLogin(){
    	orangeHrmDashboard = orangeHrmLoginPage.performLoginByExistingCredentials();
    }
    
    @Then(": We capture the application version")
    public void captureApplicationversion() {
    	orangeHrmDashboard.clickUserDropdown();
    	orangeHrmDashboard.clickAboutUser();
    	String appVersion = orangeHrmDashboard.getAppVersion();
    	System.out.println("App Version is :"+appVersion);
//    	driver.quit();
    }
    
	
	

}
