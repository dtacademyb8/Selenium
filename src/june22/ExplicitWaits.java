package june22;

import june15.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ExplicitWaits {


    public static void main(String[] args) throws InterruptedException {




         // Explicit waits are applicable to specific element and specific condition

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();



        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//*[.='Remove']")).click();

//
        long start =  System.currentTimeMillis();
//        Thread.sleep(5000);  //static wait

//        WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(5));     // explicit wait
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));

        Utility.waitForElementToBeVisible(driver, 5, By.id("message"));

        long end =  System.currentTimeMillis();

        System.out.println("The wait time is " + (end - start));
        Assert.assertTrue(driver.findElement(By.id("message")).isDisplayed());






    }
}
