package june13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Clear {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.dice.com/");


        Thread.sleep(1000);
        driver.findElement(By.id("IPGeoLocateButton")).click();  // clciks in the center of the element
        // ElementClickInterceptedException is thrown when the click() method clicks in the center of the element and
        // another element gets the click()

        Thread.sleep(2000);
        driver.findElement(By.id("google-location-search")).clear();
        driver.findElement(By.id("google-location-search")).sendKeys("Washington DC");



    }



}
