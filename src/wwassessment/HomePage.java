package wwassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Amitoj
 */
public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void navigateHomePage(){
        driver.navigate().to("https://www.weightwatchers.com/us/");
    }
    
    public String pageTitle(){
        return driver.getTitle(); 
    }
    
    public void clickFindAStudio(){
        driver.findElement(By.className("menu-link__inner-wrapper")).click();
    }
}
