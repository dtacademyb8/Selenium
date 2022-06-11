package june10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LocateByClassName {


    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.duotech.io/");

        driver.findElement(By.className("link-5")).click();
//        driver.findElement(By.className("link-5cbndsv")).click(); //NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":".link\-5cbndsv"}
//        driver.findElement(By.className("link-5 w--current")).click(); ///InvalidSelectorException: Compound class names not permitted


        Assert.assertTrue(driver.getTitle().contains("Welcome"));
    }

}
