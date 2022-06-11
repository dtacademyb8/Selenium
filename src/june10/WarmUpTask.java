package june10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class WarmUpTask {


    public static void main(String[] args) throws InterruptedException {




        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.facebook.com/");

        driver.findElement(By.name("email")).sendKeys("yaziciamine@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("123abc");
        driver.findElement(By.name("login")).click();


        Thread.sleep(2000);
//        String expectedErrorText = ;

        WebElement element = driver.findElement(By.xpath("//div[contains( text(), 'entered is incorrect. ')]"));
        Assert.assertTrue(element.isDisplayed());


    }
}
