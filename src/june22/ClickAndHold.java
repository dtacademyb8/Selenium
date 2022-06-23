package june22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ClickAndHold {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        driver.manage().window().maximize();

        driver.get("https://www.youtube.com/watch?v=L4qmDnYli2E");


        WebElement element = driver.findElement(By.xpath("//div[@class='ytp-scrubber-button ytp-swatch-background-color']"));



        Actions actions = new Actions(driver);
        actions.clickAndHold(element).moveByOffset(500,0).moveByOffset(100,0).moveByOffset(-400,0).release().build().perform();



    }
}
