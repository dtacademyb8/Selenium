package june8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class BasicLocators {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();


        driver.manage().window().maximize(); // maximizes the window

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));  // dynamic wait


        driver.get("https://www.instagram.com/");  //Load a new web page in the current browser window

//        Thread.sleep(4000);


        // You can store the result of findElement() method into a WebElement object and call methods on it

//        WebElement usernameField = driver.findElement(By.name("username"));
//        WebElement passField = driver.findElement(By.name("password"));
//
//        usernameField.sendKeys("adamsmith");
//        passField.sendKeys("12345678890" + Keys.ENTER);

        // Alternatively, you can chain the methods
        driver.findElement(By.name("username")).sendKeys("adamsmith");
        driver.findElement(By.name("password")).sendKeys("12345678890" + Keys.ENTER);
//        driver.findElement(By.id())

        Thread.sleep(1000); //static wait

        String expectedErrorText = "Sorry, your password was incorrect. Please double-check your password";

        Assert.assertTrue(driver.getPageSource().contains(expectedErrorText));





    }
}
