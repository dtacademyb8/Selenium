package june20;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlert1 {


    public static void main(String[] args) throws InterruptedException {




        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");



        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(2000);


        //NoAlertPresentException: no such alert -> happens when you switch to a nonexisting alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //UnhandledAlertException: unexpected alert open: {Alert text : I am a JS Alert}
        driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();

    }
}
