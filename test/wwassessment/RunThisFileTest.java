/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wwassessment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import wwassessment.FindAStudioPage;
import wwassessment.HomePage;

/**
 *
 * @author Amitoj
 */
public class RunThisFileTest {
    static WebDriver driver;
    static HomePage homePage;
    static FindAStudioPage findAStudioPage;
   
    /*public RunThisFileTest() {
        WebDriver driver;
        HomePage homePage;
        FindAStudioPage studioPage; 
    }*/
    
    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        //findAStudioPage = new FindAStudioPage(driver); 
        
        homePage.navigateHomePage();
    }
    
 /*   @After
    public void tearDown() {
        driver.close();
    }
*/
    /**
     * Test of navigateHomePage method, of class HomePage.
     */

    /**
     * Test of pageTitle method, of class HomePage.
     */
    @Test
    public void testPageTitle() {
        System.out.println("Home Page Title Test");
        String expResult = "WW (Weight Watchers): Weight Loss & Wellness Help";
        String result = homePage.pageTitle();
        assertEquals(expResult, result);
    }
  
    
    /**
     * Test of clickFindAStudio method, of class HomePage.
     */
    @Test
    public void testClickFindAStudio() {
        System.out.println("clickFindAStudio");
        HomePage instance = null;
        instance.clickFindAStudio();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of serachLocations method, of class FindAStudioPage.
     */
    @Test
    public void testSerachLocations() {
        System.out.println("serachLocations");
        String zip = "";
        FindAStudioPage instance = null;
        instance.serachLocations(zip);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clickSubmit method, of class FindAStudioPage.
     */
    @Test
    public void testClickSubmit() {
        System.out.println("clickSubmit");
        FindAStudioPage instance = null;
        instance.clickSubmit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstResult method, of class FindAStudioPage.
     */
    @Test
    public void testGetFirstResult() {
        System.out.println("getFirstResult");
        FindAStudioPage instance = null;
        instance.getFirstResult();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clickFirstResult method, of class FindAStudioPage.
     */
    @Test
    public void testClickFirstResult() {
        System.out.println("clickFirstResult");
        FindAStudioPage instance = null;
        instance.clickFirstResult();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printScheduleForDay method, of class FindAStudioPage.
     */
    @Test
    public void testPrintScheduleForDay() {
        System.out.println("printScheduleForDay");
        String expectedDay = "";
        FindAStudioPage instance = null;
        instance.printScheduleForDay(expectedDay);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
