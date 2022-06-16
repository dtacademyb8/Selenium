package june15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class WarmUpTask {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.dice.com/");

        driver.findElement(By.id("typeaheadInput")).sendKeys("SDET");
        driver.findElement(By.id("google-location-search")).sendKeys("Washington DC");
        driver.findElement(By.id("submitSearch-button")).click();

        List<WebElement> elements = driver.findElements(By.xpath("//a[@data-cy='card-title-link']"));

        Assert.assertEquals(20 ,elements.size());

//        List<String> hello=new ArrayList<>();

//        for (WebElement element : driver.findElements(By.xpath("//a[@data-cy='card-title-link']"))) {
////           Assert.assertTrue(element.getText().contains("SDET"));
//
//            element.click();
//            driver.navigate().back();
////            driver.navigate().refresh();
//
//        }


        for (int i = 0; i < elements.size(); i++) {
            List<WebElement> list = driver.findElements(By.xpath("//a[@data-cy='card-title-link']")); // to grab the fresh list
            list.get(i).click();
            Assert.assertTrue(driver.getTitle().contains("SDET"));
            driver.navigate().back();
        }


        //StaleElementReferenceException -> happens when we store an element or list of elements on the page,
        //                                  then navigate away from the page and come back to the  page and try to use the previous(old/stale) reference to the element
        // How do you prevent it? -> 1. Refresh the page 2. Locate the webelement/list of webelements again


//        for (int i = 0; i <hello.size() ; i++) {
//            hello.get(i).contains("SDET");
//
//        }
//        Thread.sleep(3000);



//        Assert.assertTrue(driver.getTitle().contains("SDET"));

        driver.quit();

    }
}
