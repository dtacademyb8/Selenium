package june15;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DropdownsNotSlect {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.spirit.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[contains(@class, 'city-selection left align-items-start d-flex flex-column ng-tns-c191')]")).click();

        //ElementClickInterceptedException: element click intercepted: Element is not clickable at point (495, 1075)

        // Happens when an element is covered by another element. The easiest solution is to use JavaScriptExecutor


        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)", "");

        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//p[.=' Bogota, Colombia ']/parent::div")));





    }
}
