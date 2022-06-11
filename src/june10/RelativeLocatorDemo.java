package june10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorDemo {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.facebook.com/");



//        By passBy =  RelativeLocator.with(By.tagName("input")).below(By.id("email"));
//        driver.findElement(passBy).sendKeys("cdbsvghvhcvsdhgsv");

        driver.findElement(with(By.tagName("input")).above(By.id("pass"))).sendKeys("cdbsvghvhcvsdhgsv");







    }
}
