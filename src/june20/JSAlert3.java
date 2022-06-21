package june20;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JSAlert3 {


    public static void main(String[] args) throws InterruptedException {




        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");



        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Thread.sleep(2000);


        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Hello World");
        alert.accept();


        Assert.assertTrue(driver.findElement(By.id("result")).getText().contains("You entered: Hello World"));





    }
}
