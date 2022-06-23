package june22;

import june15.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DoubleClickActions {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        driver.manage().window().maximize();

        driver.get("https://developer.mozilla.org/en-US/docs/Web/API/Element/dblclick_event");


        driver.switchTo().frame("frame_examples");


        WebElement aside = driver.findElement(By.xpath("//aside//h3[.='My Card']"));


        Utility.scroll(driver, 0, 1000);
        Actions actions = new Actions(driver);
        actions.doubleClick(aside).build().perform();
    }
}
