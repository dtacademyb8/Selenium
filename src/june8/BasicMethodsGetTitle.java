package june8;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class BasicMethodsGetTitle {


    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();


        driver.get("https://www.google.com/");  //Load a new web page in the current browser window

        String actualTitle = driver.getTitle();

        String expectedTitle= "Google";

         Assert.assertEquals(actualTitle, expectedTitle);
//         Assert.assertTrue(true);
//         Assert.assertFalse(false);

        String expectedSearchTerm = "Selenium";
        driver.findElement(By.name("q")).sendKeys( expectedSearchTerm  + Keys.ENTER);

//        Assert.assertEquals(driver.getTitle(), expectedSearchTerm + "     - Google Search");

        Assert.assertTrue(driver.getTitle().contains(expectedSearchTerm ));



//


    }
}
