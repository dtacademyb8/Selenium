package june10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class LocateByTagName {


    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\selenium\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.duotech.io/");

        String expected = "Start New IT Career";
        String actual =   driver.findElement(By.tagName("h1")).getText();

        Assert.assertEquals(actual, expected);


        //tagname can be used to locate multiple elements of the same type with findElements

        List<WebElement> elementList = driver.findElements(By.tagName("a"));

        Assert.assertEquals(elementList.size(), 33);

        for (WebElement element : elementList) {
            System.out.println(element.getText());
        }
    }

}
