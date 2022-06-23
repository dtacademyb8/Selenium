package june22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDrop2 {


    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.manage().window().maximize();

        driver.get("https://javascript.info/mouse-drag-and-drop");


        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='https://en.js.cx/article/mouse-drag-and-drop/ball3/']")));

        WebElement ball = driver.findElement(By.id("ball"));



        new Actions(driver).dragAndDropBy(ball, 100, 100).build().perform();


    }


}
