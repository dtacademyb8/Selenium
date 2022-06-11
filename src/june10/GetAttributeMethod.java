package june10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class GetAttributeMethod {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.facebook.com/");

        // Verify the placeholder is "Email or phone number"

        String expected = "Email or phone number";

        String actual = driver.findElement(By.id("email")).getAttribute("placeholder");

        System.out.println(actual);
        Assert.assertEquals(actual,expected);

        WebElement fb_logo = driver.findElement(By.className("fb_logo"));
        String attribute = fb_logo.getAttribute("src");

//        driver.get(attribute);


//        driver.findElement(By.id("email")).sendKeys("Hello World");

        System.out.println(driver.findElement(By.id("email")).getAttribute("value"));


        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link : links) {
            System.out.println(link.getAttribute("href"));
        }


    }
}
