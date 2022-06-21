package june20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Iframes {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.get("https://www.duotech.io/enroll-sqae2");



//        driver.switchTo().frame("1655774376678_179245844722511");  // by id or name if there is one


//        driver.switchTo().frame(0); // by zero based index

        WebElement iframeFirst = driver.findElement(By.xpath("//iframe[contains(@src, 'https://form.123formbuilder.com')]"));

        driver.switchTo().frame(iframeFirst);

        driver.findElement(By.xpath("//input[@placeholder='First']")).sendKeys("Lara");


        // switch back to the main window

        driver.switchTo().defaultContent();  // switches the context to the main window

        driver.switchTo().parentFrame(); // switches the context to the parent iframe

        System.out.println(driver.findElement(By.xpath("//h1[.='FALL-2022']")).getText());



    }
}
