package june22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDrop {


    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.manage().window().maximize();

        driver.get("https://javascript.info/mouse-drag-and-drop");


        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/article/mouse-drag-and-drop/ball4/']")));

        WebElement ball = driver.findElement(By.id("ball"));

        WebElement gate = driver.findElement(By.id("gate"));

        new Actions(driver).dragAndDrop(ball, gate).build().perform();


    }


}
