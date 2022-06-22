package june22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaits2 {


    public static void main(String[] args) {




        // flaky tests - test that fail occasionally due to various reasons, usually  because of synchronization


        // Static waits -> Thread.sleep() - Java method

        // Dynamic waits - Implicit and Explicit waits offered by Selenium


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.manage().window().maximize();

        driver.get("https://www.instagram.com/");

        driver.findElement(By.name("username")).sendKeys("cdbghsvvsdghh");



    }
}
