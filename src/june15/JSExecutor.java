package june15;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JSExecutor {

    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.amazon.com/");

//        driver.findElement(By.xpath("//a[@href='https://music.amazon.com?ref=nav_youraccount_cldplyr']")).click();

        WebElement link = driver.findElement(By.xpath("//a[@href='https://music.amazon.com?ref=nav_youraccount_cldplyr']"));

        JavascriptExecutor js = (JavascriptExecutor)driver;

//        js.executeScript("arguments[0].click();", link);  // click on a webelement that is inactive or invisible

//        js.executeScript("document.getElementById('twotabsearchtextbox').value='Hello';");




//        Utility.jsSendKeys(driver, "input[aria-label='Search']", "mdcbsdvcdsvjcdsv");

////        js.executeScript("history.go(0)");
//
////        js.executeScript("window.scrollBy(0,100500)");
////        js.executeScript("window.scrollBy(0,-1000)");
//
//        Utility.scrollByElement(driver, driver.findElement(By.xpath("//a[.='Careers']")));





    }
}
