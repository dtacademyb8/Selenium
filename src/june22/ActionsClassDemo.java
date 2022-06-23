package june22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionsClassDemo {

    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

        Actions actions =  new Actions(driver);

        actions.keyDown(Keys.SHIFT)
                .sendKeys(driver.findElement(By.name("q")),"hello")
                .sendKeys(driver.findElement(By.name("q")),Keys.ENTER).keyUp(Keys.SHIFT)
                .build().perform();

        actions
                .sendKeys(driver.findElement(By.name("q")),"world")
                .build().perform();









    }
}
