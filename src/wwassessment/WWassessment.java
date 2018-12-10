package wwassessment;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import wwassessment.FindAStudioPage;
import wwassessment.HomePage;

/**
 *
 * @author Amitoj
 */
public class WWassessment {

    /**
     * @param args the command line arguments
     */
    
 
    public static void main(String[] args) {
        WebDriver driver;
        HomePage homePage;
        FindAStudioPage findAStudioPage;
        
        //System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        System.setProperty("webdriver.firefox.marionette","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        driver = new FirefoxDriver();
        //driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        homePage = new HomePage(driver);
        
        homePage.navigateHomePage();
        
    }
    
}
