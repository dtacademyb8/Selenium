package june22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaits {


    public static void main(String[] args) {




        // flaky tests - test that fail occasionally due to various reasons, usually  because of synchronization


        // Static waits -> Thread.sleep() - Java method

        // Dynamic waits - Implicit and Explicit waits offered by Selenium


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        // Implicit wait is global , it applies all instances of findElement() method call
        // It is set once per driver session and will be applicable during the lifetime of the WebDriver
        // The default setting is 0
        driver.manage().window().maximize();

        driver.get("https://www.duotech.io/");

        driver.findElement(By.xpath("(//a[.='Blo'])[1]")).click();



    }
}
