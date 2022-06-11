package june10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

public class GetCSSValueMethod {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.facebook.com/");

        driver.findElement(By.name("email")).sendKeys("yaziciamine@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("123abc");
        driver.findElement(By.name("login")).click();


        Thread.sleep(2000);


        String expected = "#f02849";

        String actualColor = driver.findElement(By.className("_9ay7")).getCssValue("color");

        String colorAsHex = Color.fromString(actualColor).asHex();

        System.out.println(colorAsHex);

        Assert.assertEquals(colorAsHex,expected);

        System.out.println(driver.findElement(By.className("_9ay7")).getCssValue("font-family"));
        System.out.println(driver.findElement(By.className("_9ay7")).getCssValue("font-size"));
    }
}
