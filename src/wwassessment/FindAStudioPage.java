package wwassessment;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Amitoj
 */
public class FindAStudioPage {
    WebDriver driver;

    public FindAStudioPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public String pageTitle(){
        return driver.getTitle(); 
    }
    
     public void serachLocations(String zip){
        driver.findElement(By.id("meetingSearch")).sendKeys(zip);
    }
     
    public void clickSubmit(){
        driver.findElement(By.className("btn spice-translated")).click();
    }
    
    public void getFirstResult(){
        List<WebElement> results = (List<WebElement>) driver.findElement(By.className("meeting-locations-list__item"));
        
        results.get(0).getText();
    }
    
    public void clickFirstResult(){
        List<WebElement> results = (List<WebElement>) driver.findElement(By.className("meeting-locations-list__item"));
        
        results.get(0).click();
    }
    
    public void printScheduleForDay(String expectedDay){
        List<WebElement> days = (List<WebElement>) driver.findElement(By.className("meeting-locations-list__item"));
        Map<String, Integer> names = new HashMap<>();
        names.clear();
        
        for (WebElement day : days){
            if (expectedDay.equals(driver.findElement(By.className("schedule-detailed-day-label")).getText())){
                List<WebElement> meetings = (List<WebElement>) driver.findElement(By.className("schedule-detailed-day-meetings-item"));
                for (WebElement meeting : meetings){
                    String name = meeting.findElement(By.className("schedule-detailed-day-meetings-item-leader")).getText();
                    
                    names.computeIfPresent("hello", (k, v) -> v + 1);
                }                        
            }
        }
        
        System.out.println(Collections.singletonList(names));
    }
}
