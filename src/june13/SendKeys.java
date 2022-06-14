package june13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SendKeys {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.facebook.com/");


        driver.findElement(By.xpath("//input[@aria-label='Email or phone number']")).
                sendKeys(
                 Keys.chord(Keys.SHIFT, "MajdAslan"), // to simulate pressing multiple keys at once

                Keys.TAB,
                "123564132456413256",
                Keys.ENTER);



    }



}
